import scala.collection.parallel.mutable

object ReverseIndex {
 def test1():Unit = {
   val docs = Map("doc1" -> List("hello", "hehe"), "doc2" -> List("hello", "hi"))
 val tmp= docs.map(kv=>kv._2.map(word=>(word,kv._1))).flatten
   // .groupBy(kv=>kv._1).//平坦化去掉嵌套
// val tmp = docs.map(kv=>kv._2.map(x=>(x,kv._1))).reduce((x,y)=>x:::y)
   val t=docs.map(s=>s._2.map(woed=>(woed,s._1))).flatten
    .groupBy(s=>s._1).map(kv=>(kv._1,kv._2.map(xy=>xy._2)))
   println(t)
   //println(tmp)
    // .foreach(println)
   //然后去重，然后转变成（word，fileName）
//docs.foreach().
  // val wordAndFileName = docs.flatMap(a=>a._2.distinct.map(word=>(word,a._1)) ).foreach(println)
   //合并相同的word
   //val result = wordAndFileName.reduceByKey(_+"" +_)

 }

  def main(args: Array[String]): Unit = {
    test1()

  }
}
