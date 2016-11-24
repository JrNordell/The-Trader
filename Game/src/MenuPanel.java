import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Jack
 */
public class MenuPanel extends JPanel implements KeyListener{
    int cX = 100;
    int cY = 100;
    public MenuPanel(){
        setLayout(new GridBagLayout());
        setBackground(new Color(173,20,87));
        JLabel title = new JLabel("The Trader");
        title.setPreferredSize(new Dimension(200,30));
        title.setFont(new Font("Times New Roman", 1, 36));
        title.addKeyListener(this);
        add(title);
        JButton play = new JButton("Play");
        play.addKeyListener(this);
        add(play);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(cX, cY, 25, 25);
    }
    public void updateBall(int code){
        switch (code){
            case 1: cX -= 20;
                break;
            case 2: cY -= 20;
                break;
            case 3: cX += 20;
                break;
            case 4: cY += 20;
                break;
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar());
        if(e.getKeyChar() == 'a'){
            updateBall(1);
        }else if(e.getKeyChar() == 'w'){
            updateBall(2);
        }else if(e.getKeyChar() == 'd'){
            updateBall(3);
        }else if(e.getKeyChar() == 's'){
            updateBall(4);
        }else{
            System.out.println("Wrong Button!");
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {

    }
}
