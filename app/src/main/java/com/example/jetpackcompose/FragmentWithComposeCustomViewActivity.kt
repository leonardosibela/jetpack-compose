package com.example.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FragmentWithComposeCustomViewActivity :
    AppCompatActivity(R.layout.activity_fragment_with_compose_custon_view) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .replace(R.id.custom_view_fragment_container, CustomViewWithComposeFragment())
            .commit()
    }
}