package DAOModel;
import java.sql.*;
import java.util.*;
import db_test.Abonent;
import WrapConn.WrapperConnection;

public class AbonentDAO extends AbstractDAO<Integer, Abonent> {

    public static final String SQL_SELECT_ALL_ABONENTS = "SELECT * FROM base_excel";
    public static final String SQL_SELECT_ABONENT_BY_LASTNAME = "SELECT user_id,name FROM base_excel WHERE surname=?";

    public void close(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            // лог о невозможности закрытия Statement
        }
    }

    @Override
    public List<Abonent> findAll() {
        List<Abonent> abonents = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        try {
            cn = wrap.
            st = cn.createStatement();
            ResultSet resultSet = st.executeQuery(SQL_SELECT_ALL_ABONENTS);

            while (resultSet.next()) {
                Abonent abonent = new Abonent();
                abonent.setId(resultSet.getInt("user_id"));
                abonent.setFirstName(resultSet.getString("name"));
                abonent.setLastname(resultSet.getString("surname"));
                abonents.add(abonent);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception (request or table failed): " + e);
        } finally {
            close(st);
        }
        return abonents;
    }

    @Override
    public Abonent findEntityById(Integer id) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean create(Abonent entity) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Abonent update(Abonent entity) {
        throw new UnsupportedOperationException();
    }
    public Abonent findAbonentByLastName(String name) {

        Abonent abonent = new Abonent();
        Connection cn = null;
        PreparedStatement st = null;
        try {
            cn = ConnectorDB.getConnection();
            st = cn.prepareStatement(SQL_SELECT_ABONENT_BY_LASTNAME);
            st.setString(1, name);
            ResultSet resultSet =st.executeQuery();
            resultSet.next();
            abonent.setId(resultSet.getInt("user_id"));
            abonent.setFirstName(resultSet.getString("name"));
            abonent.setLastname(name);
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            close(st);
        }
        return abonent;
    }

    @Override
    public boolean delete(Abonent entity) {
        throw new UnsupportedOperationException();
    }
    public static void main(String[] args) {
        AbonentDAO dao = new AbonentDAO();
        System.out.println(dao.findAbonentByLastName("kekov"));
    }
}
