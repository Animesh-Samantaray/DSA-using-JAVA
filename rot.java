import java.util.Scanner;

public class rot {
    static int[]  rotate(int[] arr , int y){
        int[] n = new int[arr.length];
        int x = 0;
        for(int i=arr.length-y;i<arr.length;i++){
            n[x++]= arr[i];

        }
        
        for(int i=0;i<arr.length-y;i++){
n[x++]=arr[i];
        }
return n;
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
