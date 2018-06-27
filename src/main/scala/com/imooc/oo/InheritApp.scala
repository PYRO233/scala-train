package com.imooc.oo

object InheritApp {
  def main(args: Array[String]): Unit = {
    val student = new Student("lisi", 18,"male", "Math")

    // 子类会继承父类的可见性
//    println(student.name)
    println(student.nameGetter)
    println(student.gender)
  }
}

/**
  *
  * @param name 从父类主构造器继承而来
  * @param age 从父类主构造器继承而来
  * @param gender 从父类附属构造器继承而来
  * @param major 子类新增属性
  */
class Student(name:String, age:Int, gender:String, val major:String) extends Human(name, age, gender) {
  println("Person Student leave...")

  def nameGetter = name
  println("Person Student leave...")

  override def printInfo: Unit = {

  }
}