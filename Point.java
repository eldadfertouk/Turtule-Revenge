
public class Point {
    private int x;
    private int y;
    //private int fromX,toX;
    //private int fromY,toY;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean PointImpact (Point a,int ha,int wa,Point b){
        if ((b.getX() >= a.getX() && b.getX()<=(a.getX() + wa))&&((b.getY()>=a.getY()) && (b.getY()<=(a.getY()+ha)))){
            return true;
        }
        return false;}
    public boolean PointSquareImpact(Point a, int ha, int wa, Point b, int hb, int wb){return false;}
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
