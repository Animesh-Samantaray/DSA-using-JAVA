class rectangle 
{
    double l,b,z;
      rectangle()
    {
        l=12;
        b=10;
    }

    rectangle(double l , double b)
    {
        this.l=l;
        this.b=b;

    }
    rectangle (double l , double b , double z){
        this.l=l;
        this.b=b;

    }

    double findArea(){
        return l*b;
    }

    double findPeri()
    {
        return 2*(l+b);
    }


}
public class rect {
    public static void main(String[] args) {
        rectangle r = new rectangle(10,20);
        System.out.println("Area = "+r.findArea());
        System.out.println("Perimetre  = "+r.findPeri());

        
    }
}
