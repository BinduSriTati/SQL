import Model.Database;

public class Oracle extends Database {
    @Override
    public void getconnection() {
        System.out.println("connection from Oracle");
    }
}
