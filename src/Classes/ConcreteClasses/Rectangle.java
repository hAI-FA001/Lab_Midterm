package Classes.ConcreteClasses;

import Classes.Display;
import Classes.Point;
import Classes.Shape;

public class Rectangle extends Shape implements Display {
    private int height;
    private int width;

    public Rectangle(Point point, int height, int width){
        this.point = point;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getDrawableArea() {
        return area();
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public String toString(){
        return String.format("center%swidth=%d, height=%d", point, width, height);
    }
}
