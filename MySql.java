import Model.Database;

public class MySql extends Database {
    @Override
    public void getconnection() {
        System.out.println("connection from Mysql");
    }
}
