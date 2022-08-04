package com.nokopi.test2

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "AAA"
        val honto = "AAA"

        str_search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                // text changed
                str.text = newText
                return false
            }
            override fun onQueryTextSubmit(query: String): Boolean {
                // submit button pressed
//                str.text = query
                return false
            }
        })

        if (text.equals(honto)){
            purchase.text = "AAA"
        } else {
            purchase.text = "CCC"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        val searchItem = menu?.findItem(R.id.app_bar_search)
        val searchView = searchItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                //text changed
                textView5.text = newText
                return false
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                //submit button pressed
                return false
            }
        })
        return true
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN ->{
                textView.text = "押された"
            }
            MotionEvent.ACTION_UP ->{
                textView.text = "離れた"
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.app_bar_search -> {

            }
        }
        return super.onOptionsItemSelected(item)
    }
}