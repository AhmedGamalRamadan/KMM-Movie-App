package com.example.multiplatformapp.data.repository

import com.example.multiplatformapp.data.remote.RemoteDataSource
import com.example.multiplatformapp.data.util.toMovie
import com.example.multiplatformapp.domain.model.Movie
import com.example.multiplatformapp.domain.repository.MovieRepository


internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}