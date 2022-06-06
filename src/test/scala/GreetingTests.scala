import org.scalatest.funsuite.AnyFunSuite

// https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata
class GreetingTests extends AnyFunSuite {

  import Greeting.greet

  test("Hello Bob") {
    assert(greet("Bob") === "Hello, Bob.")
  }

  test("Hello David") {
    assert(greet("David") === "Hello, David.")
  }

  test("Hello anonymous") {
    assert(greet() === "Hello, my friend.")
  }

  test("I'm being rude to Jerry, I guess") {
    assert(greet("JERRY") === "HELLO JERRY!")
  }

  test("I'm being rude to myself, I guess") {
    assert(greet("DAVID") === "HELLO DAVID!")
  }

  test("Help, I am an introvert. One person is enough") {
    assert(greet("Jill", "Jane") === "Hello, Jill and Jane.")
  }

  test("Aaaaaah") {
    assert(greet("Amy", "Brian", "Charlotte") === "Hello, Amy, Brian and Charlotte.")
  }

  test("I am kalm. But Brian irritates me.") {
    assert(greet("Amy", "BRIAN", "Charlotte") === "Hello, Amy and Charlotte. AND HELLO BRIAN!")
  }

  test("Wierd.") {
    assert(greet("Bob", "Charlie, Dianne") === "Hello, Bob, Charlie and Dianne.")
  }

  test("Wierder.") {
    assert(greet("Bob", "\"Charlie, Dianne\"") === "Hello, Bob and Charlie, Dianne.")
  }

}
