package com.jesus.recyclerview

import android.app.Application
import androidx.room.Room
import com.jesus.recyclerview.db.notasDB


class NotaApp:Application() {


        val room = Room.databaseBuilder(this,notasDB::class.java,"Notas_db")
            .build()

}