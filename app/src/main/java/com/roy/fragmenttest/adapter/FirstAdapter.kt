package com.roy.fragmenttest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.roy.fragmenttest.data.Store

class FirstAdapter(val mContext : Context, val resId : Int, val mList : List<Store>) : ArrayAdapter<Store>(mContext,resId,mList) {

    val inflater = LayoutInflater.from(mContext)

}