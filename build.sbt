lazy val `s-99` = (project in file(".")).
  settings(
    name := "s-99-kelebra",
    version := "0.1.0",

    scalaVersion := "0.6.0",

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
