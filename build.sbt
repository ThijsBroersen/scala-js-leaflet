enablePlugins(ScalaJSPlugin)

name := "Scala.js Leaflet"

normalizedName := "scalajs-leaflet"

organization := "nl.thijsbroersen"

scalaVersion := "2.12.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.7")

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"
