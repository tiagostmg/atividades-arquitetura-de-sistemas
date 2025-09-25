package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Cria e configura um objeto Circle
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        // Clona o círculo
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);
        // 'anotherCircle' é uma cópia exata do objeto 'circle'

        // Cria e configura um objeto Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.x = 10;
        rectangle.y = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        // A lógica de negócio usa a clonagem sem saber o tipo
        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape s : shapes) {
            shapesCopy.add(s.clone());
        }

        System.out.println("Original Shapes:");
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                System.out.println("  Circle: " + s.color + " (radius " + ((Circle) s).radius + ")");
            } else if (s instanceof Rectangle) {
                System.out.println("  Rectangle: " + s.color + " (width " + ((Rectangle) s).width + ")");
            }
        }

        System.out.println("\nCloned Shapes:");
        for (Shape s : shapesCopy) {
            if (s instanceof Circle) {
                System.out.println("  Circle: " + s.color + " (radius " + ((Circle) s).radius + ")");
            } else if (s instanceof Rectangle) {
                System.out.println("  Rectangle: " + s.color + " (width " + ((Rectangle) s).width + ")");
            }
        }
    }
}