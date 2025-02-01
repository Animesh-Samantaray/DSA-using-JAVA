
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num;
        System.out.println("ENter a nuber : ");
        num=sc.nextLong();
        for(int i=1;i<=num;i++){
            if(num%i == 0)
            System.out.print(i+"  ");
        }
    }
}
