package com.ekemini.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ekemini.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var todoList = mutableListOf(
            ToDo("EKemini Ikpe",false),
            ToDo("Female",false),
            ToDo("fair in complexion",false),
            ToDo("Love Food",false),
            ToDo("Actively learning kotlin",false),
            ToDo("Done with school",false),
            ToDo("An introvert",false)

        )

        val rv = findViewById<View>(R.id.rvToDo) as RecyclerView
        val btnAddTodo = findViewById<View>(R.id.btnToDo) as Button
        val etTodo = findViewById<View>(R.id.etTodo) as TextView

        val adapter = ToDoAdapter(todoList)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener{
            val title = etTodo.text.toString()
            val todo = ToDo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }

    }



    }

