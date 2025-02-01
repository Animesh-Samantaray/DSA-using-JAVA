import java.util.Scanner;
import  java.util.Stack;
public class BalancedBrackets {
    static boolean isBalanced(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(0)==')'){
                return false;
            }
            else if(str.charAt(i)==')'){
                if(s.size()>0)
                s.pop();

                else return false;
            }
            else if(str.charAt(i)=='('){
                s.push(str.charAt(i));
            }           
        }
        if(s.size()==0)
        return true ;

        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brackets :  ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
