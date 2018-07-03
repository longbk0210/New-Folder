import javax.naming.Name;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class HelloJava extends JFrame {
    public HelloJava(){
        JLabel label = new JLabel("Hello", SwingConstants.CENTER);
        this.setTitle("HELLO");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(label);
        label.setForeground(Color.CYAN);
        label.setFont(new Font(Font.MONOSPACED, Font.LAYOUT_NO_LIMIT_CONTEXT,40 ));
   }

    public static void main(String[] args) {
        new HelloJava().setVisible(true);
    }
}
