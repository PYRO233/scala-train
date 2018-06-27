package com.imooc

object LoopApp {
  def main(args: Array[String]): Unit = {

    /**
      * 普通for循环
      */
    // 法1
    for(i <- 1 to 10) {
      print(i + " ")
    }
    println()
    // 法2
    for(i <- 1 to(10)) {
      print(i + " ")
    }
    println()
    // 法3
    for(i <- 1.to(10) if i%2 == 0) {
      print(i + " ")
    }
    println()
    // 法4
    for (i <- Range(1, 11)) {
      print(i + " ")
    }
    println()
    for (i <- Range(1, 11, 1)) {
      print(i + " ")
    }
    println()
    // 法6
    for (i <- 1 until 11) {
      print(i + " ")
    }
    println()
    // 法7
    for (i <- 1 until(11)) {
      print(i + " ")
    }
    println()
    // 法8
    for (i <- 1.until(11)) {
      print(i + " ")
    }
    println()
    // 法9
    for (i <- 1 until(11, 1)) {
      print(i + " ")
    }
    println()

    /**
      * 增强型
      */
    val courses = Array("Hadoop", "SparkSQL", "SparkStreaming")

    // 法1
    for (course <- courses) {
      println(course)
    }

    // 法2
    courses.foreach(course => println(course))

    /**
      * while循环, 1 到 10
      */
    var (num, sum) = (10, 0)
    while(num > 0) {
      sum += num
      num -= 1
    }
    println(sum)
  }
}
