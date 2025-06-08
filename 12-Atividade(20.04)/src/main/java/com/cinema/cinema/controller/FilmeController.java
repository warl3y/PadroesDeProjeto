package com.cinema.cinema.controller;

import com.cinema.cinema.dao.FilmeDAO;
import com.cinema.cinema.model.Filme;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeDAO filmeDAO;

    public FilmeController(FilmeDAO filmeDAO) {
        this.filmeDAO = filmeDAO;
    }

    @GetMapping
    public List<Filme> listarTodos() {
        return filmeDAO.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id) {
        return filmeDAO.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Filme filme) {
        try {
            filmeDAO.salvar(filme);
            return ResponseEntity.ok("Filme salvo com sucesso.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizar(@PathVariable Long id, @RequestBody Filme filme) {
        if (!filmeDAO.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        filme.setId(id); // garante que o ID do path sobrescreva o do corpo
        filmeDAO.atualizar(filme);
        return ResponseEntity.ok("Filme atualizado com sucesso.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        if (!filmeDAO.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        filmeDAO.deletar(id);
        return ResponseEntity.ok("Filme deletado com sucesso.");
    }
}