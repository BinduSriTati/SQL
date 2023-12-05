import Model.Database;

public class Main {
    public static void main(String[]args){
        Database sql=new Oracle() ;
        sql.getconnection();
        Database oracle=new MySql();
        oracle.getconnection();


    }
}
