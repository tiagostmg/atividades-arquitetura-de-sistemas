package Decorator;

public class UDPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending via UDP: " + message);
    }

    @Override
    public String receive() {
        return "Received via UDP";
    }
}
