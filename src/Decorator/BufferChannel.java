package Decorator;

public class BufferChannel extends ChannelDecorator {
    public BufferChannel(Channel decoratedChannel) {
        super(decoratedChannel);
    }

    @Override
    public void send(String message) {
        System.out.println("Buffering message...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("Reading from buffer...");
        return super.receive();
    }
}
