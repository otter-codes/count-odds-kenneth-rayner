object CountOdds {

  def countOdds(input:Int):Int = input match {

      case x if x%2 ==0 => x/2
      case _ => (input -1) /2

    }

}
