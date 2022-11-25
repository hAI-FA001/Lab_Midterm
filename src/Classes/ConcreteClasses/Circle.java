package Classes.ConcreteClasses;

import Classes.Display;
import Classes.Point;
import Classes.Shape;

public class Circle extends Shape implements Display {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public void setPoint(Point point){
        this.point = point;
    }

    @Override
    public double getDrawableArea() {
        return area();
    }

    @Override
    public double area() {
        return (double) 22/7 * radius * radius;
    }

    @Override
    public String toString(){
        return String.format("center%sradius=%d", point, radius);
    }
}
