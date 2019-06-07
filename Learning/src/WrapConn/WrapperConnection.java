//package WrapConn;
//import db_test.Abonent;
//
//import java.sql.*;
//import java.util.*;
//import
//public class WrapperConnection {
//    private Connection connection;
//    public static final String SQL_SELECT_ALL_ABONENTS = "SELECT * FROM base_excel";
//    public static final String SQL_SELECT_ABONENT_BY_LASTNAME = "SELECT user_id,name FROM base_excel WHERE surname=?";
//    public WrapperConnection() {
//        try {
//            ResourceBundle resource = ResourceBundle.getBundle("chapter.database",Locale.getDefault());
//            String driver = resource.getString("db.driver");
//            String url = resource.getString("db.url");
//            String user = resource.getString("db.user");
//            String pass = resource.getString("db.password");
//            Properties prop = new Properties();
//            prop.put("user", user);
//            prop.put("password", pass);
//            connection = DriverManager.getConnection(url, prop);
//        } catch (MissingResourceException e) {
//            System.err.println("properties file is missing " + e);
//        } catch (SQLException e) {
//            System.err.println("not obtained connection " + e);
//        }
//    }
//    public Statement getStatement() throws SQLException {
//        List<Abonent> abonents = new Abonent();
//        if (connection != null) {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet =statement.executeQuery(SQL_SELECT_ALL_ABONENTS);
//            while(resultSet.next()) {
//                Abonent abonent = new Abonent();
//                abonent.setId(resultSet.getInt("user_id"));
//                abonent.setFirstName(resultSet.getString("name"));
//                abonent.setLastname(resultSet.getString("surname"));
//                abonents.add(abonent);
//            }
//            if (statement != null) {
//                return statement;
//
//            }
//        }
//        throw new SQLException("connection or statement is null");
//    }
//
//    public void closeStatement(Statement statement) {
//        if (statement != null) {
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                System.err.println("statement is null " + e);
//            }
//        }
//    }
//    public void closeConnection() {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                System.err.println(" wrong connection" + e);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        try (Stream<Path> files = Files.list(Paths.get("your/path/here"))) {
//            long count = files.count();
//        }
//    }
//}
