```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    Option(x).getOrElse(throw new NullPointerException("x cannot be null"))
  }
}

object Main extends App {
  val myObj = new MyClass[String]("hello")
  println(myObj.myMethod(null)) //This will now throw the exception
  println(myObj.myMethod("hello"))
}
```