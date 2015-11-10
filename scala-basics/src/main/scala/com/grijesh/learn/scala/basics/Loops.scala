package com.grijesh.learn.scala.basics

/**
 * Created by grijesh on 11/11/15.
 */
object Loops extends App{

  val a = Array(1, 2, 3, 4, 5)

  println(for (e <- a if e > 2) yield e)


}
