import java.io.File
import java.nio.file.Files

import sbt.file

import scala.collection.JavaConverters._

object AnnotationProcessor {

  def apply(sources: Set[File]): Unit = {
    val target = file("src/main/tut/README.md")
    target.getParentFile.mkdirs()

    Files.write(
      target.toPath,
      createReadMe(sources).getBytes()
    )
  }

  private def createReadMe(sources: Set[File]): String = {
    val solutions = sources
      .map(f ⇒ Files.readAllLines(f.toPath).asScala.mkString("\n"))
      .flatMap(content ⇒ solutionPattern.findAllIn(content).matchData.toList.headOption)
      .flatMap { `match` ⇒
        val caller = `match`.group(3)
        val application = s"""$caller(${`match`.group(2)})"""
        Option((`match`.group(1).toInt, unCamel(caller), application))
      }
    readme(solutions.size * 100 / 99) +
      "\n" +
      solutions
        .toList
        .sortBy(_._1)
        .map {
          case (number, problem, application) ⇒
            s"""
               |## #$number: $problem
               |```tut
               |$application
               |```
           """.stripMargin
        }
        .mkString
  }

  private def unCamel(input: Seq[Char]): String =
    input.map {
      case upper if upper.isUpper ⇒ s" ${upper.toLower}"
      case lower                  ⇒ lower
    }.mkString.trim

  private val solutionPattern = """@Solution\(number = ([0-9]+), input = \"(.*)\"\)\nobject ([a-zA-Z]+)""".r

  private def readme(percent: Int) =
    "## Project status:\n" +
      s"""![Progress](http://progressed.io/bar/$percent?title=done) """ +
      """[![Build Status](https://travis-ci.org/kelebra/s-99.svg?branch=master)](https://travis-ci.org/kelebra/s-99) """ +
      """[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kelebra/s-99&amp;utm_campaign=Badge_Grade) """ +
      """[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&utm_medium=referral&utm_content=kelebra/s-99&utm_campaign=Badge_Coverage)""" +
      """
        |# Solutions to [Scala 99](http://aperiodic.net/phil/scala/s-99/) Problems:
        |
        |```tut
        |import com.github.kelebra.s99.solutions._
        |```
      """.stripMargin
}
