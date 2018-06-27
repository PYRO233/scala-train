package com.imooc.pattern_match

object ExceptionApp extends App {
  try{
    val i = 10/0
    println(i)
  } catch {
    case e:ArithmeticException => println("请检查算术表达式")
    case e:Exception => println(e.getMessage)
  }
}
