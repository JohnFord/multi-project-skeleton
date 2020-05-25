
import sbt._

object Dependencies extends Versions {

  lazy val commonDependencies = Seq(
    "org.slf4j" % "slf4j-api" % slf4jVersion,
    "org.scalatest" %% "scalatest" % scalaTestVersion   % "test",
    "org.scalacheck" %% "scalacheck" % "1.14.2" % "test"
  )

  lazy val kafkaDependencies = Seq(
  )


  lazy val appDependencies = Seq(
    "ch.qos.logback" % "logback-classic" % "1.2.3",
  )

}

trait Versions {
  lazy val slf4jVersion = "1.7.30"
  lazy val scalaTestVersion = "3.2.0-M2"
}
