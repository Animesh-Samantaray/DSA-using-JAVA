import java.util.Scanner;
public class practice1 {
    public static void main(String ar[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size : ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements :  ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

                for(int i=0;i<n-1;i++)
                {
                    if(arr[i]==0)
                    {
                        for(int j=i+1;j<n;j++)
                        {
                            if(arr[j] != 0)
                            {
                                int temp = arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                            }
                        }
                    }
                }

                for(int i: arr){
                    System.out.print(i+" ");
                }
    }
}
