package com.company;

public class quickSort {

    public static void main(String[] args) {
        int [] arr= new int[10];
        int high= arr.length;Qsort(arr,0,high);


    }
    public static int partion(int a[],int l,int h){
        int pivot =a[l];
        int i=l;int j=h;
        while(i<j){
while (a[i]<=pivot)i++;
while (a[i]>pivot)j--;
if (i <j){
    swap(a,i,j);
        }
    }
        swap(a,j,l);
        return j;
}
    public static void swap(int a[],int i, int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void Qsort (int a[], int l, int h){
        if(l<h){
            int pivot = partion(a,l,h);
            Qsort(a,l,pivot-1);
            Qsort(a,pivot+1,h);
        }
    }

}
