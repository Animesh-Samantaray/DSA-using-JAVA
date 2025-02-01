
import java.util.Scanner;

public class SquareSort {
    static Scanner sc=new Scanner(System.in);

    void ArraySort(int[] a)
    {
    int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int n;
        System.out.print("Enter the array size : ");
        n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter "+n+" array elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\n before sort ");;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]*a[i];
        }
        SquareSort obj=new SquareSort();
        obj.ArraySort(a);
        System.out.println("\n After sort ");;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
