import scala.util.Try
import scala.io.Source

@main def hello: Unit = 
  def inputToStrings(name: String): List[String] =
    Source.fromResource(name).getLines().toList

  def parse(input: List[String]): List[(Char,Char)] = 
    input.map((s: String) => (s(0), s(2)))

  val exampleInputLines = inputToStrings("example.txt")
  val exampleInput = parse(exampleInputLines)

  def score(input: Tuple2[Char,Char]): Int = 
    input match 
      case ('A', 'X') => 1 + 3
      case ('A', 'Y') => 2 + 6
      case ('A', 'Z') => 3 + 0
      case ('B', 'X') => 1 + 0
      case ('B', 'Y') => 2 + 3
      case ('B', 'Z') => 3 + 6
      case ('C', 'X') => 1 + 6
      case ('C', 'Y') => 2 + 0
      case ('C', 'Z') => 3 + 3

  val exampleScore = exampleInput.map(score).sum
  println(exampleScore)

  val inputLines = inputToStrings("input.txt")
  val input = parse(inputLines)
  println(input.map(score).sum)

  def score2(input: Tuple2[Char,Char]): Int = 
    input match 
      case ('A', 'X') => 0 + 3
      case ('A', 'Y') => 3 + 1
      case ('A', 'Z') => 6 + 2
      case ('B', 'X') => 0 + 1
      case ('B', 'Y') => 3 + 2
      case ('B', 'Z') => 6 + 3
      case ('C', 'X') => 0 + 2
      case ('C', 'Y') => 3 + 3
      case ('C', 'Z') => 6 + 1

  val exampleScore2 = exampleInput.map(score2).sum
  println(exampleScore2)

  println(input.map(score2).sum)