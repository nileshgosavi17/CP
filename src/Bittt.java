import java.util.Scanner;

public class Bittt {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int result=0;
        String a=new String();

        while (t-- >0){
             a = s.next();
            if (a.charAt(1)=='+') {

                result++;
            } else {
                result--;
            }
        }
        System.out.println(result);
    }
}
