import java.util.Scanner;

public class Rotate90 {
   static Scanner sc=new Scanner(System.in);
   static  void print(int[][] arr,int r,int c){
      System.out.println();
      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+"  ");
         }
         System.out.println();
      }
   }
   public static void main(String[] args) {
    int r,c;
    System.out.println("enter the rows and columns of the matrix : ");
    r=sc.nextInt();
    c=sc.nextInt();
    int[][] arr=new int[r][c];
    int[][] t=new int[c][r];
    System.out.println("Enter the array elements : ");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
         arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Real matrix is :");
      print(arr,r,c);

      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            t[j][i]=arr[i][j];
         }
       }
       System.out.println("Transpose is :");
       print(t,c,r);

       //////  rotationa
       for(int i=0;i<c;i++){
int j=0;
int k=c-1;
while(j<k){
   int temp=t[i][j];
   t[i][j]=t[i][k];
   t[i][k]=temp;
}
       }

       System.out.println(" After rotation of 90 degrees ");
       print(t,c,r);


   } 
}
