
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    case class teacher(id:Int,name:String)
    val a =new teacher(id=1,name="das")
    println(a)
    println(a.hashCode())
    println(a.id)
    println(a.name)  

  }

}
