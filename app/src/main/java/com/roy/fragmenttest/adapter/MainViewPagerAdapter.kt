package com.roy.fragmenttest.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.roy.fragmenttest.fragment.FirstFragment
import com.roy.fragmenttest.fragment.SecondFragment

class MainViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "밥"
            else -> "면"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            else -> SecondFragment()

        }
    }



}