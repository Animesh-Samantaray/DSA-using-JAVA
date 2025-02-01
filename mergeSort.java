
import java.util.Scanner;

class mergeSort{

    static int[]  add(int[] arr , int si , int mid , int ei){
        int x = 0;
        int brr[] = new int[arr.length];
        int x1 = si ,x2 = mid+1 ;
        while(x1<=mid && x2 <=ei ){
            if(arr[x1]<=arr[x2]){
                brr[x++]=arr[x1++];
            }
            else
            brr[x++] = arr[x2++] ;
        }
         while(x1<=mid){
            brr[x++]= arr[x1++];
         }
         while(x2<=ei){
            brr[x++]= arr[x2++];
         }

         return brr;
    }


    static void divide(int[] arr , int si , int ei){
        if(si>=ei)
        return ;
int mid = (si+ei)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        add(arr, si ,mid , ei);

    }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int  arr[] = { 9,8,7,6,5,4,3,2,1};
        int size = arr.length;
        divide(arr,0,size-1);
         for(int i: arr){
            System.out.print(i+" ");
         }
    }

}