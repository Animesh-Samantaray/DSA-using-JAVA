
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
class myFrame extends JFrame{
    myFrame()
    {
        Border border =  BorderFactory.createLineBorder(Color.green,4);
        JLabel label = new JLabel();
        label.setText("Animesh Samantaray");
        ImageIcon image = new ImageIcon("1000003295.jpg");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("Etalic",Font.BOLD,20));
        label.setIconTextGap(-30);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(100,0,250,250);
        this.setTitle("Animesh Frame");
        this.setSize(420,420);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true); 
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(ColorUIResource.yellow);
       
    }
}
public class fact
{
    public static void main(String[] args)
     {
        myFrame frame = new myFrame();
        frame.setTitle("Animesh");
    }
}
