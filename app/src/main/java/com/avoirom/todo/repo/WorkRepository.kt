package com.avoirom.todo.repo

import com.avoirom.todo.db.WorkDao
import com.avoirom.todo.model.Work

class WorkRepository(private val workDao: WorkDao) {
    
    suspend fun insert(word: Work) {
        workDao.insert(word)
    }
}