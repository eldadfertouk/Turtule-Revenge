import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public static int SCREENWIDTH=960, SCREENHIGHT=720;

    public GameFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(SCREENWIDTH,SCREENHIGHT));
        this.getContentPane().add(new GamePanel());
        this.setFocusable(true);
        this.setVisible(true);
        this.pack();
    }
    public static void main(String[] args) {
//
        new GameFrame();

    }
}
