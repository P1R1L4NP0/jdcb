package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO extends BaseDAO{

    public void deletarPeloId(long id){
        String sql = "UPDATE Pessoa\n" +
                "SET Nome = ?,\n" +
                "    Sobrenome = ?,\n" +
                "    DataNascimento = ?,\n" +
                "    Ativo = ?,\n" +
                "    CPF = ?,\n" +
                "    Peso = ?,\n" +
                "    Altura = ?\n" +
                "WHERE Id = ?; ";
        // try-with-resources
        // fecha a conexao automaticamente.
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(sql)){
            pre.setLong(1,id);
            pre.execute();
        }catch (SQLException e){
            System.out.println("Erro ao deletar pelo id:"+id);
            System.out.println("Erro: "+e.getMessage());
        }
    }

}