package Design_patterns.creational_design_patterns.extras;

public class DbConn {
    private static DbConn instance;
    private final int limit = 2;
    private int noOfConnections = 0;

    private DbConn(){

    }

    public static DbConn getDbConn(){
        if(instance == null){
            instance = new DbConn();
        }
        return instance;
    }

    public boolean getConnection(){
        if(noOfConnections<limit){
            noOfConnections++;
            System.out.println("connection established");
            return true;
        }
        else {
            System.out.println("Maximum no of connection reached pleased re try");
            return false;
        }
    }
}
