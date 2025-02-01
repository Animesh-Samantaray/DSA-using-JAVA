
import java.util.Scanner;

public class ArrayZeroOne {

     static Scanner sc=new Scanner(System.in);



static void print(int[] arr)
{
    System.out.println("\n Array is ");
    for (int idx = 0; idx < arr.length; idx++) {
        System.out.print(arr[idx]+" ");
    }
    System.out.println();
}



static int[] Sort(int[]arr)
{
    int zero=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0)
        zero++;
    }
    for(int i=0;i<zero;i++){
        arr[i]=0;
    }
    for(int i=zero;i<arr.length;i++){
        arr[i]=1;
    }
    return arr;
}


    public static void main(String[] args)
     {
        int size;
        System.out.print(" Please Enter Array Length   : ");
        size = sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements of only 0 and 1 : ");

       for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
       }
       int count=0;

       for (int idx = 0; idx < arr.length; idx++) {
        if(arr[idx]<0 || arr[idx] >1){
            count++;
        }
           
       }
       if(count==0){ 
       System.out.println("Before sorting ");
       print(arr);
       int[]brr=Sort(arr);
       System.out.println("After sorting ");
       print(brr);
       }

       else{
        System.out.println("\n\nYour array is not applicable ");
       }

    }
}
