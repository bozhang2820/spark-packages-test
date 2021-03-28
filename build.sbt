// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.10.4"

sparkVersion := "1.3.0"

version := "0.0.2"

// spAppendScalaVersion := true

// change the value below to change the directory where your zip artifact will be created
spDistDirectory := target.value

licenses := Seq("Apache-2.0" -> url("https://github.com/bozhang2820/spark-packages-test/blob/master/LICENSE"))

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials4")

sparkComponents += "core"

// add any sparkPackageDependencies using sparkPackageDependencies.
// e.g. sparkPackageDependencies += "databricks/spark-avro:0.1"
sparkPackageName := "bozhang2820/spark-packages-test"
