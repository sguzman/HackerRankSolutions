package com.github.sguzman.hackerrank.corecs.algorithms.warmup._1solvemefirst

object Solution {
  def main(args: Array[String]) {
    println(this.summation(io.Source.stdin.getLines))
  }

  def summation(varArgs: Iterator[String]): Int = {
    varArgs.map(_.toInt).sum
  }
}