import org.scalatest.funsuite.AnyFunSuite

class IntToRomanTests extends AnyFunSuite:

  import IntToRoman.toRoman

  test("0 is empty") {
    assert(0.toRoman === Some(""))
  }

  test("if int negative then no result") {
    assert(-1.toRoman === None)
  }

  test("1 === I") {
    assert(1.toRoman === Some("I"))
  }

  test("2 === II") {
    assert(2.toRoman === Some("II"))
  }

  test("3 === III") {
    assert(3.toRoman === Some("III"))
  }

  test("4 === IV") {
    assert(4.toRoman === Some("IV"))
  }

  test("5 === V") {
    assert(5.toRoman === Some("V"))
  }

  test("6 === VI") {
    assert(6.toRoman === Some("VI"))
  }

  test("7 === VII") {
    assert(7.toRoman === Some("VII"))
  }

  test("8 === VIII") {
    assert(8.toRoman === Some("VIII"))
  }

  test("9 === IX") {
    assert(9.toRoman === Some("IX"))
  }

  test("10 === X") {
    assert(10.toRoman === Some("X"))
  }

  test("11 === XI") {
    assert(11.toRoman === Some("XI"))
  }

  test("12 == XII") {
    assert(12.toRoman === Some("XII"))
  }

  test("14 == XIV") {
    assert(14.toRoman === Some("XIV"))
  }

  test("17 == XVII") {
    assert(17.toRoman === Some("XVII"))
  }

  test("19 == XIX") {
    assert(19.toRoman === Some("XIX"))
  }

  test("20 == XX") {
    assert(20.toRoman === Some("XX"))
  }

  test("29 == XXIX") {
    assert(29.toRoman === Some("XXIX"))
  }

  test("30 == XXX") {
    assert(30.toRoman === Some("XXX"))
  }

  test("50 == L") {
    assert(50.toRoman === Some("L"))
  }

  test("51 == LI") {
    assert(51.toRoman === Some("LI"))
  }

  test("40 == XL") {
    assert(40.toRoman === Some("XL"))
  }

  test("41 == XLI") {
    assert(41.toRoman === Some("XLI"))
  }

  test("49 == XLIX") {
    assert(49.toRoman === Some("XLIX"))
  }

  test("77 == LXXVII") {
    assert(77.toRoman === Some("LXXVII"))
  }

  test("89 == LXXXIX") {
    assert(89.toRoman === Some("LXXXIX"))
  }

  test("90 == XC") {
    assert(90.toRoman === Some("XC"))
  }

  test("99 == XCIX") {
    assert(99.toRoman === Some("XCIX"))
  }

  test("100 == C") {
    assert(100.toRoman === Some("C"))
  }

  test("111 == CXI") {
    assert(111.toRoman === Some("CXI"))
  }

  test("399 == CCCXCIX") {
    assert(399.toRoman === Some("CCCXCIX"))
  }

  test("400 == CD") {
    assert(400.toRoman === Some("CD"))
  }

  test("420 == CDXX") {
    assert(420.toRoman === Some("CDXX"))
  }

  test("499 == CDXCIX") {
    assert(499.toRoman === Some("CDXCIX"))
  }

  test("555 == DLV") {
    assert(555.toRoman === Some("DLV"))
  }

  test("1337 == MCCCXXXVII") {
    assert(1337.toRoman === Some("MCCCXXXVII"))
  }

  test("4999 == MMMMCMXCIX") {
    assert(4999.toRoman === Some("MMMMCMXCIX"))
  }

  test("5000 is empty") {
    assert(5000.toRoman === None)
  }