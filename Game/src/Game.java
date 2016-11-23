import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Jack
 */
public class Game{
    MenuPanel mP;
    public Game() {

        JFrame gF = new JFrame();

        gF.setSize(900, 600);
        gF.setDefaultCloseOperation(3);
        gF.setTitle("The Trader");
        mP = new MenuPanel();
        gF.addKeyListener(mP);
        gF.setContentPane(mP);
        gF.setLocationRelativeTo(null);
        gF.setVisible(true);


    }


    public static void main(String[] args) {
        new Game();
    }


}
