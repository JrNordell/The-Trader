import javax.swing.*;

/**
 * Created by Jack
 */
public class Game {
    public Game(){

        JFrame gF = new JFrame();

        gF.setSize(900,600);
        gF.setDefaultCloseOperation(3);
        gF.setTitle("The Trader");
        gF.add(new MenuPanel());
        gF.setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }
}
