package com.betterride.brcount.viewcontrollers.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.betterride.brcount.R
import com.betterride.brcount.viewcontrollers.fragments.MiPerfilFragment
import com.betterride.brcount.viewcontrollers.fragments.MisDatosFragment

import kotlinx.android.synthetic.main.activity_sessions.*

class ProfileActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setSupportActionBar(toolbar)
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        container.adapter = mSectionsPagerAdapter

        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container))
    }
    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            when(position){
                0 ->{ return MiPerfilFragment() }
                1 ->{ return MisDatosFragment() }
            }
            return MiPerfilFragment()
        }

        override fun getCount(): Int {
            return 2
        }
    }
}
