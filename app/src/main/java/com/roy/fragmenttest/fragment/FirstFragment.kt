package com.roy.fragmenttest.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.roy.fragmenttest.R
import com.roy.fragmenttest.ViewDetailActivity
import com.roy.fragmenttest.adapter.FirstAdapter
import com.roy.fragmenttest.data.Store
import kotlinx.android.synthetic.main.fragment_first_list.*
import kotlinx.android.synthetic.main.fragment_second_list.*

class FirstFragment : Fragment() {

    val mFirstStoreDataList = ArrayList<Store> ()
    lateinit var mFirstStoreAdapter : FirstAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_list, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mFirstStoreDataList.add( Store("낙지마당", "02-1515-5959"))
        mFirstStoreDataList.add( Store("한상차림", "02-1515-5959"))
        mFirstStoreDataList.add( Store("닭갈비", "02-1515-5959"))
        mFirstStoreDataList.add( Store("갈비탕", "02-1515-5959"))
        mFirstStoreDataList.add( Store("비빔밥", "02-1515-5959"))
        mFirstStoreDataList.add( Store("돈가스", "02-1515-5959"))

        mFirstStoreAdapter = FirstAdapter(requireContext(),R.layout.fragment_first_list, mFirstStoreDataList)

        firstStoreListView.adapter = mFirstStoreAdapter

        firstStoreListView.setOnItemClickListener { parent, view, position, id ->
            val clickedStore = mFirstStoreDataList[position]

            val myIntent = Intent(requireContext(), ViewDetailActivity::class.java)
            myIntent.putExtra("storeData", clickedStore)
            startActivity(myIntent)
        }
    }

}