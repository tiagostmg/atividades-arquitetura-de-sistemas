package Decorator;

public class Main {
    public static void main(String[] args) {
        Channel tcp = new TCPChannel();
        Channel logged = new BufferChannel(new LogChannel(new ZipChannel(tcp)));

        logged.send("Hello, Decorator!");
        System.out.println(logged.receive());
    }
}
