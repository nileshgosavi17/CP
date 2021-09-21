import java.util.Scanner;

public class Rverser_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long[] arr = new long[(int) n];
        for (long i = 0; i < n; i++) {
            arr[(int) i] = s.nextLong();
        }
        for (long i = 0; i < n; i++) {
            System.out.print(arr[(int) (n -1- i)]+" ");
        }
    }
}

