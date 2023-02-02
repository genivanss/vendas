package io.github.genivanss.domain.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import io.github.genivanss.domain.entity.Cliente;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class Clientes {

    private static final String INSERT = "INSERT INTO cliente (nome) VALUES (?)";

    private static final String SELECT_ALL = "SELECT * FROM cliente";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cliente salvar(Cliente cliente) {
        // acessar a base de dados
        jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()});
        return cliente;
    }

    public List<Cliente> obterTodos() {
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Cliente>() {
            @Override
            public Cliente mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                return new Cliente(id, nome);
            }
        });
    }
    
}
