package CODE_CHEF;

import java.util.Scanner;

public class isBothOrNot {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        long n=Sc.nextLong();
        if(n%5==0 && n%11==0) System.out.println("BOTH");
        else if(n%5==0 || n%11==0) System.out.println("ONE");
        else System.out.println("NONE");
    }
}
