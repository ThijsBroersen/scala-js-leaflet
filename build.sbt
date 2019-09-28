enablePlugins(ScalaJSPlugin)

name := "Scala.js Leaflet"

normalizedName := "scala-js-leaflet"

organization := "nl.thijsbroersen"

scalaVersion := "2.13.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.10", "2.13.1")

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"

inThisBuild(List(
  homepage := Some(url("https://github.com/ThijsBroersen/scala-js-leaflet")),
  licenses := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "thijsbroersen",
      "Thijs Broersen",
      "thijsbroersen@gmail.com",
      url("https://github.com/ThijsBroersen")
    )
  )
))
