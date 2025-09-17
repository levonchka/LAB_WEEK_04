package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title
)

val TABS_CONTENT = listOf(
    R.string.starbucks_desc,
    R.string.janjijiwa_desc,
    R.string.kopikenangan_desc
)

class CafeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val fragmentRef = fragment

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val contentResId = TABS_CONTENT[position]
        val content = fragmentRef.requireContext().getString(contentResId)
        return CafeDetailFragment.newInstance(content)
    }
}
