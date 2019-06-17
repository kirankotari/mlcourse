//package transaction;
//import java.sql.*;
//
//public class SingletonEngine {
//    private Connection connectionTo;
//    private Connection connectionFrom;
//
//    private static SingletonEngine instance = null;
//    public synchronized static SingletonEngine getInstance() {
//        if(instance == null) {
//            instance = new SingletonEngine();
//            instance.getConnectionTo();
//            instance.getConnectionFrom();
//        }
//        return instance;
//    }
//    private Connection getConnectionFrom() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connectionFrom = DriverManager.getConnection("jdbc:mysql://localhost:3306/testFrom", "root", "Appleiphone_!123");
//            connectionFrom.setAutoCommit(false);
//        } catch(SQLException e) {
//            System.out.println("SQLException: " + e.getMessage() + "SQLState: " + e.getSQLState());
//        }  catch (ClassNotFoundException ex) {
//            System.out.println("Driver not found");
//        }
//        return connectionFrom;
//    }
//}
