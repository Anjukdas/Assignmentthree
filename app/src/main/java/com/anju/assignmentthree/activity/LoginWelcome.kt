package com.anju.assignmentthree.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.anju.assignmentthree.R
import com.google.android.material.navigation.NavigationView

class LoginWelcome : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_welcome)

        drawerLayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinateLayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frame)
        navigationView = findViewById(R.id.navigationView)
        setUpToolbar()
        val actionBarDrawerToggle=ActionBarDrawerToggle(this@LoginWelcome,drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homepage ->{
                    Toast.makeText(this@LoginWelcome,"homepage clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.myprofile ->{
                    Toast.makeText(this@LoginWelcome,"my profile", Toast.LENGTH_SHORT).show()
                }
                R.id.favourite_Restaurants ->{
                    Toast.makeText(this@LoginWelcome,"Favour", Toast.LENGTH_SHORT).show()
                }
                R.id.faqs ->{
                    Toast.makeText(this@LoginWelcome,"faq clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.logout ->{
                    Toast.makeText(this@LoginWelcome,"logout clicked", Toast.LENGTH_SHORT).show()
                }
            }

            return@setNavigationItemSelectedListener true
        }
    }


    fun  setUpToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title="Toolbar Title"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id= item.itemId
        if(id==android.R.id.home)
            drawerLayout.openDrawer(GravityCompat.START)

        return super.onOptionsItemSelected(item)
    }
}