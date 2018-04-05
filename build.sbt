import scala.collection.JavaConverters._

lazy val `s-99` = (project in file("."))
  .enablePlugins(TutPlugin)
  .settings(
    name := "s-99-kelebra",
    version := "0.1.0",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
      "org.scalacheck" %% "scalacheck" % "1.13.5" % Test
    ),
    tutTargetDirectory := file("."),
    tut := {
      (compile in Compile)
        .map(_.readSourceInfos().getAllSourceInfos.keySet())
        .map(_.asScala.toSet)
        .map(AnnotationProcessor.apply)
        .value
      tut.value
    }
  )
