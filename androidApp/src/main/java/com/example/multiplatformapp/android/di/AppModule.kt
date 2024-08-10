package com.example.multiplatformapp.android.di

import com.example.multiplatformapp.android.details.DetailViewModel
import com.example.multiplatformapp.android.home.HomeViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel


val appModule = module {
    viewModel { HomeViewModel(get()) }

    viewModel {
            params -> DetailViewModel(
            getMovieUseCase = get(),
            movieId = params.get()
        )
    }
}