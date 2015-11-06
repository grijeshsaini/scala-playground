package com.grijesh.learn.scala.basics

/**
 * Created by grijesh on 6/11/15.
 */
object CurriedFunction extends App{

  //Curried Function
  def mutiply(m:Int)(n:Int) = m*n

  //def mutiply(m:Int)= (n:Int) => m*n

  //partial application
  val mul2 = mutiply(2)_
  println(mul2(3))

  // Below we are converting normal function to curried by using .curried
  def add(x:Int,y:Int) = x+y

  val addCurried = (add _).curried
  val add1 = addCurried(1)
  println(add1(5))

  //http://www.vasinov.com/blog/on-currying-and-partial-function-application/
}
