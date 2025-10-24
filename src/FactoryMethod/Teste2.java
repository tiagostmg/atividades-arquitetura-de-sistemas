package FactoryMethod;

public class Teste2 {
    private Connection con;
    public Teste2(){
        this.con = ConnectionFactory.createMySql();
    }

    public void connect(){
        this.con.connect();
    }
}