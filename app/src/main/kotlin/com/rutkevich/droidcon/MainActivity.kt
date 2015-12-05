package com.rutkevich.droidcon

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

public class MainActivity : AppCompatActivity() {

    // View is final, non-nullable
    private val toolbar: Toolbar by lazy {findViewById(R.id.toolbar) as Toolbar }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title = "Title"

        setSupportActionBar(toolbar)
    }

}
