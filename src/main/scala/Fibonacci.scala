object Fibonacci {

  def apply(i: Int): Option[Seq[Int]] = i match
    case x if x < 0 => None
    case 0 => Some(Seq(0))
    case 1 => Fibonacci(0).map(_ :+ 1)
    case _ => Fibonacci(i - 1).map(init => init :+ (init.last + init.init.last))

}
