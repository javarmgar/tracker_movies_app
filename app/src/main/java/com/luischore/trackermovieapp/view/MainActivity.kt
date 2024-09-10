package com.luischore.trackermovieapp.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luischore.trackermovieapp.R
import com.luischore.trackermovieapp.viewmodel.MovieServiceViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MovieServiceViewModel by viewModels { MovieServiceViewModel.Factory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
}