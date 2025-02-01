
    import java.util.Scanner;

    public class SpiralPrint 
    {

        static void PrintArray(int[][] arr,int r,int c)
        {
            System.out.println();
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        

        static Scanner sc=new Scanner(System.in);
        public static void main(String a[]){
            int r,c;
            System.out.print("Enter the rows and dcolumns of the array : ");
            r=sc.nextInt();
            c=sc.nextInt();

            int [][] arr=new int[r][c];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
             }
        }

    System.out.print("ARRAY IS ");
    PrintArray(arr,r,c);

    int r1=0,r2=r-1;
    int c1=0,c2=c-1;
    int t=0;


    while(t<r*c)
    {

        for(int j=c1;j<=c2;j++)
        {
            System.out.print(arr[r1][j]+" ");
            t++;
        }
            r1++;


        for(int i=r1;i<=r2;i++)
        {
            System.out.print(arr[i][c2]+" ");
            t++;
        }
            c2--;
            

        for(int j=c2;j>=c1;j--)
        {
            System.out.print(arr[r2][j]+" ");
            t++;
        }
            r2--;
          

        for(int i=r2;i>=r1;i--)
        {
            System.out.print(arr[i][c1]+" ");
            t++;
        }
            c1++;
           

    }


        }
    }
