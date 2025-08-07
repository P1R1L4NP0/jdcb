import java.sql.*;

public class Select {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/projetopoo";
        String user = "root";
        String password = "univille";


        try{
            Connection con = DriverManager.getConnection(url,user,password);
            String consulta = "select id_pessoa,nome, cpf from pessoas";
            PreparedStatement pre = con.prepareStatement(consulta);
            ResultSet rs = pre.executeQuery();

            //Selecione o próxiomo registro

            while(rs.next()){
                long id = rs.getLong(1);
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                System.out.println(id+", "+nome+", "+cpf);
            } // Faz a consulta pelo id. Utilize o ?


            pre.execute();
        }
        catch (SQLException e){
            e.printStackTrace();

        }
    }
}
