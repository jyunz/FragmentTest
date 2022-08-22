package com.roy.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.roy.fragmenttest.adapter.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()

    }
    override fun setUpEvents() {
//        버튼 클릭등의 이벤트 관련 코드 모음.
    }

    override fun setValues() {
//        화면에 데이터를 표시하기 위한 코드 모음

//        뷰 페이저 작업

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

//        탭에리아웃과 연결
        mainTabLayout.setupWithViewPager(mainViewPager)
    }


}