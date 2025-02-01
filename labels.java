
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;
 class myFrame extends  JFrame{
     myFrame()
     {
        this.setTitle("abcdefghijklmnopqrstuv");
        this.setSize(1000,1000);
        this.setVisible(true);
        this.setResizable(true);
         ImageIcon image = new ImageIcon("1000003295.jpg");
         this.setIconImage(image.getImage());
         this.getContentPane().setBackground(ColorUIResource.black);
         JLabel label = new JLabel();
         label.setText("XX YY ZZ ");
         label.setIcon(image);

     }
}
public class labels {
    public static void main(String[] args) {
        myFrame obj = new myFrame();
    }
}
