package com.rich.workmanagertask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rich.workmanagertask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val viewModel: BlurViewModel by lazy {
        BlurViewModel(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveUpdate.setOnClickListener {
            viewModel.applyBlur()
        }
    }
}