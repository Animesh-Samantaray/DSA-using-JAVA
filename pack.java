
class check{
    int a=23;
    private int b=90;
    String c = "aaaaa";
    
    void setb(int b){
     this.b=b;
    }
    int getb(){
        return b;
    }
}
public class pack {
    public static void main(String[] args) {
        System.out.println("Animeesh Samantaray");

        check obj = new check();
        obj.a=90;
        obj.setb(10);
        obj.getb();
       System.out.println(obj.a);
       System.out.println(obj.c);
       System.out.println(obj.getb());
    }
}
