import java.util.Stack;
public class simple {
   public static void main(String[] args) {
    Stack<Integer>  st = new Stack<>();
    st.push(10);
    st.add(12);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    System.out.println(st);

                Stack<Integer> at = new Stack<>();
                while(st.size()!=0){
                at.push(st.pop());
                }
                System.out.println(at);

        Stack<Integer> gt = new Stack<>();
        while(at.size()!=0){
            gt.push(at.pop());
            }

            System.out.println(gt);
   }
    

}
