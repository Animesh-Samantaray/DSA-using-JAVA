
// import java.lang.classfile.Superclass;
import java.util.Scanner;

class parent{
    void sum(){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a,b,c : ");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   System.out.println("Sum = "+(a+b+c));

    }
}
class child extends parent{
    void sum(){
        super.sum();
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a,b : ");
   a=sc.nextInt();
   b=sc.nextInt();
   System.out.println( " sum = "+(a+b));

    }
}
public class constructor_inherit {
    public static void main(String[] args) {
        child obj=new child();
        obj.sum();
    }
}
