package Learning.InterfaceExample;
public class Rectangle implements Relatable {
    private double length=0;
    private double breadth=0;
    public Point origin;

    public Rectangle(){
        origin =  new Point(0,0);
    }

    public Rectangle(int x, int y){
        this.breadth=x;
        this.length=y;
    }

    public Rectangle(Point p){
        origin=p;
    }

    public Rectangle(Point p,int w,int h){
        origin=p;
        breadth=w;
        length = h;
    }
    public double getArea(){
        return length*breadth;}

    public void move(int x,int y){
        origin.x=x;
        origin.y=y;
    }

    public int isLargerThan(Relatable other){
        Rectangle r = (Rectangle) other;
        if(this.getArea()>r.getArea())
            return 1;
        else if(this.getArea()<r.getArea())
            return -1;
        else
            return 0;
    }
}