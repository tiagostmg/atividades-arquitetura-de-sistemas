package Decorator;

public class LogChannel extends ChannelDecorator {
    public LogChannel(Channel decoratedChannel) {
        super(decoratedChannel);
    }

    @Override
    public void send(String message) {
        System.out.println("Logging send operation...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("Logging receive operation...");
        return super.receive();
    }
}
