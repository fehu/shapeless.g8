
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    name := "empty shapeless template",
    description := "",
    libraryDependencies += "com.chuusai" %% "shapeless" % shapelessVersion
  )


lazy val shapelessVersion = "2.3.3"
