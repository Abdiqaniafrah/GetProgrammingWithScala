object myClass extends App {

  class MyClass(name: String) {
    // This is a Class with a parameter 'name' and a method 'sayHello'
    def sayHello(otherName: String) = {
      s"Hi $otherName, my name is $name!"
      // 's'  is the operator for string interpolation; it replaces $otherName and $name with their value.
    }
  }
object MyObject {
  val a = new MyClass("Scala")
  // This is an instance of the class MyClass
  println(a.sayHello("Abdi"))
}

}
