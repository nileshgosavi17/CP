import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=3, j = 3;
        int col=0, row = 0;

        for (int l = 1; l <=5; l++) {
            String str = s.nextLine().replace(" ", "");
            if (str.contains("1")) {
                row = l;
                col = str.indexOf("1") + 1;
                break;
            }
        }

        System.out.println(Math.abs(j-row)+Math.abs(i-col));
    }
}
