
import java.util.Scanner;

public class toggleString {
   static void change(String s){
    char ch ;
    for(int i=0;i<s.length();i++)
    {
        if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
        {
            ch=(char)((int)(s.charAt(i))+32);
            s=s.substring(0,i)+ch+s.substring(i+1);
        }
         else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
        {
            ch=(char)((int)(s.charAt(i))-32);
            s=s.substring(0,i)+ch+s.substring(i+1);
        }
    }
    System.out.println(s);
   }
    
    public static void main(String ar[])
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        s=sc.nextLine();
        change(s);
   
    }

}