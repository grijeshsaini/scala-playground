package com.grijesh.learn.scala.basics

/**
  * Created by grijesh on 30/3/16.
  */
object PlayWithImplicitParameters extends App{

  implicit def doubleToInt(d: Double):Int = d.toInt

  val x:Int = 42.0 // compiler will automatically look for conversion

  println(x)

}
