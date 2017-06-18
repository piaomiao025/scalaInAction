package com.dt.scala.hello

/**
  * Created by Administrator on 2017/6/18.
  */
object ScalaCollection {
  def main(args: Array[String]): Unit ={
    val pairs = (100, "Scala", "Spark");
    println(pairs._1);
    println(pairs._2);

//    for(i <- 1.to(pairs.)){
//      println("Tuple的集合：" + pair);
//    }

    val maps = Map("Rocky" -> 27, "Spark" -> 5);
    for((k, v) <- maps){
      println("Key is " + k + ", value is " + v);
    }

    for((_, v) <- maps){
      println("value is " + v);
    }

    val array = Array(1, 2, 3, 4, 5, 6);
    for(i <- 0 until array.length){
      println(array(i));
    }

    for(elem <- array){
      println(elem);
    }
  }

}
