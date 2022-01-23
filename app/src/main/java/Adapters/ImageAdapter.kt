package Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ImageAdapter(val list: List<String>):PagerAdapter() {
    override fun getCount(): Int =list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view== `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
     val layoutInflater= LayoutInflater.from(container.context).inflate(R.layout.item_view_pager, container, false)

        Picasso.get().load(list[position]).into(layoutInflater.image_vp)

        container.addView(layoutInflater)
        return layoutInflater
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view= `object` as View
        container.removeView(view)

        //super.destroyItem(container, position, `object`)
    }

}