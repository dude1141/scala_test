// Define a trait



trait Animal {
  def speak(): String
}

// Define case classes that extend the Animal trait
case class Dogs(name: String, breed: String) extends Animal {
  def speak(): String = "Woof!"
}


// Define a class that uses the case classes and pattern matching
class AnimalShelter {

  def animalShelterDemos(animal:Animal):String = animal match {
  case Dogs(name,breed)=> s"this is $name and its breed $breed and will speak ${animal.speak()}"
  case _ => "unknown"
  }




}



// Main object to run the program
object AnimalShelterDemo {
  def main(args: Array[String]): Unit = {

    val shelter = new AnimalShelter()

    val animals=List(Dogs("buddy","lab"),Dogs("tomy","German"))

//    animals.foreach { animal =>
      println(shelter.animalShelterDemos(animals(1)))

//    }
  }
}







