import org.scalatest.funsuite.AnyFunSuite

class FibonacciTests extends AnyFunSuite {

  test("0 yields 0") {
    assert(Fibonacci(0) === Some(Seq(0)))
  }

  test("negative yields none") {
    assert(Fibonacci(-1) === None)
  }

  test("1 yields Some(0, 1)") {
    assert(Fibonacci(1) === Some(Seq(0, 1)))
  }

  test("2 yields {0, 1, 1}") {
    assert(Fibonacci(2) === Some(Seq(0, 1, 1)))
  }

  test("3 yields {0, 1, 1, 2}") {
    assert(Fibonacci(3) === Some(Seq(0, 1, 1, 2)))
  }

  test("4 yields {0, 1, 1, 2, 3}") {
    assert(Fibonacci(4) === Some(Seq(0, 1, 1, 2, 3)))
  }

  test("last value of 8 is 21") {
    assert(Fibonacci(8).map(_.last) === Some(21))
  }

}
