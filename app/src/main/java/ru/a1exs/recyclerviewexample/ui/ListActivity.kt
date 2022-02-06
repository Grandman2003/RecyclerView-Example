package ru.a1exs.recyclerviewexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.a1exs.recyclerviewexample.databinding.ActivityListBinding
import ru.a1exs.recyclerviewexample.domain.UserDataProvider

abstract class ListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding
    abstract val usersProvider: UserDataProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //todo set adapter
    }

}