package com.weydla.projetofinal.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entidade Room para Persistência Local (Prática 07 - Room)
 * Armazena os filmes de terror favoritados e notas pessoais da usuária.
 */
@Entity(tableName = "filmes_favoritos")
data class FilmeTerror(
    @PrimaryKey
    val id: Int,
    val titulo: String,
    val ano: String,
    val diretor: String,
    val sinopse: String,
    val notaImdb: String,
    val posterUrl: String,
    val subgenero: String,
    val assistido: Boolean = false,
    val comentarioPessoal: String = ""
)

/**
 * Modelos de resposta da API Pública (TVMaze API - Prática 08 - Retrofit)
 * Documentação: https://api.tvmaze.com/search/shows?q=horror
 */
data class TvMazeSearchResponse(
    val score: Double?,
    val show: TvMazeShowDto?
)

data class TvMazeShowDto(
    val id: Int,
    val name: String?,
    val premiered: String?,
    val summary: String?,
    val genres: List<String>?,
    val rating: TvMazeRatingDto?,
    val image: TvMazeImageDto?,
    val network: TvMazeNetworkDto?
)

data class TvMazeRatingDto(
    val average: Double?
)

data class TvMazeImageDto(
    val medium: String?,
    val original: String?
)

data class TvMazeNetworkDto(
    val name: String?
)
