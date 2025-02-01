interface  subsum
{
     double sub(double a, double b );
     double sum(double a, double b );
}

interface muldiv extends subsum
{
 double mul(double a, double b );
  double div(double a, double b );
}

  class aerithmatic implements muldiv{
 @Override
 public double sub(double a , double b)
 {
    return a-b;
 }

 @Override
 public double sum(double a , double b)
 {
    return a+b;
 }

 @Override
 public double div(double a , double b)
 {
    return a/b;
 }


 @Override
 public double mul(double a , double b)
 {
    return a*b;
 }

 public double mod(double a , double b){
    return a%b;
 }
}

class x extends aerithmatic{
    @Override
   public double sum(double a , double b){
        return a+b;
    }
}


public class interfaceAll {
    public static void main(String[] args) {
        aerithmatic a = new aerithmatic();
        System.out.println(a.sum(10,20));
        System.out.println(a.mul(10,20));
        System.out.println(a.div(10,20));
        System.out.println(a.sub(10,20));
        System.out.println(a.mod(10,20));
    }
}
