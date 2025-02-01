
import java.util.Scanner;

public class binarySearchRec {
    static boolean search(int arr[] , int ele,int i , int j){
        if(i>j)
        return false ;

        int mid = (i+j)/2;

        if(ele == arr[mid])
        return true ;

        if(ele<arr[mid])
        return search(arr,ele,i,mid-1);

        if(ele > arr[mid])
        return search(arr,ele,mid+1,j);

        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the element you wanna search ......");
        int ele=sc.nextInt();

        if(search(arr,ele,0,arr.length-1)){
            System.out.printf("%d is present ",ele);
        }
        else
        System.out.println("Not present in the array ");
    }
}
