import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Balloon extends JPanel{
    private ImageIcon balloonIcon ;
    private int xBalloon;
    private int yBalloon;
    private int balloonNumber;
    private Point balloonCenter;
    //balloon random creater
    public Balloon(int balloonNumber){
        balloonIcon = new ImageIcon("C:\\Users\\Eldad Fertouk\\Downloads\\MyGame\\src\\images\\redtransperntredballoon.gif");
        this.balloonNumber=balloonNumber;
        Random balloonX = new Random();
        this.xBalloon = balloonX.nextInt((960) + 50);
        Random balloonY = new Random();
        this.yBalloon = balloonY.nextInt((500) + 100);
    }
    //move balloon on the screen
    public void moveBalloon(){
        Random direction = new Random();
        int movedirection = direction.nextInt(4);
        Random stepXrand = new Random();
        Random stepYrand = new Random();
        int stepX = stepXrand.nextInt(30+1);
        int stepY = stepYrand.nextInt(5+1);
        switch (movedirection){
            case 0:
                this.xBalloon+=stepX;
                this.yBalloon-=stepY;
                break;
            case 1:
                this.xBalloon+=stepX;
                this.yBalloon-=stepY;
                break;
            case 2:
                this.xBalloon-=stepX;
                this.yBalloon-=stepY;
                break;
            case 3:
                this.xBalloon-=stepX;
                this.yBalloon-=stepY;
                break;
        }

    }


    public Balloon(ImageIcon icon){
        this.balloonIcon = icon;
    }

    public ImageIcon getBalloon() {
        return balloonIcon;
    }

    public void setBalloon(ImageIcon balloon) {
        this.balloonIcon = balloon;
    }

    public ImageIcon getBalloonIcon() {
        return balloonIcon;
    }

    public void setBalloonIcon(ImageIcon balloonIcon) {
        this.balloonIcon = balloonIcon;
    }

    public int getxBalloon() {
        return xBalloon;
    }

    public void setxBalloon(int xBalloon) {
        this.xBalloon = xBalloon;
    }

    public int getyBalloon() {
        return yBalloon;
    }

    public void setyBalloon(int yBalloon) {
        this.yBalloon = yBalloon;
    }
}

