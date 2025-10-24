package FactoryMethod;

public class OracleConnection implements Connection {
    @Override
    public String getType() {
        return "Oracle";
    }

    @Override
    public void connect() {
        System.out.println("Conexão criada: " + getType());
    }
}
