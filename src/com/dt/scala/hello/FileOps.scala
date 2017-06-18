package com.dt.scala.hello

import scala.io.Source

/**
  * Created by Administrator on 2017/6/18.
  */
object FileOps {
  def main(args : Array[String]): Unit ={
    val file = Source.fromFile("d:\\tnsnames.ora");
    for(line <- file.getLines()){
      println(line);
    }

    val file2 = Source.fromURL("http://www.baidu.com");
    for(line2 <- file2.getLines()){
      println(line2);
    }

    println(if(!file.isEmpty) "File is not empty" else "File is Empty");
  }

}
