import java.util.Scanner;

public class compilerParser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t != 0) {
            String str = sc.next();

            int add = 0, pos = 0, total = 0;

            for (int i = 0; i < str.length(); i++) {
                String temp = String.valueOf(str.charAt(pos));
                pos++;

                if (temp.equals("<")) {
                    add++;
                } else {
                    add--;
                }

                if (add < 0) {
                    break;
                }

                if (add == 0) {
                    total = pos;

                }
            }

            System.out.println(total);

            t--;
        }
    }

}

