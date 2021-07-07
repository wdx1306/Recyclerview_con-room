package com.jesus.recyclerview.db

import androidx.room.*

@Dao
interface notadao {
    @Query("SELECT * FROM nota1")
   suspend fun obtenerTodas():List<nota1>

    @Query("SELECT * FROM nota1 WHERE id=:id")
    suspend   fun getByID(id:Int):nota1

    @Update()
    suspend   fun Update(nota1: nota1)


    @Insert
    suspend   fun Insert(nota1:List<nota1>)

    @Delete
    suspend  fun delete(nota1: nota1)

}