name := "dfdl-tcpMessage"

organization := "io.github.dfdlschemas"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.18"

libraryDependencies ++= Seq(
  "com.github.sbt" % "junit-interface" % "0.13.3" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.6.0" % "test",
  "org.apache.logging.log4j" % "log4j-core" % "2.20.0" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
