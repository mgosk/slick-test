import play.Project._

name := "slick-test"

version := "1.0"

libraryDependencies ++= Seq(
  "org.hsqldb" % "hsqldb" % "2.3.2" ,
  "com.typesafe.slick" %% "slick" % "2.0.1",
  "com.typesafe.play" %% "play-slick" % "0.6.0.1"
)

playScalaSettings