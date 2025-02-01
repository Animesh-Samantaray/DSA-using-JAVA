import java.util.*;
public class implementAlist {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList();
        arr.add(10);
        arr.add(123);
        arr.add(90);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"  ");
        }
        System.out.println();
        arr.add(1 ,12);
        System.out.println(arr);
System.out.println(arr.remove(1));
System.out.print(arr);
    }
}
