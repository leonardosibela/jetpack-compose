package com.example.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentWithXMLActivity : AppCompatActivity(R.layout.activity_fragment_with_xml_activity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RecipeListFragment())
            .commit()

    }
}