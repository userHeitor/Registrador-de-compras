package com.Registrador.compras;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/compras";
        String user = "postgres";
        String password = "carro123.";

        return DriverManager.getConnection(url, user, password);
    }
}
