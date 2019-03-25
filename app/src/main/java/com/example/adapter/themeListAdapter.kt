package com.example.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.crud.R
import com.example.models.Theme
import java.lang.Integer.parseInt


class ThemeListAdapter(items: ArrayList<Theme>, ctx: Context) :
    ArrayAdapter<Theme>(ctx, R.layout.activity_theme_list, items) {

    private class ThemeListItemViewHolder {
        internal var image: ImageView? = null
        internal var name: TextView? = null
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
        var view = view

//        if (view == null) {
        val inflater = LayoutInflater.from(context)
        view = inflater.inflate(R.layout.activity_theme_list, viewGroup, false)

        val viewHolder = ThemeListItemViewHolder()

        viewHolder.name = view.findViewById<View>(R.id.themeNametextView) as TextView
        viewHolder.image = view.findViewById<View>(R.id.themeImageView) as ImageView
//        }
//    else {
//            viewHolder = view.tag as ThemeListItemViewHolder
//        }

        val theme = getItem(i)
        viewHolder.name!!.text = theme.name
        viewHolder.image!!.setImageResource(theme.image)

        view.tag = viewHolder

        return view
    }


}