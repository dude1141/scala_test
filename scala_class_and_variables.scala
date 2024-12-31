
 class test2(private var x:Int,private var y:Int) {
 // In this example, (var firstName: String, var lastName: String) is the parameter list of the primary constructor
  import test2._
  def method1(p: Int, q: Int) = {
    val r = p + q
    println("r...>>>>", r)
  }

}

object test2 {   //test2 is companion object in scala
  val x1: Int = 100 // static variable
}
object Main extends  App {  // to run we must define main or extends App

  val n1=new test2(10,20)

  n1.method1(15,25)
  println(s"test2 ${test2.x1}")  //$ is string interpolation
}

