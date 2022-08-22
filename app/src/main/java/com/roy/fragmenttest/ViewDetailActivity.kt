package com.roy.fragmenttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.roy.fragmenttest.data.Store
import kotlinx.android.synthetic.main.activity_view_detail.*

class ViewDetailActivity :BaseActivity() {


    lateinit var mStoreData : Store


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_detail)
    }

    override fun setUpEvents() {
    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("storeData") as Store
        storeNameTxt.text = mStoreData.name

    }

}