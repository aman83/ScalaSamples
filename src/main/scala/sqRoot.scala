/**
  * Created by Aman Sardana on 9/4/2016.
  */
object sqRoot extends App{

  def sqrt(x: Double) = {

    def sqrtIteration(guess: Double): Double =
      if (isResultAcceptable(guess)) guess
      else sqrtIteration(improveGuess(guess))

    def isResultAcceptable(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def abs(x: Double) = if (x < 0) -x else x

    def improveGuess(guess: Double) =
      (guess + x / guess) / 2

    sqrtIteration(1.0)

  }
  println(sqrt(2))

}


