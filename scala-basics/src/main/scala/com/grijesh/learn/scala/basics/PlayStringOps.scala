package com.grijesh.learn.scala.basics

/**
 * Created by grijesh on 18/11/15.
 *
 */
object PlayStringOps extends App{

  val testString:String = "123456789"
  val update:String = testString.filter(_.isDigit)

  println(update.map(_.asDigit).sum)

  println(update.map(_.asDigit).product)

}
