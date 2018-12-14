// Java Program to illustrate MouseMotionListener events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mouse extends Frame implements MouseMotionListener {

    // Jlabels to display the actions of events of MouseMotionListener
//    static JLabel label1, label2;
    private int Xmouse;
    private int Ymouse;
  // private ImageIcon arrow;
    // default constructor
    public Mouse()
    {
      //  System.out.println("called mouse");
    }

    public void mouseDragged(MouseEvent e)
    {  //System.out.println(e.getX() + "drag" + e.getY());


    }

    // invoked when the cursor is moved from
    // one point to another within the component
    public void mouseMoved(MouseEvent e)
    {
        Xmouse = e.getX();
        Ymouse = e.getY();

        //System.out.println(Xmouse + " " + Ymouse);

    }

    public int getXmouse() {
        return Xmouse;
    }

    public void setXmouse(int xmouse) {
        Xmouse = xmouse;
    }

    public int getYmouse() {
        return Ymouse;
    }

    public void setYmouse(int ymouse) {
        Ymouse = ymouse;
    }
}
