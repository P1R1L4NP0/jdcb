import org.w3c.dom.ls.LSOutput;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        try{
            DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "univille");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
