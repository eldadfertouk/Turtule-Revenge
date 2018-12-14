

import javax.swing.*;
import java.util.List;

public class Arrow extends JPanel{
    private ImageIcon arrowIcon;
    private int XArrow=426;
    private int YArrow=630;
    private Point arrowPoint;
    private static int arrowsFierd = 0;

    public ImageIcon getArrowIcon() {
        return arrowIcon;
    }

    public void setArrowIcon(ImageIcon arrowIcon) {
        this.arrowIcon = arrowIcon;
    }

    public Point getArrowPoint() {
        return arrowPoint;
    }

    public Arrow(){

        this.arrowIcon = new ImageIcon("C:\\Users\\Eldad Fertouk\\Downloads\\MyGame\\src\\images\\uparrowfinal.gif");
      //  this.XArrow = 462;
      //  this.YArrow = 630;
        //this.horizontalCenter = (this.getX()-this.getWidth()/2);
        //this.verticalCenter = (this.getY()-this.getHeight()/2);
        arrowPoint = new Point((this.getX()-this.getWidth()/2),(this.getY()+5));
    }


    public Arrow(int x,int y) {
        this.arrowIcon = new ImageIcon("C:\\Users\\Eldad Fertouk\\Downloads\\MyGame\\src\\images\\uparrowfinal.gif");
        this.XArrow = x;
        this.YArrow = y;
    }
    public void moveArrowUp(int x){
        if (this.YArrow > -90) {
            this.arrowPoint = new Point((x-this.getWidth()/2),(this.getY()+5));
          //  this.XArrow = x;
            this.YArrow--;
        }
    }

    public Point getArrowPoint(int x) {
        this.arrowPoint = new Point((x-this.getWidth()/2),(this.getY()+5));
        return arrowPoint;
    }

    public void setArrowPoint(Point arrowPoint) {
        this.arrowPoint = arrowPoint;
    }

    public void ShootAnArrow(int x) {
      //  arrowsFierd+=1;
        moveArrowUp(x);
    }
    public static int getArrowsFierd() {
        return arrowsFierd;
    }

    public static void setArrowsFierd(int arrowsFierd) {
        Arrow.arrowsFierd = arrowsFierd;
    }

    public ImageIcon getArrow() {
        return arrowIcon;
    }

    public void setArrow(ImageIcon arrow) {
        this.arrowIcon = arrow;
    }

    public int getXArrow() {
        return XArrow;
    }

    public void setXArrow(int XArrow) {
        this.XArrow = XArrow;
    }

    public int getYArrow() {
        return YArrow;
    }

    public void setYArrow(int YArrow) {
        this.YArrow = YArrow;
    }
}
