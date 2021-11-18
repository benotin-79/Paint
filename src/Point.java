public class Point {
    private int X;
    private int Y;

    public int getX(){return X;}
    public int getY(){return Y;}
    public void setX(int x) {X = x;}
    public void setY(int y) {Y = y;}

    @Override
    public String toString() {
        return "(" + X + "," + Y + ')';
    }

    public void Point(){
        this.X=0;
        this.Y=0;
    }

    public Point(int a,int b){
        this.X=a;
        this.Y=b;
    }
}
