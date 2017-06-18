package com.dt.scala.hello

/**
  * Created by Administrator on 2017/6/18.
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    for(arg <- args) println(arg);
    println("Hello Scala!");

//    doWhile();
    println(looper(100, 298));

//    var file = "scala.txt";
//    if(!args.isEmpty){
//      file = args(0);
//    }
//    println(file);
//    var file = if(!args.isEmpty) args(0) else "spark.xml";
//    println(file);

    for ( i <- 1 to 10){
      println("Number is " + i);
    }

    var files = (new java.io.File(".")).listFiles();
    for(file <- files){
      println(file);
    }
  }

//  def doWhile(): Unit ={
    var line = "";
    do{
      line = readLine();
      print("Read:" + line);
    }while(line != "")
//  }

  def looper(x: Long, y: Long) : Long = {
    var a = x;
    var b = y;

    while(a != 0){
      val temp = a;
      a = b % a;
      b = temp;
    }
    b
  }
}