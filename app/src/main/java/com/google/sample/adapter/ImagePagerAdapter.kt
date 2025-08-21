package com.google.sample.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.sample.adapter.ImageData.IMAGE_DRAWABLES
import com.google.sample.fragment.ImageFragment

class ImagePagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val fragments = hashMapOf<Int, Fragment>()

    override fun createFragment(position: Int): Fragment {
        val newFragment = ImageFragment.newInstance(IMAGE_DRAWABLES[position])
        fragments[position] = newFragment
        return newFragment
    }

    override fun getItemCount(): Int {
        return IMAGE_DRAWABLES.size
    }

    fun getFragment(position: Int): Fragment? {
        return fragments[position]
    }
}