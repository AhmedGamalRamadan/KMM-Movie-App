package com.example.multiplatformapp.domain.repository

import com.example.multiplatformapp.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}