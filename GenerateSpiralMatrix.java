import java.util.Scanner;

public class GenerateSpiralMatrix 
{
    static Scanner sc=new Scanner(System.in);

    static void PrintArray(int[][] arr,int r,int c)
        {
            System.out.println();
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
                System.out.println();
            }
            System.out.println();
        }


static int[][] generate(int n){
    int[][]arr=new int[n][n];
    int t=1;
    int r1=0,r2=n-1;
    int c1=0,c2=n-1;
    while(t<=n*n)
    {

        for(int j=c1;j<=c2;j++)
        {
            
            arr[r1][j]=t;
            t++;
        }
            r1++;


        for(int i=r1;i<=r2;i++)
        {
            arr[i][c2]=t;
            t++;
        }
            c2--;
            

        for(int j=c2;j>=c1;j--)
        {
            arr[r2][j]=t;
            t++;
        }
            r2--;
          

        for(int i=r2;i>=r1;i--)
        {
            arr[i][c1]=t;
            t++;
        }
            c1++;
           

    }
return arr;
}
    public static void main(String[] args) {
        int n;
        System.out.print("Please enter  the size of the matrix : ");
        n=sc.nextInt();
        int[][] matrix=generate(n);
        PrintArray(matrix,n,n);
    }
}
