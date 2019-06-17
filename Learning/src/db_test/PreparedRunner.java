package db_test;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import chapter.DataBaseHelper;

public class PreparedRunner {
    public static void main(String[] args) {
        ArrayList<Abonent> list = new ArrayList<Abonent>(){
            {
                add(new Abonent(4, "Artsiom", "Sarychay"));
                add(new Abonent(7, "Igor", "Nazaray"));
                add(new Abonent(10,"Coke","Sprite"));
                add(new Abonent(102, "Kyra", "Plastinina"));
            }
        };
        DataBaseHelper helper = null;
        PreparedStatement statement = null;

        try {
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for(Abonent abonent:list) {
                helper.insertAbonent(statement,abonent);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            helper.closeStatement(statement);
        }

    }
}
