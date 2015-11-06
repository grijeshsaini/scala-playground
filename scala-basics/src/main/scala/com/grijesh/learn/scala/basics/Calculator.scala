package com.grijesh.learn.scala.basics

/**
 * Created by grijesh
 * Below example shows how scala is expression oriented language
 */
class Calculator(brand:String) {

  val color:String = brand match {
    case "A" => "black"
    case "B" => "blue"
    case  _  => "NA"
  }

}

//Companion Object
object Calculator extends App{

  val calculator = new Calculator("A")
  println(calculator.color)

}