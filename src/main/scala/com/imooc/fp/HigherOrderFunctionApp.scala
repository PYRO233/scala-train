package com.imooc.fp

object HigherOrderFunctionApp extends App {

  // 对给定两个数区间中的所有整数求和，递归
  def sumInts(a: Int, b: Int): Int = {
    if(a > b) 0 else a + sumInts(a + 1, b)
  }
  println(sumInts(1,10))

  // ======================= 高阶函数 整数和 =======================
  // 以函数f为参数
  def sum(f: Int => Int, a: Int, b: Int): Int ={
    if(a > b) 0 else f(a) + sum(f, a+1, b)
  }
  // 定义了一个新的函数self，输入一个整数x，输出x自身
  def self(x: Int): Int = x
  // 重新定义sumInts函数
  def sumInt(a: Int, b: Int): Int = sum(self, a, b)

  // ======================= 和sum逻辑类似，从a到b的f(n)的累加形式 =======================
  // 连续整数的平方和
  def square(x: Int): Int = x * x
  def sumSquares(a: Int, b: Int): Int = {
    if(a > b) 0 else square(a) + sumSquares(a + 1, b)
  }

  // 连续整数的关于2的幂次和
  def powerOfTwo(x: Int): Int = {
    if(x == 0) 1 else 2 * powerOfTwo(x-1)
  }
  def sumPowersOfTwo(a: Int, b: Int): Int = {
    if(a > b) 0 else powerOfTwo(a) + sumPowersOfTwo(a+1, b)
  }

  // ======================= 用sum改写上面两个函数 =======================
  // 针对不同应用场景，每个sum函数中调用的函数f，都具备了不同的处理逻辑
  def sumSquares2(a: Int, b: Int): Int = sum(square, a, b)
  def sumPowersOfTwo2(a: Int, b: Int): Int = sum(powerOfTwo, a, b)


  // ======================= foreach、map、flatMap、reduce =======================
  val list = List(1,2,3,4,5)
  val list2 = list.map((x:Int) => x+1)
  val list3 = list.map(x => x+1)
  val list4 = list.map(_ + 1).foreach(print)
  list.foreach(println)
  list2.foreach(print)
  list3.foreach(print)
  list.reduce(_+_)
  println()
  print(list.reduce(_ + _))
  list.flatMap(_.toString)

}
