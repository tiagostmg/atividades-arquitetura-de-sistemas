package Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    private static void main(String[] args) {
        DbConn db = DbConn.getConnection();

        db.println("deu certo");

    }
}
