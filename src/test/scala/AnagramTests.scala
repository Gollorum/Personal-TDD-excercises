import org.scalatest.funsuite.AnyFunSuite

class AnagramTests extends AnyFunSuite {

  test("empty string has the empty anagram") {
    assert(Anagram.of("") === Set(""))
  }

  test("single char is itself") {
    assert(Anagram.of("A") === Set("A"))
  }

  test("single other char is itself") {
    assert(Anagram.of("B") === Set("B"))
  }

  test("two chars are flipped too") {
    assert(Anagram.of("AB") === Set("AB", "BA"))
  }

  test("two other chars are flipped too") {
    assert(Anagram.of("12") === Set("12", "21"))
  }

  test("three chars have 6 options") {
    assert(Anagram.of("ABC") === Set("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"))
  }

  test("three other chars have 6 options") {
    assert(Anagram.of("123") === Set("123", "132", "213", "231", "312", "321"))
  }

  test("four chars have 24 options") {
    assert(Anagram.of("ABCD") === Set(
      "DABC", "DACB", "DBAC", "DBCA", "DCAB", "DCBA",
      "ADBC", "ADCB", "BDAC", "BDCA", "CDAB", "CDBA",
      "ABDC", "ACDB", "BADC", "BCDA", "CADB", "CBDA",
      "ABCD", "ACBD", "BACD", "BCAD", "CABD", "CBAD"
    ))
  }

  test("four other chars have 24 options") {
    assert(Anagram.of("1234") === Set(
      "4123", "4132", "4213", "4231", "4312", "4321",
      "1423", "1432", "2413", "2431", "3412", "3421",
      "1243", "1342", "2143", "2341", "3142", "3241",
      "1234", "1324", "2134", "2314", "3124", "3214"
    ))
  }

  test("five chars have 120 options") {
    assert(Anagram.of("ABCDE").size == 120)
  }

}
