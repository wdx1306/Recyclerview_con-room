package com.jesus.recyclerview.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class nota1(
    @PrimaryKey(autoGenerate = true)
        val id:Int,
        val titulo:String,
        val descripcion:String
)