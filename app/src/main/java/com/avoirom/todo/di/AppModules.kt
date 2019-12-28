package com.avoirom.todo.di

import com.avoirom.todo.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel()
    }
}

val appModule = listOf(viewModelModule)