name := "ant-salesforce-ci"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "1.0.4",
  "org.specs2" %% "specs2-core" % "3.6.1" % "test",
  "junit" % "junit" % "4.9" % "test",
  "org.apache.ant" % "ant" % "1.8.3" % "compile"
)

// Read here for optional dependencies: 
// http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html#Dependencies

resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"  
)
