package Classes;

public class Point {
    private int x;
    private int y;

    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    @Override
    public String toString(){
        return String.format("(x=%d, y=%d)", x, y);
    }
}
