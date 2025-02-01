import java.util.Scanner;
public class largest {
    public static void main(String args[]){
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements : \n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        if(a>b&& a>c&& a>d &&a>e)
        System.out.println(a+"is greatest");
        else if(b>a &&b>c &&b>d &&b>e)
        System.out.println(b+"is greatest");
        

    }
}
