package com.example.helloworld.telas
import android.content.Context
import androidx.room.Room
import com.example.helloworld.banco.AppDatabase

class CreateDBS() {

    companion object {
        private val INSTANCE : AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null){
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "database-name"
                ).build()
            }
            return INSTANCE!!
        }

    }

}
