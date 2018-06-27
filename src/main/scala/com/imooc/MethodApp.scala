package com.imooc

object MethodApp {
  def main(args: Array[String]): Unit = {
    println(add(2, 3))

    println(addThree())
    // 没有参数的函数调用时可以省略括号
    println(addThree)

    sayHello()
    sayHello
    // 调用时不能带括号
    sayWorld

    loadConf()

    println(sum(1, 2, 3, 4, 5, 6))

  }

  // 最后一行为返回值，不用return
  def add(x:Int, y:Int):Int = {
    x + y
  }

  // 方法体只有一行可以省略打括号
  def addThree() = 1 + 2

  // 无返回值
  def sayHello(): Unit = {
    print("hello")
  }

  /**
    * 无参数无返回值
    * 在定义带有参数的函数时，括号才是必须的
    */
  def sayWorld() = println("world")

  // 默认参数
  def loadConf(conf:String = "Spark-defaults.conf"): Unit = {
    println(conf)
  }

  // 可变参数
  def sum(numbers:Int*) = {
    var result = 0
    for (number <- numbers) {
      result += number
    }
    result
  }
}
