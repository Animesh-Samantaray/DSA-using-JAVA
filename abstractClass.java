abstract class student
{
   public  int y;
abstract void print();
void show(){
    System.out.println("ANimesh showed ");
}
void sety(int y){
    this.y = y;
}
int gety()
{
    return y;
}

}

 class x extends student{
  
    void print(){
        System.out.println("IN ABSTRACT CLASS");
    }
}

class abstractClass
{
    public static void main(String[] args) {
        student c = new x();
        c.print();
        c.show();
        c.y=12;
        x obj = new x();
        obj.sety(19);
        System.out.println(obj.gety());
    }
}