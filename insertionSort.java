import java.util.Scanner;

class insertionSort{
    
    public static void main(String ar[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
                    for(int i=1;i<n;i++)
                    {
                        // int j=i;
                        // while(j>0 && arr[j]<arr[j-1]){
                        //     int temp=arr[j];
                        //     arr[j]=arr[j-1];
                        //     arr[j-1]=temp;
                        //     j--;
                        // }
                        for(int j=i;j>0;j--){
                            if(arr[j]<arr[j-1]){
                                int temp=arr[j];
                                arr[j]=arr[j-1];
                                arr[j-1]=temp;  
                            }
                        }
                    }  
                    for(int i:arr){
                        System.out.print(i+" ");
                    }
    }
}