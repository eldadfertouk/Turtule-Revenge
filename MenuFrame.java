import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {
    public static int MENUSCREENHIGHT=500,MENUSCREENWIDTH=500;
    private Dimension dimension;
    private ImageIcon menuBackground;
    private ImageIcon strikeback;
    private JFrame menuFrame;

    public MenuFrame(){
        menuFrame = new JFrame();
        menuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menuBackground = new ImageIcon("C:\\Users\\Eldad Fertouk\\Downloads\\MyGame\\src\\images\\zavlonrevenge.gif");
        strikeback = new ImageIcon("C:\\Users\\Eldad Fertouk\\Downloads\\MyGame\\src\\images\\menu.gif");
        menuBackground.paintIcon(this,menuFrame.getGraphics(),0,0);
        int hight=menuBackground.getIconHeight();
        int width=menuBackground.getIconWidth();
        dimension.setSize(width,hight);
        menuFrame.setPreferredSize(dimension);
       // menuFrame.getContentPane().add(menuBackground.paintIcon(this,);
       // menuFrame.setIconImage(menuBackground.getImage());
       // menuFrame.setLayout(new GridLayout(4,4));
        menuFrame.setVisible(true);


        this.pack();

    }

}

