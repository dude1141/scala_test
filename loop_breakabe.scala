 object Main {
    def main(args: Array[String]): Unit = {
      // create a Breaks object as follows
      val loop = new Breaks;

      val i=0
      val ilist=List("a","b","c","4")

      // Keep the loop inside breakable as follows
      loop.breakable {
        // Loop will go here
        for (i <-  (0 to 4)) {
          println("iist",ilist(i))
          if (i==2)
            loop.break;
        }
      }
    }
  }
