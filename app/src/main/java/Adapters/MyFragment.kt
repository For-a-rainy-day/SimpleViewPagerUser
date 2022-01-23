package Adapters

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyFragment (val list: List<String>, fragmentManager: FragmentManager)
    :FragmentPagerAdapter
{
}