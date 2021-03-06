/** Name of project */
name := "HackerRankSolutions"

/** Project Version */
version := "1.0"

/** Scala version */
scalaVersion := "2.12.4"

/** Scalac parameters */
scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

/** Javac parameters */
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

/** Resolver */
resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Search Maven" at "https://repo1.maven.org/maven2/"
)

/** Source Dependencies */
libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
)

/** Make sure to fork on run */
fork in run := true