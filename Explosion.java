import javax.swing.*;

public class Explosion extends ImageIcon{
    private ImageIcon explosionIcon;
    private Point explosionCenter;
    private int Xexplosion;
    private int Yexplosion;
    public Explosion(){
        explosionIcon = new ImageIcon(getClass().getResource("images/explosion.png"));
    }

    public Explosion(int xexplosion,int yexplosion) {
    explosionIcon = new ImageIcon(getClass().getResource("images/explosion.png"));
   // explosionCenter = new Point(xexplosion+this.explosionIcon.getIconWidth()/2,yexplosion+this.explosionIcon.getIconHeight()/2);
    this.Xexplosion=xexplosion;
    this.Yexplosion=yexplosion;
    }
    public void createExplosion(Point impactpoint){
        explosionIcon = new ImageIcon(getClass().getResource("images/explosion.png"));
        this.Xexplosion=impactpoint.getX();
        this.Yexplosion=impactpoint.getY();
    }
    public ImageIcon getExplosionIcon() {
        return explosionIcon;
    }

    public void setExplosionIcon(ImageIcon explosionIcon) {
        this.explosionIcon = explosionIcon;
    }

    public int getXexplosion() {
        return Xexplosion;
    }

    public void setXexplosion(int xexplosion) {
        Xexplosion = xexplosion;
    }

    public int getYexplosion() {
        return Yexplosion;
    }

    public void setYexplosion(int yexplosion) {
        Yexplosion = yexplosion;
    }
}