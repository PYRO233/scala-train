package com.imooc.oo

object ConstructorApp {
  def main(args: Array[String]): Unit = {

    // 主构造器
    val person = new Human("zhangsan", 18)
    person.printInfo

    val person2 = new Human("zhangsan", 18, "男")
    println(person2.gender)
  }
}

/**
  * 主构造器
  * 构造器属性前不指定val/var，则为 private [this] val
  */

class Human(name:String, val age:Int) {
  println("Person Constructor enter...")

  val school = "nju"



  def printInfo: Unit = {
    println(name)
  }

  var gender:String = _
  /**
    * 附属构造器
    * 附属构造器第一行必须调用主构造器或其他附属构造器
    */
  def this(name:String, age:Int, gender:String = "male") {
    this(name, age)
    this.gender = gender
  }

  println("Person Constructor leave...")
}

