package jp.techacademy.yuuki.nakayama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human1 = Human("田中", 22, "音楽")
        human1.say()
        human1.think()

        val human2 = Human("鈴木", 25, "映画")
        human2.say()
        human2.think()
    }
}
