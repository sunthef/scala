object MatchCaseDemo {
  case class Student(id:Int,name:String)
  def myPrint(any:Any)={
    any match {
      //匹配值
      case 1 =>println("this is a num")
        //匹配类型
      case s:String => println("this is a String :"+s)
    //匹配模式类
      case Student(id,name)=>println("this is a stu"+id+"name is "+ name)
      case Student(1,"123")=> println("this is 123")
        //默认
      case  _=> println("default")
    }
  }

  def main(args: Array[String]): Unit = {
    myPrint(1)
    myPrint("hehe")
    myPrint(new Student(1,"123"))
    myPrint(new Student(1,"23"))
    myPrint(2L)
  }
}
