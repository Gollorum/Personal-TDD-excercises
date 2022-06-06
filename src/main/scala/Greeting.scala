import scala.collection.immutable.{AbstractSeq, LinearSeq}

object Greeting:

  def greet(names: String*): String =
    val splitNames = for {
      raw <- names
      single <- raw match
        case s""""${x}"""" => Array(x)
        case _ => raw.split(", ")
    } yield single
    val (shout, talk) = splitNames.partition(_.forall(_.isUpper))
    greet(join(talk), join(shout))

  private def join(names: Seq[String]): Option[String] = names match
    case Nil => None
    case single +: Nil => Some(single)
    case init :+ last => Some(s"${init.mkString(", ")} and $last")

  private def greet(normal: Option[String], shout: Option[String]): String = (normal, shout) match
    case (Some(n), None) => s"Hello, $n."
    case (None, Some(s)) => s"HELLO $s!"
    case (Some(n), Some(s)) => s"${greet(Some(n), None)} AND ${greet(None, Some(s))}"
    case (None, None) => greet("my friend")