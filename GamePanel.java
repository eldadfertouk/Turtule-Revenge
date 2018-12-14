import images.MovementListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class GamePanel extends JPanel {
    private final int SCREENWIDTH = 960; //= this.gameborad.getWidth();
    private final int SCREENHIGHT = 720; //= this.gameborad.getHeight();
    private BillboardPanel billboardPanel;
    private final int BALOON_COUNT = 100;
    private final int AMMO_COUNT = 15;
    private boolean boom = false;
    private int turtleWidth;
    private int turtlehight;
    private int balloonspeed = 350;
    private int turtulespeed = 5;
    private int arrowspeed = 1;
    private int keyPressed;
    private int score=0;
    private int targets;
    private String direction = "right";
    private ImageIcon background;
    private List <Balloon> balloons;
    protected Turtle player;
    private List <Arrow> ammo;
  //  private Arrow esh;
    private Explosion explosion;
    private MovementListener mahazin;
    private Mouse mouse;
  //  private AimListener mysights;
    private KeyEvent move;
    private Shoot shoot;
    private KeyMazin keyMazin;
 //   private SoundTrack soundEffect;
    private BackGround gameborad;
    private int shotsfierd = 0;
    private Point impactpoint;
    private Point arrowtip;
    private JTextField ammoField;
    private JTextField arrowsleftField;
    private JTextField scoresField;
    private JTextField targetsField;

    public GamePanel() {
        impactpoint = new Point(-1,-1);
        billboardPanel = new BillboardPanel();
        gameborad = new BackGround();
        player = new Turtle();
        explosion = new Explosion(0, 0);
        balloons = new ArrayList <>();
        ammo = new ArrayList <>();
        mouse = new Mouse();
        this.addMouseMotionListener(mouse);
        shoot = new Shoot();
        this.addMouseListener(shoot);
        keyMazin = new KeyMazin();
        this.addKeyListener(keyMazin);
        keyPressed = keyMazin.getKeyCode();
      //  esh = new Arrow();
     //   new Thread(()->{
     //       try{
      //          while (shoot.getClick()==1){
      //              esh.ShootAnArrow(300);
      //              repaint();
      //              Thread.sleep(1);
      //          }
      //      }catch (Exception e){}
      //  }).start();
        //create balloons
        for (int i = 0; i < BALOON_COUNT; i++) {
            Balloon balloon = new Balloon(i);
            balloons.add(balloon);
        }
        // create ammo
        for (int a = 0; a < AMMO_COUNT; a++) {
            Arrow arrow = new Arrow();
            ammo.add(arrow);
        }
        this.setVisible(true);
        //sound track
        new Thread(() -> {
            try {
                SoundTrack wind = new SoundTrack();
                wind.SoundTrack("wind");
                Thread.sleep(1);
            } catch (Exception e) {
            }
        }).start();
        //arrow

      //  int mikum = player.getXTurtle();
        new Thread(() -> {
            try {
                while (ammo.size()>-1) {
                    switch (shoot.getClick()) {
                        case 1:
                            ammo.get(0).ShootAnArrow(ammo.get(0).getXArrow());
                            shotsfierd += 1;
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    if (ammo.get(0).getYArrow() < -10) {
                        shoot.setClick(0);
                        ammo.remove(0);
                    }
                    repaint();
                    Thread.sleep(arrowspeed);
                }
            } catch (Exception e) {
            }
        }).start();
        new Thread(() -> {

            try {
                while (true) {
                    for (Balloon balloon : this.balloons) {
                        balloon.moveBalloon();
                    }
                    repaint();
                    Thread.sleep(balloonspeed);
                    //remove balloons from screen
                    if (balloonspeed < 50) {
                        if (balloons.size()>=1){
                            balloons.remove(0);
                        }
                    }
                    // speed up balloon movement
                    if (balloonspeed > 10) {
                        balloonspeed -= 1;
                    }
                }
            } catch (InterruptedException e) {
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    switch (keyMazin.getKeyCode()) {
                        case 37:
                            direction = "left";
                            player.moveTurtle(direction);
                            repaint();
                            break;
                        case 39:
                            direction = "right";
                            player.moveTurtle(direction);
                            repaint();
                            break;
                    }
                    repaint();
                    Thread.sleep(turtulespeed);
                }
            } catch (Exception e) {
            }
        }).start();
        new Thread(()->{
            try {
            while (impactpoint.getX()*impactpoint.getY()!=1){
                    explosion.createExplosion(impactpoint);
                    Thread.sleep(2500);
                    repaint();
            }
            }catch (Exception e){}
        }).start();
        this.setFocusable(true);
        this.requestFocus();
        String a=""+ammo.size();
        ammoField = new JTextField(a);
        billboardPanel.setAmmoText(ammoField);
        String scoreText = ""+score;
        scoresField = new JTextField(scoreText+"");
        billboardPanel.setScoreText(scoresField);
        String balloonsLeft=""+balloons.size();
        targetsField = new JTextField(balloonsLeft);
        billboardPanel.setBalloonText(targetsField);
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        //main game board
        gameborad.getBackgroundIcon().paintIcon(this, page, 0, 0);
        int ammoLeft = ammo.size();
        String ammoText = "" + ammoLeft;
        billboardPanel.PaintBillboardPanel(page);
        ammoField.setText(ammoText+"   ");
        billboardPanel.setAmmoText(ammoField);
        String scoreText=""+score;
        scoresField.setText(scoreText+"         ");
        String balloonsLeft=""+balloons.size();
        targetsField.setText(balloonsLeft+"      ");
        this.add(billboardPanel,-1);
        //arrow option b
      //  esh.getArrowIcon().paintIcon(this,page,esh.getXArrow(),esh.getYArrow());
      //  esh.ShootAnArrow(esh.getXArrow());
        // arrow
        int ammoNumber=0;

        int i = 0;
        int w = (player.getTurtle().getIconWidth()) / 2;
        int x1 = player.getXTurtle();
      //  int x = ammo.get(1).getXArrow();
        while (ammoNumber < ammo.size()){
            ammo.get(ammoNumber).setXArrow(x1);
            int i1 = 0;
                while (i1 < balloons.size()) {
                    balloons.get(i1).getBalloon().paintIcon(this, page, balloons.get(i1).getxBalloon(), balloons.get(i1).getyBalloon());
                    ammo.get(ammoNumber).getArrow().paintIcon(this, page, ammo.get(ammoNumber).getXArrow(), ammo.get(ammoNumber).getYArrow());
                    int ballooniconwidth = balloons.get(i1).getBalloonIcon().getIconWidth();
                    int ballooniconhight = balloons.get(i1).getBalloonIcon().getIconHeight();
                    Point balloonPoint = new Point(balloons.get(i1).getxBalloon(), balloons.get(i1).getyBalloon());
                    Point arrowtip = new Point(ammo.get(ammoNumber).getXArrow()+45, ammo.get(ammoNumber).getYArrow()+3);
                        int bx=balloons.get(i1).getxBalloon();
                        int by=balloons.get(i1).getyBalloon();
                        boolean impact = false;
                        if (arrowtip.PointImpact(balloonPoint, ballooniconwidth, ballooniconhight, arrowtip)) {
                        score+=50;
                        System.out.println("SCORE:"+score);
                        boom=true;
                        impactpoint = new Point(bx,by);
                        explosion.getExplosionIcon().paintIcon(this, page, impactpoint.getX(), impactpoint.getY());
                        SoundTrack boom = new SoundTrack();
                        boom.SoundTrack("boom");
                        this.repaint();
                        balloons.remove(i1);
                    }boom=false;

                    i1++;}
                ammoNumber++;}

    //turtle
        turtlehight = player.getTurtle().getIconHeight();
        turtleWidth = player.getTurtle().getIconWidth();
        switch (direction){
            case "left":
                player.getTurtleIconL().paintIcon(this,page,player.getXTurtle(),player.getYTurtle());
                break;
            case "right":
                player.getTurtleIconR().paintIcon(this,page,player.getXTurtle(),player.getYTurtle());
                break;
        }

        this.setVisible(true);
        this.setFocusable(true);
        this.requestFocus();
        }

    }

