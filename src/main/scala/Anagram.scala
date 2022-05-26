// https://www.codeproject.com/Articles/498404/TDD-the-Anagrams-Kata

object Anagram {
  def of(str: String): Set[String] = str match
    case "" => Set("")
    case _ => for {
      o <- Anagram.of(str.tail)
      i <- 0 to o.length
      l = o.substring(0, i)
      r = o.substring(i)
    } yield (l :+ str.head) ++ r
}
