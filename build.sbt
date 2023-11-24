name := """learnplay29"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies += evolutions


