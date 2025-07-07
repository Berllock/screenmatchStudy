package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;

public record EpisodioDTO(Integer temporada, Integer numeroEpisodio, String titulo) {
}