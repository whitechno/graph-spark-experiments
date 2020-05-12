ThisBuild / version      := "0.1.0"
ThisBuild / organization := "whitechno.subutai"
ThisBuild / scalaVersion := "2.12.11"

lazy val `graphx-zzz` = project
  .settings(
    commonSettings
  )


lazy val commonSettings = List(
  scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked",
    "-feature" // [warn] there were 21 feature warnings; re-run with -feature for details
  )
)
