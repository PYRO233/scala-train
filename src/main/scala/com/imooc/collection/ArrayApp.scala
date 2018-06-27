package com.imooc.collection

import scala.collection.mutable.ArrayBuffer

object ArrayApp extends App {

  //=================定长数组=================
  val a = new Array[String](5)

  a(0) = "hadoop"

  // 调用object的apply方法
  val b = Array("Hadoop", "Spark", "Storm")

  val c = Array(1,2,3,4,5,6,7,8,9)

  c.max
  c.min
  c.sum

  c.mkString
  c.mkString(",")
  c.mkString("<", ",", ">")


  //=================变长数组=================
  val m = ArrayBuffer[Int]()
  m += 1
  m += (2,3,4,5)
  m ++= Array(6,7,8,9,10)
  m.insert(0,0)
  m.remove(10)
  m.trimEnd(1)
  m.toArray

  // 遍历
  for (ele <- m) println(ele)

  // 逆序遍历
  for (ele <- m.reverse) print(ele)

  m.clear()

}
