package com.avoirom.todo.di

import com.avoirom.todo.db.WorkDatabase
import com.avoirom.todo.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel()
    }
}

val roomModule = module {
    single { WorkDatabase.getDatabase(get()) }
    single { get<WorkDatabase>().getWorkDao() }
}

val appModule = listOf(viewModelModule, roomModule)