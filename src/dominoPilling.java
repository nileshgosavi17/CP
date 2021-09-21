import java.util.Scanner;

public class dominoPilling {
     static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        int  m,n;
        m=s.nextInt();
        n=s.nextInt();
        System.out.println(((m*n)>>1));
    }

}
