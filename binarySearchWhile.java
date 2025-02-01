import java.util.Scanner;

public class binarySearchWhile {
    static boolean  search(int arr[] , int ele){
        int i=0 , j=arr.length-1;
      while(i<j){
        int mid = (i+j)/2;
        if(arr[mid]==ele)
        return true;

         else if(ele < arr[mid]){
            j=mid-1;
        }
        else if(ele > arr[mid]){
            i=mid+1;
        }
      }
      return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,ele;
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the element you wanna search ......");
       ele=sc.nextInt();
         
        if(search(arr,ele)){
            System.out.printf("%d is present ",ele);
        }
        else
        System.out.println("Not present in the array ");
    }
}
