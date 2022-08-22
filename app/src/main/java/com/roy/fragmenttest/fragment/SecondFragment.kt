package com.roy.fragmenttest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.roy.fragmenttest.R
import com.roy.fragmenttest.adapter.SecondAdapter
import com.roy.fragmenttest.data.Store

class SecondFragment :Fragment() {


    val mSecondStoreDataList = ArrayList<Store> ()
    lateinit var mSecondAdapter: SecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_list, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mSecondStoreDataList.add( Store("우육면", "02-1515-5959"))
        mSecondStoreDataList.add( Store("우육면", "02-1515-5959"))
        mSecondStoreDataList.add( Store("우육면", "02-1515-5959"))
        mSecondStoreDataList.add( Store("우육면", "02-1515-5959"))
        mSecondStoreDataList.add( Store("우육면", "02-1515-5959"))
        mSecondStoreDataList.add( Store("우육면", "02-1515-5959"))


        mSecondAdapter = SecondAdapter(requireContext(),
            R.layout.fragment_second_list, mSecondStoreDataList)

    }

}