import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object scalaMutableDemo {

  def main(args: Array[String]): Unit = {

    //hashmap
    val c3=mutable.HashMap.empty[String,String]

    c3 += ("k1"->"v1")
    //添加
    c3 += ("k2"->"v3")
  println(c3)
    //更新
    c3 += ("k2"->"v4")
   println(c3)
  }
}