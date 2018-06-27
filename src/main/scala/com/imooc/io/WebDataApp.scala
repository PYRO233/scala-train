package com.imooc.io

import scala.io.Source

object WebDataApp extends App {
  print(Source.fromFile("/Users/td/IdeaProjects/scala-train/src/main/scala/com/imooc/io/test.txt").mkString)
  print(Source.fromURL("https://coding.imooc.com/class/chapter/215.html#Anchor", "utf-8").mkString)
}
