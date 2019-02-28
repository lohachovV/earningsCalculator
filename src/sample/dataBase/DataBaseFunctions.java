package sample.dataBase;

import com.sun.rowset.CachedRowSetImpl;

import java.sql.*;

public class DataBaseFunctions {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:./DataBase";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123";

    private static Connection conn = null;


    private static void connDB () throws ClassNotFoundException, SQLException {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("connecting to driver");
        }catch (ClassNotFoundException ce){
            ce.printStackTrace();
            throw ce;
        }
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("connection's done");
        }catch (SQLException e){
            e.printStackTrace();
            throw e;
        }
    }

    private static void disconnectDB () {
        try{
            if (conn != null && !conn.isClosed()){
                conn.close();
            }

        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception e1){
                e.printStackTrace();
            }
        }
    }

    public static ResultSet ExecuteQueryDB(String queryStmt) throws SQLException, ClassNotFoundException {
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs;
        try{
            connDB();
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(queryStmt);
            crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        } catch (SQLException e) {
            throw e;
        } finally {
            if (resultSet != null){
                resultSet.close();
            }
            if (stmt != null){
                stmt.close();
            }
            disconnectDB();
        }
        return crs;
    }

    public static void ExecuteUpdateDB (String sqlStmt) throws SQLException, ClassNotFoundException {

        Statement stmt = null;
        try{
            connDB();
            stmt = conn.createStatement();
            stmt.executeUpdate(sqlStmt);

        } catch (SQLException e){
            throw e;
        } finally {
            if (stmt != null){
                stmt.close();
            }
            disconnectDB();
        }
    }

}
