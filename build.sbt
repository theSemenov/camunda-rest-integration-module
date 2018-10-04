name := "camunda-rest-integration-module"

version := "0.1"

scalaVersion := "2.12.7"

val workaround = {
  sys.props += "packaging.type" -> "jar"
  ()
}

libraryDependencies += "org.glassfish.jersey.core" % "jersey-client" % "2.27"
libraryDependencies += "org.glassfish.jersey.ext" % "jersey-proxy-client" % "2.27"
libraryDependencies += "org.glassfish.jersey.inject" % "jersey-hk2" % "2.27"
libraryDependencies += "org.glassfish.jersey.media" % "jersey-media-json-jackson" % "2.27"
