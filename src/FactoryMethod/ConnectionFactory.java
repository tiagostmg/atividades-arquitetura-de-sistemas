package FactoryMethod;

public class ConnectionFactory {
    public static Connection createMySql() {
        return new MySQLConnection();
    }

    public static Connection createOracle() { return new OracleConnection();}

    public static Connection createPostgres() { return new PostgresConnection();}

}
