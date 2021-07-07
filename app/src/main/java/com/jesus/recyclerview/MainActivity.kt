package com.jesus.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jesus.recyclerview.adapter.notasAdapter
import com.jesus.recyclerview.modelo.Nota
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var recycleNotas:RecyclerView
    lateinit var app:NotaApp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleNotas = findViewById(R.id.listanotas)

        app= applicationContext as NotaApp
        val notas = ArrayList<Nota>()
        notas.add(Nota("Primera nota","Una descripcion Mas larga" +
                "dhfdhsjfhkdjhfdkshfjk"))
        notas.add(Nota("Primera nota -1","Una descripcion"))
        notas.add(Nota("Primera nota -2","Una descripcion"))
        notas.add(Nota("Primera nota -3","Una descripcion"))
        notas.add(Nota("Primera nota -4","Una descripcion"))
        notas.add(Nota("Primera nota -5","Una descripcion"))
        notas.add(Nota("Primera nota -6","Una descripcion"))

recycleNotas.layoutManager= GridLayoutManager(this, 2)
recycleNotas.setHasFixedSize(true)
        recycleNotas.adapter = notasAdapter(notas,this)
    }


    override fun onResume() {
        super.onResume()
        lifecycleScope.launch {
val notas = app.room.notadao().obtenerTodas()

   for (nota in notas){
       Log.d("Notas",nota.titulo)
   }
        }
    }
}