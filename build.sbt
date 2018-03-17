lazy val `s-99` = (project in file("."))
  .settings(
    name := "s-99-kelebra",
    version := "0.1.0",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % "test",
      "org.scalacheck" %% "scalacheck" % "1.13.5" % "test"
    )
  )
