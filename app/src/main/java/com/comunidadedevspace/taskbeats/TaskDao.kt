package com.comunidadedevspace.taskbeats

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(task: Task)

    @Query("Select * from task")
    fun getAll(): List<Task>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(task: Task)

    //Deletando todos
    @Query("DELETE from task")
    fun deleteAll()

    //Deletando por id
    @Query("DELETE from task WHERE id =:id")
    fun deleteById(id : Int)

}