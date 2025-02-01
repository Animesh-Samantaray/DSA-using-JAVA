
import java.util.Scanner;

public class occurance {
    static  Scanner sc=new Scanner(System.in);

    static void search(int n,int[]arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)
            count++;
        }
        System.out.println("\n"+n + "-> "+count+" times ");
    }


    
    static  void take(int[] arr , int n){
        
        System.out.println("enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    static void print(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the array size : ");
        n=sc.nextInt();
        int a[]=new int[n];
    
        take(a,n);
        System.out.println("\n\nARRAY IS ");
        print(a);

        int c;
        for (int i = 0; i < a.length; i++) {
        c=a[i];
        search(c,a);
            }
       
    }
}
