package com.grijesh.learn.scala.basics

/**
 * Created by grijesh on 6/11/15.
 */
object PartialApplication extends App{

  // Function
  def add(x:Int,y:Int) = x+y

  //Partial ( _ -> wildcard)
  val add2 = add(2,_:Int)

  println(add2(3))

}
