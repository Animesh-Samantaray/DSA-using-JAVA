import java.util.*;
public class k_rotation {
     public static Scanner sc=new Scanner(System.in);
static int[] rotate(int[] arr,int n){
    int limit=arr.length-n;
    int[] a=new int[limit];
    int[] b= new int[n];
    for(int i=0;i<limit;i++){
        a[i]=arr[i];
    }
    int k=0;
    for(int i=limit;i<arr.length;i++){
        b[k++]=arr[i];
        
    }
    for(int i=0;i<n;i++){
        arr[i]=b[i];
    }
    k=0;
    for(int i=n;i<arr.length;i++){
arr[i]=a[k];
k++;
    }
    return arr;
}
    public static void main(String[] args) {
        int n;
        System.out.print("Enter size of the array : ");
        n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("\nEnter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k;
        System.out.println("Enter the number of rotations : ");
        k=sc.nextInt();
        int y=k;
        k%=arr.length;
        System.out.println("Before rotation array was : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] brr=rotate(arr,k);
        System.out.println();
        System.out.println("After  "+y+ " rotation array was : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
    }
}
