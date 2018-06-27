package com.imooc.oo

object TraitApp extends App {
  val myCarId1 = new BYDCarId()
  val myCarId2 = new BMWCarId()
  println(myCarId1.currentId())
  println(myCarId2.currentId())

  // =================== 实验具体方法 ===================
  myCarId1.greeting("hello")
}

// 包含抽象字段和抽象方法的Trait
trait CarId {
  var id:Int
  def currentId():Int
}

// 包含具体方法的Trait
trait CarGreeting {
  def greeting(msg:String) { println(msg) }
}


class BYDCarId extends CarId with CarGreeting {
  override var id: Int = 10000

  override def currentId(): Int = {
    id += 1
    id
  };
}

class BMWCarId extends CarId {
  override var id: Int = 20000

  override def currentId(): Int = {
    id += 1
    id
  }
}

