package com.github.sguzman.hackerrank.corecs.algorithms.warmup._1solvemefirst

import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
  val input = Array("2", "3")
  val expected = 5
  test(s"Program should take ${input.mkString("[", ", ", "]")} and return $expected") {
    assert(Solution.summation(input.iterator) == expected)
  }

}
