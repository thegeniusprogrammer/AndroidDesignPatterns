package com.thegeniusprogrammer.androiddesignpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thegeniusprogrammer.androiddesignpatterns.BuilderPattern.Hamburger
import com.thegeniusprogrammer.androiddesignpatterns.BuilderPattern.HamburgerDataClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hamburger = Hamburger.Builder()
            .butter(true)
            .cheese(true)
            .onions(false)
            .build()


        val hamburgerDataClass = HamburgerDataClass(
            butter = true,
            cheese = true,
            onions = false
        )
    }
}