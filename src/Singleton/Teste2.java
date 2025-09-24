package Singleton;

public class Teste2 {
    private DbConn dbConn;

    public Teste2() {
        this.dbConn = DbConn.getConnection();
    }

    public void println(String msg) {
        this.dbConn.println(msg);
    }
}
