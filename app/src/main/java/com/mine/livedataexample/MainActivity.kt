package com.mine.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.mine.livedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mm: MineViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mm = ViewModelProvider(this).get(MineViewHolder::class.java)

        // now we add observer to produce live data
        mm.ccLiveData.observe(this){
            binding.number.text = "$it"
        }

        binding.counter.setOnClickListener{
            mm.counterPlus()
        }



    }
}