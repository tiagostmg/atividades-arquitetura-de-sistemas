package Decorator;

public abstract class ChannelDecorator implements Channel {
    protected Channel decoratedChannel;

    public ChannelDecorator(Channel decoratedChannel) {
        this.decoratedChannel = decoratedChannel;
    }

    @Override
    public void send(String message) {
        decoratedChannel.send(message);
    }

    @Override
    public String receive() {
        return decoratedChannel.receive();
    }
}
