package com.avoirom.todo.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.avoirom.todo.model.Work

@Dao
interface WorkDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(work: Work)
}