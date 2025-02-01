
import java.util.Scanner;

//import java.util.Scanner;
//import java.util.Arrays;

public class TargetSum {
    static Scanner sc=new Scanner(System.in);

        static  int[] createArray(int n)
        {
        int [] arr=new int[n];
        System.out.println("\n Enter array elelments : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt(); 
        }
        return arr;
        }

        static void print(int[] arr)
        {
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
//                           MAIN METHOD
    public static void main(String ar[])
    {
        int n,x,pair=0;
        System.out.print("Enter array size : ");
        n=sc.nextInt();
         int a[]=createArray(n);
         System.out.print("Array is : ");
         print(a);
         System.out.println("Enter the target number  : ");
         x=sc.nextInt();
         for(int i=0;i<n;i++)
         {
            for(int j=i;j<n;j++)
            {
                if(a[i]+a[j]==x)
                {
                    pair++;
                    System.out.println(" pair no- "+pair+" ---->  "+a[i]+" , "+a[j]);
                }
            }
         }
    }
}
