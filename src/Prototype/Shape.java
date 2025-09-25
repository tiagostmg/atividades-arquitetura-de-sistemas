package Prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() { }

    // Construtor do protótipo
    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    // O método de clonagem abstrato que será implementado pelas subclasses
    public abstract Shape clone();
}