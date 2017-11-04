package com.github.sguzman.hackerrank.corecs.algorithms.warmup._2simplearraysum

import org.scalatest.FlatSpec

class SolutionTest extends FlatSpec {

  behavior of "Solution"

  it should "simpleArraySum sum the 6 elements [1 2 3 4 10 11] to 31" in {
    assert(Solution.simpleArraySum(6, Array(1, 2, 3, 4, 10, 11)) == 31)
  }

}
