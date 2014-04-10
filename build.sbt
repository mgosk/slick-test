import play.Project._

name := "slick-test"

version := "1.0"

libraryDependencies ++= Seq(
  "org.hsqldb" % "hsqldb" % "2.3.2" ,
  "com.typesafe.slick" %% "slick" % "1.0.1",
  "com.typesafe.play" %% "play-slick" % "0.5.0.9"
)

playScalaSettings