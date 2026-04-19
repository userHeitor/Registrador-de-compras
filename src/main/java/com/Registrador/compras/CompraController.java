package com.Registrador.compras;

import org.springframework.web.bind.annotation.*;
import java.sql.*;
import java.util.*;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @GetMapping
    public List<Compra> listar() {
        List<Compra> lista = new ArrayList<>();

        try {
            Connection conn = Conexao.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM compras");

            while (rs.next()) {
                lista.add(new Compra(
                        rs.getString("nome"),
                        rs.getDouble("valor")));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    @PostMapping
    public Compra adicionar(@RequestBody Compra compra) {
        System.out.println("CHEGOU POST: " + compra.getNome() + " - " + compra.getValor());

        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO compras(nome, valor) VALUES (?, ?)");

            stmt.setString(1, compra.getNome());
            stmt.setDouble(2, compra.getValor());
            stmt.execute();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return compra;
    }
}
