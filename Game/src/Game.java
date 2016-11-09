import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Jack
 */
public class Game implements KeyListener{
    public Game() {

        JFrame gF = new JFrame();

        gF.setSize(900, 600);
        gF.setDefaultCloseOperation(3);
        gF.setTitle("The Trader");
        MenuPanel mP = new MenuPanel();
        gF.add(mP);
        gF.setLocationRelativeTo(null);
        gF.setVisible(true);
    }


    public void keyTyped(KeyEvent e) {
        if(e.)
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        new Game();
    }
}
