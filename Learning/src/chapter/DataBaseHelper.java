package chapter;
import java.sql.*;
import java.util.ArrayList;

import db_test.Abonent;
import db_test.ConnectorDB;

public class DataBaseHelper {
    private final static String SQL_INSERT = "INSERT INTO base_excel(user_id,name,surname) VALUES(?,?,?)";
    private Connection connect;

    public DataBaseHelper() throws SQLException {
        connect = ConnectorDB.getConnection();

    }
    public PreparedStatement getPreparedStatement() {
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
    public boolean insertAbonent(PreparedStatement ps, Abonent ab) {
        boolean flag = false;
        try {
            ArrayList<Abonent> abonents = new ArrayList<>();
            PreparedStatement statement = connect.prepareStatement("INSERT INTO base_excel VALUES(?,?,?)");
            ps.setInt(1, ab.getId());
            ps.setString(2,ab.getLastname());
            ps.setString(3, ab.getFirstName());
            ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public void closeStatement(PreparedStatement ps) {
        if (ps!=null) {
            try {
                ps.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
