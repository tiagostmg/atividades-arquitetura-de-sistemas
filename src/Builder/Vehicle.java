package Builder;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    public String model;
    public String engine;
    public String transmission;
    public String body;
    public List<String> accessories;

    public Vehicle() {
        accessories = new ArrayList<>();
    }

    public void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Body: " + body);
        System.out.println("Transmission: " + transmission);
        System.out.println("Accessories:");
        for (String accessory : accessories) {
            System.out.println("\t" + accessory);
        }
    }
}