name := "mogli-dev-app"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.5"

autoScalaLibrary := false

scalacOptions ++=
  Seq(
    "-Xfatal-warnings",
    "-unchecked",
    "-deprecation",
    "-feature"
  )

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value % "test",
  "org.scalatest" %% "scalatest-funspec" % "3.2.0" % "test",
  "org.scalatest" %% "scalatest" % "3.2.0" % "test"
)
