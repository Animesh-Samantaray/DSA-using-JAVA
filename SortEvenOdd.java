import java.util.Scanner;

public class SortEvenOdd {
 static Scanner sc=new Scanner(System.in);

 static  void swap(int[] arr,int i , int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
 }


 static void sort(int[] a){
    int i=0,j=a.length-1;
    while(i<j){
      if(a[i]%2==1 && a[j]%2==0){
         swap(a,i,j);
         i++;
         j--;
      }
      if(a[i]%2==0)
      i++;
      if(a[j]%2==1)
      j--;
    }
 }
 public static void main(String ar[]){
int n;
System.out.println("Enter the array sizez : ");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("ENter the array elements : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println();
       
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sort(a);
        System.out.println("\n After sorting ");
        for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
     }
     System.out.println();
 }
}
