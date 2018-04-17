import org.scalatest.{MustMatchers, WordSpec}

class CountOddsSpec extends WordSpec with MustMatchers{

  "CountOdds"must {

    "countOdds must return 1 when 2 is input" in {
      CountOdds.countOdds(2) mustEqual 1
    }
    "countOdds must return 1 when 3 is input" in {
      CountOdds.countOdds(3) mustEqual 1
    }
    "countOdds must return 4 when 8 is input" in {
      CountOdds.countOdds(8) mustEqual 4
    }
    "countOdds must return 3 when 7 is input" in {
      CountOdds.countOdds(7) mustEqual 3
    }
  }

}
