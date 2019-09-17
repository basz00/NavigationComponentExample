package com.baz.navcomex


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    private val mainActivity by lazy { activity as MainActivity }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navGraphIds = listOf(
            R.navigation.nav_first_graph,
            R.navigation.nav_second_graph,
            R.navigation.nav_third_graph
        )
        val controller = bottomNavigationView.setupWithNavController(
            navGraphIds, activity!!.supportFragmentManager,
            R.id.mainNavHostFragment, activity!!.intent
        )
        controller.observe(this, Observer {
            mainActivity.navigationController = it
            mainActivity.setupActionBarWithNavController(mainActivity.navigationController)
        })
    }
}
