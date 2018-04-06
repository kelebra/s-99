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
      (readme + gatherProblemStatementsAndSamples(sources)).split("\n").toList.asJava
    )
  }

  private def gatherProblemStatementsAndSamples(sources: Set[File]): String = {
    sources
      .map(f ⇒ Files.readAllLines(f.toPath).asScala.mkString("\n"))
      .flatMap(content ⇒ solutionPattern.findAllIn(content).matchData.toList.headOption)
      .flatMap { `match` ⇒
        val application = s"""${`match`.group(3)}(${`match`.group(2)})"""
        Option((`match`.group(1).toInt, application))
      }
      .toList
      .sortBy(_._1)
      .map {
        case (number, application) ⇒
          s"""
             |## Problem #$number:
             |```tut
             |import com.github.kelebra.s99.solutions._
             |$application
             |```
           """.stripMargin
      }
      .mkString
  }

  private val solutionPattern = """@Solution\(number = ([0-9]+), input = \"(.*)\"\)\nobject ([a-zA-Z]+)""".r

  private val readme =
    """
      |## Project status:
      |[![Build Status](https://travis-ci.org/kelebra/s-99.svg?branch=master)](https://travis-ci.org/kelebra/s-99)
      |[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kelebra/s-99&amp;utm_campaign=Badge_Grade)
      |[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&utm_medium=referral&utm_content=kelebra/s-99&utm_campaign=Badge_Coverage)
      |
      |# Solutions to [Scala 99](http://aperiodic.net/phil/scala/s-99/) Problems:
      |
    """.stripMargin
}
