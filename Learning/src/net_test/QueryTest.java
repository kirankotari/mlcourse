package net_test;
        import net_test.ConnectorDB;

        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;

public class QueryTest {
    public static void main(String[] args) {
        try {
            Connection cn = ConnectorDB.getConnection();
            String query = "INSERT INTO folder_structure(foldername)" +  " VALUES(?)";
            PreparedStatement pr = cn.prepareStatement(query);
            pr.setString(1,"sasha");
            pr.execute();
        } catch(SQLException e) {e.printStackTrace();}
    }
}
