package com.imooc.collection

import scala.collection.mutable.ListBuffer

object ListApp extends App {
  //=================定长List=================
  val list = List(1,2,3,4,5)

  list.head
  list.tail
  val list2 = 1 :: Nil // 1为head，Nil为tail生成一个List


  //=================变长List=================
  val l = ListBuffer[Int]()
  l += 1
  l += (2,3,4)
  l ++= List(5,6,7,8)

  l -= 1
  l -= (2,3,4)
  l --= List(5,6,7,8,9) // 有就删除，没有则不处理

  l.toArray
  l.toList
//  l.tail.head

  // 求和函数
  def sum(nums:Int*):Int = {
    if (nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail:_*)
    }
  }

  println(sum(1,2,3,4,5))
}
