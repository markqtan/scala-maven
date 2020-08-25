https://docs.scala-lang.org/tutorials/scala-with-maven.html
https://github.com/scala/scala-module-dependency-sample

https://davidb.github.io/scala-maven-plugin/example_run.html
mvn scala:run -Dlauncher=xml

--------
mvn clean dependency:copy-dependencies install
jar -jar  scala-maven-0.0.1-SNAPSHOT.jar
