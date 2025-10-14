package Decorator;

public class ZipChannel extends ChannelDecorator {
    public ZipChannel(Channel decoratedChannel) {
        super(decoratedChannel);
    }

    @Override
    public void send(String message) {
        System.out.println("Compressing message before sending...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("Decompressing message after receiving...");
        return super.receive();
    }
}
