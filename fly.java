interface Animal{
    void running();
}
interface  bird{
    void flying();
}
class FlyingTiger implements Animal,bird{
@Override
public void running(){
    System.out.println("running");
}

@Override
public void flying(){
    System.out.println("Flying");
}
}

class x extends FlyingTiger{
    @Override
    public void running(){
        System.out.println("running1");
    }
    
    @Override
    public void flying(){
        System.out.println("Flying2");
    }
}
public class fly {
    public static void main(String[] args) {
        FlyingTiger f = new FlyingTiger();
        f.running();
        f.flying();
        f=new x();
        f.running();
        f.flying();
        if("Animesh"=="Animesh")
        System.out.println(1);
    }
}
