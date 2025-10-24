package FactoryMethod;

public interface Connection {
    String getType();
    default void connect() {
        System.out.println("Conectando usando: " + getType());
    }
}
