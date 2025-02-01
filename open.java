class tringle{
   double a,b,c;
    tringle(double a , double b , double c){
       this.a=a;
       this.b=b;
       this.c = c;
    }
    tringle(){
       this.a=0;
       this.b=0;
       this.c=0;
    }

    boolean validate(tringle s){
        if(((s.a+s.b)>s.c)&&((s.a+s.c)>s.b)&&((s.c+s.b)>s.a))
        return true;

        else return false;
    }

    double findArea(tringle x){
        
    }
}
public class open {
    public static void main(String[] args) {
           
    }
}
