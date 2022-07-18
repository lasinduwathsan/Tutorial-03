object Q4 {
  def main(args: Array[String]): Unit = {
    println("the Total Cost is :"+totalcost(60))

  }
    def bookprice(x:Int):Double={
      return 24.95*x
    }
    def bookcost(y:Double):Double={
      return y*0.6

    }
    def cost(x:Int):Double={
      return 3*x+(x-50)*0.75

    }
    def totalcost(x:Int):Double={
      return bookcost(bookprice(x))+cost(x)
    }









}
