object TestOne {
  //1.去重List("a", "b", "c", "d", "d")
  def test1(): Unit = {
    val list = List("a", "b", "c", "d", "d")
    val l2 = list.distinct
    println(l2)
    val l3 = distinct(list)
    println(l3)

  }

  def distinct(list: List[String]): List[String] = {
    if (list.size <= 1) list else list.head :: distinct(list.filter(x => x != list.head))

  }

def test2():Unit ={

  val l1 =List("hello","world","word")
  l1.sortWith((word1,word2)=>if (word1.compareTo(word2)<0) true else false).foreach(println)

}
  def   quickSort(list:List[String]):List[String]={
    if (list.size<=1) list else  quickSort(list.filter(x=>x.compareTo(list.head)<0)):::list.filter(x=>x.equals(list.head)):::quickSort(list.filter(x=>x.compareTo(list.head)>0))
  }
  def test3(): Unit = {
    val a = List(1, 2, 3)
    val b = List(2, 3,4)
// a.union(b).distinct.foreach(println)
  //a.intersect(b).foreach(println)  //并
    //a.filter(x=>b.contains(x)).foreach(println)//bing
    b.filter(x=>a.contains(x)).foreach(println)

  }




  def main(args: Array[String]): Unit = {
    /*
      1.去重List("a", "b", "c", "d", "d")
        2.按字典序排序List("hello", "word", "world")
        3.A:List(1,2,3) B:List(2,3) 求出两个集合交集 并集 A对B的补集
       */
    test3()
  }
}
