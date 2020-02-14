package jp.techacademy.yuuki.nakayama

import android.util.Log

open class Human : Animal, Thinkable {

    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }
    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kadai", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kadai", "私は" + this.hobby + "について考える。")
    }
}