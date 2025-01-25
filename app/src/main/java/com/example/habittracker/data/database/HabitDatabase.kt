package com.example.habittracker.data.database
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
//import kotlin.jvm.Volatile // Ensure this is imported
import com.example.habittracker.data.models.HabitModel
import com.example.habittracker.logic.dao.HabitDao

//@Database(entities = [HabitModel::class], version = 1, exportSchema = false)
//abstract class HabitDatabase : RoomDatabase() {
//
//    abstract fun habitDao(): HabitDao
//
//    companion object {
//        @Volatile
//        private var INSTANCE: HabitDatabase? = null
//
//        fun getDatabase(context: Context): HabitDatabase {
//            val tempInstance = INSTANCE
//            if (tempInstance != null) {
//                return tempInstance
//            }
//            synchronized(this) { // Ensure synchronized block is correctly written
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    HabitDatabase::class.java,
//                    "habit_database"
//                ).build()
//                INSTANCE = instance
//                return instance
//            }
//        }
//        }
//    }
//}
@Database(entities = [HabitModel::class], version = 1)
abstract class HabitDatabase : RoomDatabase() {
    abstract fun habitDao(): HabitDao
}


