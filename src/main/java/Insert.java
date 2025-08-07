import org.w3c.dom.ls.LSOutput;

import java.sql.*;

public class Insert {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/projetopoo";
        String user = "root";
        String password = "univille";


        try{
            Connection con = DriverManager.getConnection(url,user,password);
            String insert = "insert into pessoa(nome, cpf) values(?,?)";
            PreparedStatement pre = con.prepareStatement(insert);
            pre.setString(1,"Tom");
            pre.setString(2,"12345");

            pre.execute();
        }
        catch (SQLException e){
            e.printStackTrace();

        }
    }
}
