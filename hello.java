   class father{
        int age;
        String name;
    }
    class bou extends father{
        String colour;
        double weight;
    }

 public class hello{ 
public static void main(String a[]){
  bou animesh = new bou();
animesh.age=100;
animesh.name="ANIMESH";
animesh.colour="red";
animesh.weight= 1233.78;
System.out.println(animesh.age);
System.out.println(animesh.name);
System.out.println(animesh.colour);
System.out.println(animesh.weight);
}    
}
