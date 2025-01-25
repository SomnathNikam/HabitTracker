package com.example.habittracker.logic.dao

import androidx.lifecycle.LiveData
import androidx.room.*
//import com.federicocotogno.habittracker2020.data.models.Habit
import com.example.habittracker.data.models.HabitModel

@Dao
interface HabitDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addHabit(habit: HabitModel)

    @Update
    suspend fun updateHabit(habit: HabitModel)

    @Delete
    suspend fun deleteHabit(habit: HabitModel)

    @Query("SELECT * FROM habit_table ORDER BY id DESC")
    fun getAllHabits(): LiveData<List<HabitModel>>

    @Query("DELETE FROM habit_table")
    suspend fun deleteAll()
}