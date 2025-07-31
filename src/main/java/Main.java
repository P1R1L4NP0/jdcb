import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetopoo", "root", "univille");
            Statement s = c.createStatement();
            String Sql = "insert into PESSOAS(nome, cpf) " +
                    "values('Tom', '09021984911')";
            s.execute(Sql);
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
