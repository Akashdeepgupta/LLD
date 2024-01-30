package Design_patterns.creational_design_patterns.extras;

public class Main {
    public static void main(String[] args) {
        DbConn db = DbConn.getDbConn();
        db.getConnection();
        DbConn db2 = DbConn.getDbConn();
        db2.getConnection();
        DbConn db3 = DbConn.getDbConn();
        db3.getConnection();
        DbConn db4 = DbConn.getDbConn();
        db4.getConnection();
    }
}
