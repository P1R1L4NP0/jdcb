package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // static -> altera o escopo, pertence a classe
    // tem apenas uma referência na memória
    private static ConnectionFactory instance;

    // Restringe a criação de objetos da classe
    private ConnectionFactory(){}

    // Obtem um objeto da fábrica
    public static ConnectionFactory getInstance(){
        if(instance == null) instance = new ConnectionFactory();
        return instance;
    }

    // Cria as conexões com o banco
    public Connection get() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/poo_2_b";
        String user = "root";
        String password = "univille";
        return DriverManager.getConnection(url,user,password);
    }

}
