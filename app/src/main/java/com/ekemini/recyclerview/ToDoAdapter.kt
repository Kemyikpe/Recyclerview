package com.ekemini.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekemini.recyclerview.databinding.ItemTodoBinding

class ToDoAdapter (
    var toDos:List<ToDo>
        ): RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {


    inner class ToDoViewHolder(val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemTodoBinding.inflate(layoutInflater, parent, false)
        return ToDoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return toDos.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.binding.apply {
            title.text = toDos[position].title
            cbDone.isChecked = toDos[position].isChecked
            // tvTitle this now works
        }
    }


}