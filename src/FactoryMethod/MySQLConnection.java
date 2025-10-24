package FactoryMethod;

public class MySQLConnection implements Connection {
    @Override
    public String getType() {
        return "MySQL";
    }

    @Override
    public void connect() {
        System.out.println("Conexão criada: " + getType());
    }

    private Connection con;

}
