package com.company;

import java.util.Scanner;

public class Travel_Pass {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         long T= sc.nextLong();
        while(T-- >0){
                    long n,A,B;
                    n= sc.nextLong();
                    A= sc.nextLong();
                    B= sc.nextLong();
                    long res=0;
                    sc.next();
                    String arr= sc.next();
                    for(int i=0;i<n;i++){
                        if(arr.charAt(i)=='0'){
                            res+=A;
                        }
                        else{
                            res+=B;
                        }
                    }
            System.out.println(res);
        }
    }


}
