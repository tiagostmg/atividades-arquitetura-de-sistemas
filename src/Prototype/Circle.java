package Prototype;
public class Circle extends Shape {
    public int radius;

    public Circle() { }

    // Construtor que copia os valores da fonte
    public Circle(Circle source) {
        // Chama o construtor da classe pai para copiar os atributos de Shape
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}