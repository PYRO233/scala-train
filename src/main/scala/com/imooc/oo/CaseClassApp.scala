package com.imooc.oo

object CaseClassApp {
  def main(args: Array[String]): Unit = {
    // 不用new
    println(Dog("xy").name)
  }
}


case class Dog(name:String)
