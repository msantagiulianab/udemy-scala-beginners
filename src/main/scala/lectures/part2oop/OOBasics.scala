package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Michele", 39)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

class Person(name: String, val age: Int = 0) {
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = {
    println(s"${this.name} says: Hi, $name")
  }

  def greet(): Unit = println(s"Hi, I am $name")

  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}