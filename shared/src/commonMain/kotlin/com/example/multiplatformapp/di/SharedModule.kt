package com.example.multiplatformapp.di

import com.example.multiplatformapp.data.remote.MovieService
import com.example.multiplatformapp.data.remote.RemoteDataSource
import com.example.multiplatformapp.data.repository.MovieRepositoryImpl
import com.example.multiplatformapp.domain.repository.MovieRepository
import com.example.multiplatformapp.domain.usecase.GetMovieUseCase
import com.example.multiplatformapp.domain.usecase.GetMoviesUseCase
import com.example.multiplatformapp.util.provideDispatcher
import org.koin.dsl.module


private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules