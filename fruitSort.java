import java.util.Scanner;
public class fruitSort {
    public static void main(String ar[]){
         
                Scanner sc= new Scanner(System.in);
                // System.out.print("Enter array size : ");
                String arr[] = {"animesh","animesz","animesa","mohapatra"};
                int n = arr.length;

                for(int i=0;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        if(arr[i].compareTo(arr[j]) > 0){
                            String temp = arr[i];
                            arr[i]= arr[j];
                            arr[j]= temp;
                        }
                    }
                }
                for(String m : arr){
                    System.out.print(m+" ");
                }

    }
}
