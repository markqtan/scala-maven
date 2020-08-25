package scala.main

object XMLHelloWorld {
  def main(args: Array[String]): Unit = {
    val xml = <hello>world</hello>
    println(xml)
  }
}