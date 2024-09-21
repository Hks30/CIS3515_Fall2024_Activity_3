package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val number: Array<Int>) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount() = number.size

    override fun getItem(position: Int) = number[position]

    override fun getItemId(position: Int) = number[position].toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: TextView = convertView as TextView? ?:
        inflater.inflate(android.R.layout.simple_spinner_item, parent, false) as TextView

        view.text = number[position].toString()
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: TextView = convertView as TextView? ?:
        inflater.inflate(android.R.layout.simple_spinner_dropdown_item, parent, false) as TextView

        view.text = number[position].toString()
        view.textSize = number[position].toFloat()
        return view
    }
}