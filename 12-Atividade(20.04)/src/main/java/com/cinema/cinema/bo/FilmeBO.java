package com.cinema.cinema.bo;

import com.cinema.cinema.model.Filme;
import org.springframework.stereotype.Service;

@Service
public class FilmeBO {

    public void validarFilme(Filme filme) {
        if (filme == null) {
            throw new IllegalArgumentException("O filme não pode ser nulo.");
        }

        if (filme.getTitulo() == null || filme.getTitulo().trim().isEmpty()) {
            throw new IllegalArgumentException("O título do filme é obrigatório.");
        }

        if (filme.getDuracao() <= 0) {
            throw new IllegalArgumentException("A duração do filme deve ser maior que zero.");
        }
    }
}