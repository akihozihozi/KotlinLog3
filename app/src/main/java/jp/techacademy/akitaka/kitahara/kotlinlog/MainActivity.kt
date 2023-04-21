package jp.techacademy.akitaka.kitahara.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("~~", 0, "~~")
        //名前を〜〜、年齢を０歳、考えを〜〜で、Humanのインスタンスを作る

        human.think()
        human.say()


    }
}