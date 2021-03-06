name := "ScalaTest"

organization := "fokot"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "com.google.inject" % "guice" % "3.0",
  "net.codingwell" %% "scala-guice" % "3.0.2"
)
