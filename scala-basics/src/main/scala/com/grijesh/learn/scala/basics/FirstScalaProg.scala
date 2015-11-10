package com.grijesh.learn.scala.basics

/**
 * Created by grijesh on 7/11/15.
 */
object FirstScalaProg extends App{

  def add(x:Int,y:Int,z:Int) = x + y + z


  println("Hello World")

  println(add(1,2,3))

  val add1 = add(1,_:Int,_:Int)
  println(add1)
  println(add1(3,4))

}
