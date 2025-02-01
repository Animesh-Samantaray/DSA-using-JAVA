import java.util.Scanner;

class jeje{
    String title;
    String colour;
    void call1(){
        String name;
        System.out.println("Enter name: ");
        Scanner sc=new Scanner(System.in);
        name = sc.next();
        System.out.println("YOU ARE IN JEJE\n"+"You are "+name);
    }
}

class bapa extends jeje{
    double age;
    double weight;
    int salary;
}
class nati extends jeje{
 String hairstyle;
 String backChodi_level;
 void call2(){
    String name;
    System.out.println("Enter name: ");
    Scanner sc=new Scanner(System.in);
    name = sc.next();
    System.out.println("YOU ARE IN \n"+"You are "+name);
}

}

 class multilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nati animesh = new nati();
        bapa manoj = new bapa();
        animesh.hairstyle = " fada";
        manoj.age=45;
        manoj.title = "samantaray";
        jeje ss=new jeje();
        ss.colour="white";
        animesh.call2();
    }
}
