import javax.swing.*;

/**
 * Created by Jack
 */
public class Game {
    public Game(){

        JFrame gF = new JFrame();
        gF.setVisible(true);
        gF.setSize(900,600);
        gF.setDefaultCloseOperation(3);
        gF.setTitle("The Trader");
        gF.add(new MenuPanel());
    }

    public static void main(String[] args) {
        new Game();
    }
}
