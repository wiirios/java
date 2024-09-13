import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(Component myLabel) {
        this.setTitle("swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(420, 420);
        this.add(myLabel);
    }
}
