package com.example.todoapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.todoapp.Todo

@Dao
interface TodoDao {

    @Query("select * from Todo order by createdAt desc")
    fun getAllTodo(): LiveData<List<Todo>>

    @Upsert
    fun addTodo(todo: Todo)

    @Query("delete from Todo where id =:id ")
    fun deleteTodo(id:Int )
}