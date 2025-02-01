
import java.util.Scanner;
class fraction
{
    int a,b;
    fraction(int a ,int b)
    {
        this.a=a;
        this.b=b;
    }
    void simplify()
    {
            if(a==b)
            { 
            this.a=1;
            this.b=1;
            }

    else if(b>a )
    {
        for(int i = 1; i<=a;i++){
            if(b%i==0 && a%i==0)
            {
                b/=i;
                a/=i;
            }
        }   
     }

    else if(a>b )
    {
        for(int i = 1; i<=b;i++){
            if(b%i==0 && a%i==0)
            {
                a/=i;
                b/=i;
            }
        } 
    }
}
}
public class fract 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        fraction obj=new fraction(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
        obj.simplify();
        System.out.println(obj.a+" / "+obj.b);
    }
}
