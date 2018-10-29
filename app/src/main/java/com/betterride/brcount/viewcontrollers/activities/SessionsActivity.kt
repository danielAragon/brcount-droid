package com.betterride.brcount.viewcontrollers.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.betterride.brcount.R
import com.betterride.brcount.viewcontrollers.fragments.DoneSessionsFragment
import com.betterride.brcount.viewcontrollers.fragments.PendingSessionsFragment
import kotlinx.android.synthetic.main.activity_sessions.*

class SessionsActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessions)

        setSupportActionBar(toolbar)
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        container.adapter = mSectionsPagerAdapter

        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_user, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        startActivity(Intent(this, ProfileActivity::class.java))
        return true
    }
    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            when(position){
                0 ->{
                    return PendingSessionsFragment()
                }
                1 ->{
                    return DoneSessionsFragment()
                }
            }
            return PendingSessionsFragment()
        }

        override fun getCount(): Int {
            return 2
        }
    }
}
