import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the number ");
        age=sc.nextInt();
        if(age>18)
        System.out.println("You are Adult");
        else if((age>13) && (age<=18))
        System.out.println("You are teenager");
        else
        System.out.println("You are child");
        
    }
}
