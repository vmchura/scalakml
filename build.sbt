
name := "scalakml"

organization := "com.github.workingDog"

version := (ThisBuild/version).value

scalaVersion := "3.3.3"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "2.3.0"
)

homepage := Some(url("https://github.com/workingDog/scalakml"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
  "-Xlint" // Enable recommended additional warnings.
)
