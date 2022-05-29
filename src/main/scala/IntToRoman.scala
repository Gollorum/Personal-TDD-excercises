import scala.math.pow

object IntToRoman:
  extension(i: Int)
    def toRoman: Option[String] = i match
      case i if i < 0 || i >= 5000 => None
      case 0 => Some("")
      case _ => for {
        (red, pref) <- reductionAndPrefixFor(i)
        postfix <- (i - red).toRoman
      } yield pref + postfix

  private val singleStepCharacters = Array("I", "X", "C", "M")
  private val halfStepCharacters = Array("V", "L", "D")

  private val reductionsAndPrefixes = (
    for {
      (((l, h), r), i) <- singleStepCharacters.zip(halfStepCharacters).zip(singleStepCharacters.tail).zipWithIndex
      mulL = pow(10, i).toInt
      mulH = 5 * mulL
      mulR = pow(10, i + 1).toInt
      e <- Array(
        (mulL, l),
        (mulH - mulL, l + h),
        (mulH, h),
        (mulR - mulL, l + r)
      )
    } yield e
  ) :+ (pow(10, singleStepCharacters.length - 1).toInt, singleStepCharacters.last)

  private def reductionAndPrefixFor(i: Int): Option[(Int, String)] =
    reductionsAndPrefixes.findLast(_._1 <= i)
