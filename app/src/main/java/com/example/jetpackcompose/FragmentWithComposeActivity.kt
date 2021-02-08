package com.example.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentWithComposeActivity : AppCompatActivity(R.layout.activity_fragment_with_compose) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RecipeListComposeFragment())
            .commit()
    }
}