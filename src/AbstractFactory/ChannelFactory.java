package AbstractFactory;

public class ChannelFactory {
    public static Channel create() {
        return new TCPChannel();
    }

    // public static Channel createUDPChannel() {
    //     return new UDPChannel();
    // }

}
