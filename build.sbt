name := "database"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalikejdbc"  %% "scalikejdbc"  % "2.2.+",
  "org.slf4j"        %  "slf4j-simple" % "1.7.+",
  "com.h2database"   %  "h2"           % "1.4.+",
  "org.specs2"       %% "specs2-core"  % "2.4.9" % "test"
)


