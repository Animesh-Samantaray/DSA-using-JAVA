import java.util.Scanner;

public class selectionSort {
    static void ArrayPrint(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int n;
     System.out.println("Enter array size : ");
     n=sc.nextInt();
     int arr[] = new int[n];
    System.out.println("Enter array elements : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Before sorting array is : ");
    ArrayPrint(arr);
        int idx;
        for(int i=0;i<n-1;i++){
            idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[idx]>arr[j])
                idx=j;
            }
            if(idx != i){
                int temp = arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
System.out.println("After sorting array is : ");
        ArrayPrint(arr);

    }
}

