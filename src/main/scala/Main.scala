import scala.util.Try
import scala.io.Source

object AOCUtil 
  def inputToStrings(name: String): List[String] =
    Source.fromResource(name).getLines().toList

@main def hello: Unit = 

  def parse(input: List[String]): List[(Char,Char)] = 
    input.map((s: String) => (s(0), s(2)))

  val exampleInputLines = inputToStrings("example.txt")
  val exampleInput = parse(exampleInputLines)

  exampleInput.foreach {
    s => println(s"${s._1}, ${s._2}")
  }