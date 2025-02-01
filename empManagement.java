

class employee{
String name;
    int id;
    double salary ;
    void displayDetails(){
        System.out.println("NAME - "+this.name);
        System.out.println("ID - "+this.id);
        System.out.println("SALARY - "+this.salary);
        System.out.println();
    }
}
public class empManagement {
  public static void main(String[] args) {
    employee e1 = new employee();
    employee e2 = new employee();
    e1.name="Animesh";e1.id=1;e1.salary=120000.89;
    e2.name="chnsyy";e2.id=2;e2.salary = 90887.778;
e1.displayDetails();
e2.displayDetails();
  }  
}
