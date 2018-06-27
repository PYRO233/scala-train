package com.imooc.oo

object AbstractObjectApp {
  def main(args: Array[String]): Unit = {
    val worker = new Worker;
    worker.speak
  }
}

abstract class Adult {
  def speak
  val name:String
  val age:Int
}

class Worker extends Adult {
  override val age = 18
  override val name = "lisi"

  override def speak: Unit = {
    println(age + " " + name + " speak")
  }
}
