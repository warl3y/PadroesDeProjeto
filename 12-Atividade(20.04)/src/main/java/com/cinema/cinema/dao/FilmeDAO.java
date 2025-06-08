package com.cinema.cinema.dao;

import com.cinema.cinema.bo.FilmeBO;
import com.cinema.cinema.model.Filme;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class FilmeDAO {

    private final FilmeBO filmeBO;
    private final JdbcTemplate jdbcTemplate;

    public FilmeDAO(FilmeBO filmeBO, JdbcTemplate jdbcTemplate) {
        this.filmeBO = filmeBO;
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Filme> mapper = new RowMapper<>() {
        @Override
        public Filme mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Filme(
                    rs.getLong("id"),
                    rs.getString("titulo"),
                    rs.getInt("duracao")
            );
        }
    };

    public List<Filme> listarTodos() {
        String sql = "SELECT * FROM filme";
        return jdbcTemplate.query(sql, mapper);
    }

    public Optional<Filme> buscarPorId(Long id) {
        String sql = "SELECT * FROM filme WHERE id = ?";
        List<Filme> resultado = jdbcTemplate.query(sql, mapper, id);
        return resultado.stream().findFirst();
    }

    public void salvar(Filme filme) {
        filmeBO.validarFilme(filme);
        String sql = "INSERT INTO filme (titulo, duracao) VALUES (?, ?)";
        jdbcTemplate.update(sql, filme.getTitulo(), filme.getDuracao());
    }

    public void atualizar(Filme filme) {
        filmeBO.validarFilme(filme);
        String sql = "UPDATE filme SET titulo = ?, duracao = ? WHERE id = ?";
        jdbcTemplate.update(sql, filme.getTitulo(), filme.getDuracao(), filme.getId());
    }

    public void deletar(Long id) {
        String sql = "DELETE FROM filme WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}