import java.util.Scanner;

public class rotation {
    static int[]  rotate(int[] arr , int y){
        int limit = arr.length-y;
        int a[]= new int[limit];
        int b[] =  new int[y];
        for(int i=0;i<limit;i++){
            a[i]=arr[i];
        }
         int idx = 0;
         for(int i=limit;i<arr.length;i++){
            b[idx]=arr[i];idx++;
         }
        
         for(int i=0;i<y;i++){
            arr[i]=b[i];
         }
         idx = y;
         for(int i=0;i<limit;i++){
arr[idx++]=a[i];
         }
return arr;

 }
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6,7,8,9};
        int n = arr.length;
         int y;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of rotations : ");
         y=sc.nextInt();
         y=y%arr.length;
         int[] brr = rotate(arr, y );
         for(int i: brr)
         System.out.print(i+" ");
    }
}
