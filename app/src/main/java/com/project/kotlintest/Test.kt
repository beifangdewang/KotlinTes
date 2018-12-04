package com.project.kotlintest

/**
 * Created by guolong on 2018/7/27.
 */
fun main(args: Array<String>) {
    //to 的方式初始化映射
    var goodsMap: Map<String, String> = mapOf("苹果" to "iphone8", "华为" to "mate10")
    //Pair方式初始化映射
    var goodsMutMap: Map<String, String> = mutableMapOf(Pair("苹果", "iphone8"), Pair("华为", "mate10"))

    var dec = ""
//    for (item in goodsMutMap) {
//        dec = "${dec}厂家：${item.key}，名称：${item.value}\n"
//    }
//    print("手机畅销榜包含如下${goodsMutMap.size}款手机：\n$dec")

//    goodsMap.forEach { key, vlue -> dec="${dec}厂家：${key},名称：${vlue}\n" }
//    print("手机畅销榜包含如下${goodsMutMap.size}款手机：\n$dec")

    var is_odd = true

    print (if (is_odd == true) "heihei" else "hehe")

    print(if (is_odd==true) "这是真确的" else "这是错误的")


}