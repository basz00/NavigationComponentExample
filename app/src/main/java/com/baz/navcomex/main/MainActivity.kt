package com.baz.navcomex.main

import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.baz.navcomex.R
import com.baz.navcomex.injection.DummyDependency
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {


    lateinit var navigationController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationController = findNavController(R.id.navHostFragment)
    }

    override fun onSupportNavigateUp() = navigationController.navigateUp()
}
