package com.xyzcorp

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers

class BoxSpec extends AnyFunSpec with Matchers {
  describe("Create a box") {
    it("should create a box from java") {
      val box = new Box(30)
      box.value must be (30)
    }
  }
}
