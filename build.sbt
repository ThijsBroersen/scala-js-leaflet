enablePlugins(ScalaJSPlugin)

name := "Scala.js Leaflet"

normalizedName := "scalajs-leaflet"

organization := "nl.thijsbroersen"

scalaVersion := "2.13.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.8", "2.13.0")

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
