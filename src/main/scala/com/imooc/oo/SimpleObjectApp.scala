package com.imooc.oo

object SimpleObjectApp {
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.name = "Messi"
    println(person.name + " " + person.age)
    person.watchFootball("realmadrid")

    person.printInfo()
    println(person.gender)
  }
}

class Person {

  // ==================定义属性==================
  var name:String = _

  val age = 10

  // 类里可见
//  private [this] val gender = "male"
  // 包里可见
      private [oo] val gender = "male"


  // ==================定义方法==================

  /**
    * @return String，省略类型
    */
  def eat() = name + "eat..."

  def watchFootball(teamName:String): Unit = {
    println(name + "is watching match of " + teamName)
  }

  def printInfo(): Unit = {
    println("gender : " + gender)
  }

  println("Hello")
}