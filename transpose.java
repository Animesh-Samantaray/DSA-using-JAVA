
import java.util.Scanner;

class transpose{
    static int[][]trans(int[][]arr,int r,int c){
        int [][]ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
  static  void print(int[][] arr,int r,int c){
    System.out.println("Array is");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  }
    public static void main(String[] args) {
        int r,c;
        System.out.print("eneter the rows and columns of the matrix : ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] matrix = new int [r][c];
        System.out.println("enter "+ r*c+" matrix elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
print(matrix,r,c);
        int[][]transpose = trans(matrix,r,c);
        System.out.println("Transpose is ");
        print(transpose,c,r);
    }
}