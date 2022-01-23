package com.example.viewpager

import Adapters.ImageAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var imageList: ArrayList<String>
lateinit var  imageAdapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


imageList=ArrayList()
      //  imageList.add("https://storage.kun.uz")
        imageList.add(R.drawable.avangers.toString())
        imageList.add(R.drawable.iron.toString())
        imageList.add(R.drawable.letter_a.toString())
        imageList.add(R.drawable.photo_three.toString())
        imageList.add(R.drawable.photo_two.toString())
        imageList.add(R.drawable.ultron.toString())



        imageAdapter= ImageAdapter(imageList)
        view_pager.adapter=imageAdapter
    }
}