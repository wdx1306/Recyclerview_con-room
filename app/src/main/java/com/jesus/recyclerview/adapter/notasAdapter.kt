package com.jesus.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jesus.recyclerview.R
import com.jesus.recyclerview.modelo.Nota


class notasAdapter(nota:ArrayList<Nota>,context: Context):RecyclerView.Adapter<notasAdapter.ViewHolder>() {
var notas:ArrayList<Nota>?=null
    var contexto:Context?=null

    init {
        this.notas=nota
        this.contexto= context
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val vistanota:View = LayoutInflater.from(contexto).inflate(R.layout.notalayout,parent,false)
    val notaViewHolder=ViewHolder(vistanota)
        vistanota.tag = notaViewHolder
        return notaViewHolder



    }

    override fun getItemCount(): Int {
     return this.notas!!.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.tvTitulo.text = notas!![position].Titulo
        holder.tvDescripcion.text = notas!![position].descripcion
    }

    class ViewHolder(v:View):RecyclerView.ViewHolder(v){
        lateinit var tvTitulo:TextView
        lateinit var tvDescripcion:TextView

        init{
            tvTitulo = v.findViewById(R.id.tvTitulo)
            tvDescripcion = v.findViewById(R.id.tvdescripcion)

        }
    }

}