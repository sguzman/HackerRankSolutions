package com.github.sguzman.hackerrank.corecs.algorithms.warmup._2simplearraysum

object Solution {

  def simpleArraySum(n: Int, ar: Array[Int]): Int =  {
    ar.sum
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var ar = new Array[Int](n)
    for(ar_i <- 0 until n) {
      ar(ar_i) = sc.nextInt()
    }
    val result = simpleArraySum(n, ar)
    println(result)
  }
}


