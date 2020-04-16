package com.example.bedenimne

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val tab = findViewById<TabLayout>(R.id.tab)

        val pager = findViewById<ViewPager>(R.id.pager)

        pager.adapter = pageAdapter(supportFragmentManager)

        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab))

        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }

            override fun onTabSelected(p0: TabLayout.Tab?) {

                pager.currentItem = p0!!.position

            }

        })
    }

    class pageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {

            when (position) {
                0 -> return home()
                1 -> return omuz()
                2 -> return bel()
                else -> return hesap()
            }

        }

        override fun getCount(): Int {

            return 4

        }

    }
}
