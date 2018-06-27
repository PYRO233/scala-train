package com.imooc.pattern_match

import scala.util.Random

object MatchApp extends App {

  //======================简单匹配======================
  val names = Array("Akiho Yoshizawa", "Yuihatano", "Aoi Sola")

  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉老师")
    case "Yuihatano" => println("波老师")
    case _ => println("小纯洁")
  }

  //======================加条件进行匹配======================
  def judgeGrade(grade:String, name:String): Unit = {
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Not Good")
      case _ if(name == "lisi") => println(name + ",you need to work hard")
      case _ => println(",you need to work hard")
    }
  }
  judgeGrade("D", "lisi")

  //======================Array模式匹配======================
  def greeting(array: Array[String]): Unit = {
    array match {
      case Array("lisi", _*) => println("Hi,lisi and others")
      case Array("lisi") => println("Hi,lisi")
      case Array(x, y) => println("Hi," + x + " and "+ y)
      case _ => println("Hi,everybody")
    }
  }
  greeting(Array("lisi"))

  //======================List模式匹配======================
  def greet(list:List[String]): Unit = {
    list match {
      case "lisi"::Nil => println("Hi,lisi")
      case x::y::Nil => println("Hi," + x + " and "+ y)
      case "lisi"::tail => println("Hi,lisi and others")
      case _ => println("Hi,everybody")
    }
  }

  //======================类型匹配======================
  def matchType(obj:Any) {
    obj match {
      case x:Int => println("Int")
      case s:String => println("String")
      case m:Map[_,_] => m.foreach(println)
      case _ => println("other type")
    }
  }

  matchType(1)
  matchType("1")
  matchType(Map("nju" -> "nanjing university"))


  //======================case class模式匹配======================
  class Person
  case class CTO(name:String, floor:String) extends Person
  case class Employee(name:String, floor:String) extends Person
  case class Other(name:String, floor:String) extends Person

  def caseclassMatch(person: Person): Unit = {
    person match {
      case CTO(x, y) => println("CTO name is: " + x + ", floor is: " + y)
      case Employee(name, floor) => println("Employee name is : " + name + ", floor is: " + floor)
      case _ => println("other")
    }
  }

  caseclassMatch(CTO("TD", "9"))

}
