/**
  * Created by Aman on 9/11/2016.
  */
object HigherOrder extends App{

  def sum(f:Int=>Int, a:Int, b:Int):Int = {

    if(a>b) 0
    else
      f(a) + sum(f, a+1 , b)
  }

  println(sum(x=>x*x, 1, 3))
}
