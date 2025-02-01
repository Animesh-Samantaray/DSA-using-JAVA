import java.util.Scanner;

public class Rectsum {
     static Scanner sc=new Scanner(System.in);

     // for taking input for a matrix
    static int[][] InputMatrix(int r,int c){
        int[][] arr=new int[r][c];
        System.out.println("enter the elements of the matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }


    // for printing a matrix
static void PrintMatrix(int[][] arr,int r,int c){
System.out.println();
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(arr[i][j]+"  ");
    }
    System.out.println();
}
    }

//  main method
    public static void main(String ar[]){
        int r,c;
        System.out.println("Enter the dimension of the matrix : ");
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] mat=new int[r][c];
        mat=InputMatrix(r, c);
        System.out.println("main matrix is..... ");
        PrintMatrix(mat, r, c);


        int r1,r2,c1,c2;
        System.out.println("Enter the coordinates of your specified rectangle : ");

        System.out.print("Enter  coordinate 1 :  ");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.print("Enter  coordinate 2 :  ");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int sum=0;

        
        System.out.println("\n As your Coordinate  ,  Your Recatangle Matrix is . . . . . .");
        for(int i=r1-1;i<r2;i++){
            for(int j=c1-1;j<c2;j++){
                sum+= mat[i][j];
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Sum of all elements of rectangle =  "+sum);
    }
}
