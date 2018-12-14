import javax.swing.*;

public class BackGround extends JPanel {
    private ImageIcon backgroundIcon;

    public ImageIcon getBackgroundIcon() {
        return backgroundIcon;
    }

    public void setBackgroundIcon(ImageIcon backgroundIcon) {
        this.backgroundIcon = backgroundIcon;
    }

    public BackGround(){
        backgroundIcon = new ImageIcon(getClass().getResource("images/flyingthroughclouds.gif"));
    }
}
