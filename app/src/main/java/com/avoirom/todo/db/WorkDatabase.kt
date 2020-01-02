package com.avoirom.todo.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.avoirom.todo.model.Work

@Database(entities = arrayOf(Work::class), version = 1, exportSchema = false)
public abstract class WorkDatabase : RoomDatabase() {

    abstract fun getWorkDao(): WorkDao

    companion object {
        @Volatile
        private var INSTANCE: WorkDatabase? = null

        fun getDatabase(context: Context): WorkDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WorkDatabase::class.java,
                    "work_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}