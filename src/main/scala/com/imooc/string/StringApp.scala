package com.imooc.string

object StringApp extends App {

  // 插值
  val s = "Hello"
  println(s"$s World")

  val l =
    """
      |多行字符串
      |Hello
      |World
    """.stripMargin
  println(l)
}
