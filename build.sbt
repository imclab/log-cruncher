name := """log-cruncher"""

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies ++= List(
  "com.typesafe.slick"  %%      "slick"             % "1.0.1",
  "org.slf4j"           %       "slf4j-api"         % "1.6.4",
  "ch.qos.logback"      %       "logback-classic"   % "1.0.7",
  "com.h2database"      %       "h2"                % "1.3.166",
  "com.typesafe"        %       "config"            % "1.0.2"
)
