import sbt._
import sbt.Keys._

object TestProject extends Build {
  lazy val project = Project("Test", file("."))
    .settings(libraryDependencies ++= Seq(
      "com.google.guava"    %   "guava"         % "17.0"))
}
