package com.project.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_text.text = "Hello "

        var sortAsc = true
        button.setOnClickListener {
            //            button.text="点了一下"
//            toast("点击了一下")
            var or: Float = 65.5f
            var log: Long
            var or1: Float

//            log = or.toLong()
//            or1=or.toDouble().toFloat()
//            tv_text.text = or1.toString()
//
//            var strarray:Array<String> = arrayOf("小明","小红","小黑")
//
//            var str:String = ""
//            var i:Int =0
//
//            while (i < strarray.size){
//
//                str = str+strarray[i]+","
//
//                i++
//            }
//
//            tv_text.text = str

//            var str: String = or.toString()

//            if (str.indexOf(".") > 0) {
//                tv_text.text = str.subSequence(0, str.indexOf("."))
//            }

//            var strList: List<String> = str.split(".")
//
//            var strResult: String = ""
//
//            for (item in strList) {
//
//                strResult = strResult + item + ","
//            }

//            var str:String ="大鹏一日同风起。扶摇直上九万里"

//            tv_text.text = str.get(6).toString()
//            var float: Float = 65.12f
//            var i: Int = 100
//            tv_text.text = "字符串类型为 ${i.toString().length} 美元的金额为 \$$i "

//            var goodsMuset:Set<String> = setOf("iphone8","Mate10","小米6","OPPP R11","vivo x9s","魅族 Pro6s")
//            var desc=""
//            for (item in goodsMuset){
//                desc = "${desc}名称：${item}\n"
//            }
//
//            var iterator =goodsMuset.iterator()
//            while (iterator.hasNext()){
//                var item=iterator.next()
//                desc = "${desc}名称: ${item}\n"
//            }
            val goodsMuList: List<String> = listOf("iphone8", "Mate10", "小米6", "OPPP R11", "vivo x9s", "魅族 Pro6s")
//            var desc=""
//            for (i in goodsMuList.indices){
//                val item= goodsMuList[i]
//                desc = "${desc} 名称：${item}\n"
//            }
//            tv_text.text = "手机产销榜包含以下${goodsMuList.size}款手机：\n$desc"
            if (sortAsc) {

                goodsMuList.sortedBy { it.length }

                Log.i("sortedBy", goodsMuList.toString())
            } else {
                goodsMuList.sortedByDescending { it.length }

            }
            var desc = ""
            for (item in goodsMuList) {
                desc = "${desc} 名称：${item}\n"
            }

            tv_text.text = "手机产销榜已按照${if (sortAsc) "升序" else "降序"}重新排列\n$desc"
            sortAsc = !sortAsc
        }


    }


}
