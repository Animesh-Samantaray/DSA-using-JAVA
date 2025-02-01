
        import java.util.Scanner;

        public class multiply {
        public static void main(String[] args) {
            int a,b;
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter row and colimn size : ");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println();
            System.out.println();
            int ar[][]=new int[a][b];
            System.out.println("Enter array elements : ");
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    ar[i][j]=sc.nextInt();
                }
            }
           
        } 
        }
