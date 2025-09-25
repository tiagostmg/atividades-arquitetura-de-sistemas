package Prototype;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() { }

    // Construtor que copia os valores da fonte
    public Rectangle(Rectangle source) {
        // Chama o construtor da classe pai para copiar os atributos de Shape
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}