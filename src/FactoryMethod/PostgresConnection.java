package FactoryMethod;

public class PostgresConnection implements Connection {
    @Override
    public String getType() {
        return "PostgreSQL";
    }

    @Override
    public void connect() {
        System.out.println("Conexão criada: " + getType());
    }
}
