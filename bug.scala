```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == null) {
      throw new NullPointerException("x cannot be null")
    } else {
      x
    }
  }
}

object Main extends App {
  val myObj = new MyClass[String]("hello")
  println(myObj.myMethod(null))
}
```