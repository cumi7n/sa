package com.example.weather2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.toolbox.Volley
import com.example.weather2.databinding.ActivityMainBinding
import com.example.weather2.fragments.MainFragment
import org.json.JSONObject

const val API_KEY = "af0a18502b33468abb5150047230101"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()




    }
}