package net_test;

import java.sql.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConnectorDB {
    public static Connection getConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("net_test.database", Locale.getDefault());
        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String pass = resource.getString("db.password");

        return DriverManager.getConnection(url, user, pass);
    }

    public static void main(String[] args) {
        try {
            Connection cn = ConnectorDB.getConnection();
            System.out.println("success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
