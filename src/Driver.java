import Classes.ConcreteClasses.Circle;
import Classes.ConcreteClasses.Rectangle;
import Classes.Display;
import Classes.Point;
import Classes.Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Shape> shapesList = new ArrayList<>();

        shapesList.add(new Rectangle(new Point(4, 4), 10, 20));
        shapesList.add(new Rectangle(new Point(4, 4), 10, 30));
        shapesList.add(new Rectangle(new Point(4, 4), 10, 10));

        shapesList.add(new Circle(40));
        ((Circle)shapesList.get(shapesList.size()-1)).setPoint(new Point(20, 10));
        shapesList.add(new Circle(10));
        ((Circle)shapesList.get(shapesList.size()-1)).setPoint(new Point(20, 10));
        shapesList.add(new Circle(20));
        ((Circle)shapesList.get(shapesList.size()-1)).setPoint(new Point(20, 10));

        displayShapesList(shapesList);
        System.out.println();
        System.out.println();
        sortAndDisplayInDescendingOrder(shapesList);
    }

    public static void displayShapesList(ArrayList<Shape> shapesList){
        int rectNum=1;
        int circNum=1;

        for(Shape sh : shapesList){
            StringBuilder outputString = new StringBuilder();
            outputString.append(sh.getClass().getSimpleName()).append(" ");

            if(sh instanceof Rectangle)
                outputString.append(rectNum++);
            else if(sh instanceof Circle)
                outputString.append(circNum++);

            outputString.append(", ").append(sh);

            System.out.println(outputString);
        }
    }

    public static void sortAndDisplayInDescendingOrder(ArrayList<Shape> shapesList){
        shapesList.sort(new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return (int) (o1.area() - o2.area());
            }
        });
        Collections.reverse(shapesList);

        int rectNum=1;
        int circNum=1;

        for(Shape sh : shapesList){
            StringBuilder outputString = new StringBuilder();
            outputString.append(sh.getClass().getSimpleName()).append(" ");

            if(sh instanceof Rectangle)
                outputString.append(rectNum++);
            else if(sh instanceof Circle)
                outputString.append(circNum++);

            outputString.append(", ").append(sh);

            if(sh instanceof Display)
                outputString.append(" Area :").append(String.format("%.2f", ((Display) sh).getDrawableArea()));

            System.out.println(outputString);
        }
    }
}
