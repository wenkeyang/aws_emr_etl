
package scala.annotations.car
import scala.beans.BeanProperty
class Car {
  @BeanProperty
  var cname = "Alto"
  var cno = 67

  
}

object mytest{
  def main(args: Array[String]): Unit = {
    val k1=new Car

    println(k1.cno)
  }
}