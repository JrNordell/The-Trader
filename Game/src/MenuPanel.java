import javax.swing.*;
import javax.swing.plaf.TextUI;
import javax.swing.text.JTextComponent;
import java.awt.*;

/**
 * Created by Jack
 */
public class MenuPanel extends JPanel{
    public MenuPanel(){
        setBackground(new Color(173,20,87));
        JLabel title = new JLabel("The Trader");
        title.setPreferredSize(new Dimension(300,30));
        title.setFont(new Font("Times New Roman", 1, 36));
        add(title);
    }
}
