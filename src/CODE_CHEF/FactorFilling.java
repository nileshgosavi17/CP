package CODE_CHEF;

import java.util.Scanner;

public class FactorFilling {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long n=s.nextLong();
        int count=0;
       for(int i=1;i<=n;i++){
           if(n%i==0){
               count ++;
               System.out.print(i+" ");
           }

       }
    }
}
