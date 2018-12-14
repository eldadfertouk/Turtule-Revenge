import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Shoot implements MouseListener {
    private int click = 0;
    private int totalShotsfierd=0;
    public Shoot(){
        //System.out.println("shoot called");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        click = e.getButton();
        this.totalShotsfierd++;
        SoundTrack shootingarrosound = new SoundTrack();
        shootingarrosound.SoundTrack("shoot");

     //   System.out.println(click + " mouse clicked");
    }

    public int getTotalShotsfierd() {
        return totalShotsfierd;
    }

    public void setTotalShotsfierd(int totalShotsfierd) {
        this.totalShotsfierd = totalShotsfierd;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
