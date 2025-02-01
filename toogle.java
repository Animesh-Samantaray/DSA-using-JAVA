import java.util.Scanner;

public class toogle {
    static void change(StringBuilder s)
    {
       
for(int i = 0;i<s.length();i++)
{
    if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
    {
        s.setCharAt(i,(char)(((int)s.charAt(i)+32)));
    }

    else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
        s.setCharAt(i,(char)(((int)s.charAt(i)-32)));
    }
}
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        change(s);
        System.out.println(s);
    }
}
