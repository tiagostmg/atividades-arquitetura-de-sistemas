package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Teste1 oracle = new Teste1();
        Teste2 mysql = new Teste2();
        Teste3 postgres = new Teste3();

        oracle.connect();
        mysql.connect();
        postgres.connect();
    }
}
