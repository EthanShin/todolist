package com.avoirom.todo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "works")
data class Work(
    @PrimaryKey @ColumnInfo(name = "work") val work: String
)