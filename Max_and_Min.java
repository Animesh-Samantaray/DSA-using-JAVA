
import java.util.Scanner;

public class Max_and_Min {
    static Scanner sc=new Scanner(System.in);
    static int FindMax(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){ 
            if(max<a[i])
            max=a[i];
    }
        return max;
    }

    static int FindMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            min=arr[i];
        }
return min;
    }

    public static void main(String ar[]){
        int n;
        System.out.print("Enter size of the array : ");
        n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("\nEnter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=FindMax(arr);
        int min =FindMin(arr);
        System.out.println(" 1st max = "+max);
for(int i=0;i<arr.length;i++){
    if(arr[i]==max)
    arr[i]=0;
}
int max2=FindMax(arr);
System.out.println("second max = "+max2);
    }
    }

