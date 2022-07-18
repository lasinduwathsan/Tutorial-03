object Q5 {
  def main(args: Array[String]): Unit = {
    println("total running time is:"+total(2,3))
  }
  def easypace(x:Int):Int={
    return x*8
  }
  def tempo(y:Int):Int={
    return y*7
  }
  def total(x:Int,y:Int):Int={
    return easypace(x)+tempo(y)+easypace(x)
  }










}
