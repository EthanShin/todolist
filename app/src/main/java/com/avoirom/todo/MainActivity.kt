package com.avoirom.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avoirom.todo.ui.ListFragment
import com.avoirom.todo.ui.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.listFragment, ListFragment.newInstance())
                .commitNow()
        }
    }
}