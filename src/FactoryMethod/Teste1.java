package FactoryMethod;

public class Teste1 {
    private Connection con;
    public Teste1(){
        this.con = ConnectionFactory.createOracle();
    }

    public void connect(){
        this.con.connect();
    }
}