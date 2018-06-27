package com.imooc.oo

object ApplyApp {
  def main(args: Array[String]): Unit = {
//    for (i <- 1 to 10) {
//      ApplyTest.incr
//    }
//    println(ApplyTest.count)

    // 调用的是object.apply方法
    val o = ApplyTest()
    // 类名() => object.apply
    ApplyTest()

    // 对象() => class.apply
    val c = new ApplyTest
    c()
    o()
  }
}

// 伴生类
class ApplyTest {
  def apply() = {
    println("class ApplyTest apply...")
  }
}


// 伴生对象
object ApplyTest {
  println("object ApplyTest come...")
  var count = 0

  def incr = count = count + 1

  /**
    * 最佳实践：在object的apply方法中去new class
    * @return class ApplyTest 实例
    */
  def apply():ApplyTest = {
    println("object ApplyTest apply...")

    // 在object中的apply中new class
    new ApplyTest
  }

  println("object ApplyTest leave...")
}