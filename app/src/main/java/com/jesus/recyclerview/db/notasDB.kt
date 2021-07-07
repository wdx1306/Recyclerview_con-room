package com.jesus.recyclerview.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [nota1::class],
version = 1

)

abstract class notasDB:RoomDatabase(){
    abstract fun notadao():notadao


}