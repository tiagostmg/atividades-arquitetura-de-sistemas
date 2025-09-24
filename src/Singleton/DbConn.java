package Singleton;

public class DbConn {
    private static DbConn conn;
    private DbConn() {}
    public static DbConn getConnection() {
        if (conn == null) {
            conn = new DbConn();
        }
        return conn;
    }

    public void println(String msg) {
        System.out.println(msg);
    }
}