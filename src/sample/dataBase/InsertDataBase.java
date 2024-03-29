package sample.dataBase;


import java.sql.*;

public class InsertDataBase {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:./DataBase";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123";

    public static void insertDataBase(){
        Connection conn = null;
        Statement stmt = null;

        try{
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database successfully");

            // STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql = "INSERT INTO cars (carName, usegeGasoline, kilometers) VALUES ('Lanos', 13, 140000)";
            stmt.executeUpdate(sql);

            // STEP 4: Clean-up environment
//            stmt.close();
//            conn.close();

        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        //end try
        }

    }

}
