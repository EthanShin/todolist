package com.avoirom.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avoirom.todo.ui.ListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.listFragment, ListFragment.newInstance())
                .commitNow()
        }
    }
}