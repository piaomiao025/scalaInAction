package com.dt.scala.hello

/**
  * Created by Administrator on 2017/6/18.
  */
object ScalaBasics {
  def main(args: Array[String]): Unit ={
    val n = 99;
    try{
      val half = if(n % 2 == 0) n/2 else throw new RuntimeException("N must be event");
    }catch{
      case e : RuntimeException => println("1st time, The Exception is :" + e.getMessage);
      case e : Exception => println("The Exception is :" + e.getMessage);
    }finally{

    }
  }

}
