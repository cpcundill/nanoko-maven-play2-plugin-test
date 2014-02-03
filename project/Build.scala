
import play.Project._
import sbt._
import Keys._
import play.Project._
import scala.Some
import scala.Some

object ApplicationBuild extends Build {

  val appName = fromEnv("project.artifactId").getOrElse("play-maven-test")
  val appVersion = fromEnv("project.version").getOrElse("1.0-SNAPSHOT")
  val appDependencies = Seq.empty

  val main = play.Project(appName, appVersion, appDependencies).settings(defaultJavaSettings:_*).settings(
    // Source folders
//    sourceDirectory in Compile <<= baseDirectory / "src/main/java",
//    sourceDirectory in Test <<= baseDirectory / "src/test/java",
//
//    scalaSource in Compile <<= baseDirectory / "src/main/scala",
//    scalaSource in Test <<= baseDirectory / "src/test/scala",
//
//    javaSource in Compile <<= baseDirectory / "src/main/java",
//    javaSource in Test <<= baseDirectory / "src/test/java",
//
//    confDirectory <<= baseDirectory / "src/main/conf",
//    resourceDirectory in Compile <<= baseDirectory / "src/main/conf",

//    resolvers ++= Seq(
//      Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns))
)

  private def fromEnv(name: String) = System.getenv(name) match {
    case null => None
    case value => Some(value)
  }

}