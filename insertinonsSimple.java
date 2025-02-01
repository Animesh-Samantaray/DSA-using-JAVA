import java.util.Stack;
public class insertinonsSimple {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=2)
        {
            temp.push(st.pop());
        }
        System.out.println(temp);
        st.push(100);
        while(temp.size()!=0)
        {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
