package FactoryMethod;

public class Teste3 {
    private Connection con;
    public Teste3(){
        this.con = ConnectionFactory.createPostgres();
    }

    public void connect(){
        this.con.connect();
    }
}