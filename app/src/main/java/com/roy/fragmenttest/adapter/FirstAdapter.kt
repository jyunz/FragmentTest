package com.roy.fragmenttest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.roy.fragmenttest.R
import com.roy.fragmenttest.data.Store

class FirstAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Store>) : ArrayAdapter<Store>(mContext,resId,mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.fragment_first_list,null)
        }

        val row = tempRow!!

        val data = mList[position]
        val storeNameTxt = row.findViewById<TextView>(R.id.storeNameTxt)
        storeNameTxt.text = data.name

        return  row
    }

}