import java.util.Scanner;
class tringle{
    Scanner sc = new Scanner(System.in);
    double a,b,c;

    tringle()
    {
        System.out.println("enter 3 sides of the tringle : ");
        this.a=sc.nextDouble();
        this.b=sc.nextDouble();
        this.c=sc.nextDouble();
    }
    boolean validate(tringle r){
        if((r.a+r.b > r.c )&&(r.b+r.c > r.a)&&(r.c+r.a > r.b))
        return true;

        else 
        return false;
           }
           double findArea(tringle r){
            double s = (r.a+r.b+r.c)/3;
            return Math.sqrt(s*(s-r.a)*(s-r.b)*(s-r.c));
           }
}
public class tri {
    public static void main(String[] args) {
        tringle t = new tringle();
        boolean check = t.validate(t);
        double findArea = t.findArea(t);
    }
}
