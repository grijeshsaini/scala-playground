package com.grijesh.learn.scala.basics

/**
  * Created by grijesh on 15/3/16.
  */
object Sequence extends App{

  //Notice that returned a List. Seq is a trait; List is a lovely implementation of Seq.
  println(Seq(1,2,3))

  println(Seq(1,3,2).sorted)

}
