package Decorator;

public class TCPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Sending via TCP: " + message);
    }

    @Override
    public String receive() {
        return "Received via TCP";
    }
}
