resolvers += Classpaths.sbtPluginReleases

// See docs : https://github.com/sbt/sbt-native-packager
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.2")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.1")
//Documentation is not published, which can cause some issues when using Intellij's SBT Shell Library 
