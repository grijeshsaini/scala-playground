package com.grijesh.learn.scala.basics

/**
 * Created by grijesh on 18/11/15.
 */
object PlayWithSliding extends App{

  val testString:String = "123456789"

  val num = testString.sliding(2).map(sum)

  println(num.max)

  def sum(nums: String) = {
    nums.map(_.asDigit).sum
  }
}
