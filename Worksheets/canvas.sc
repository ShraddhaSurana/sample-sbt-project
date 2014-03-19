
println("Welcome to the Drawing Canvas!")

//first replace spaces with a comma

def readCommand(command: Any) = command match {
  case (commandType,x:Int,y:Int) => createCanvas(x,y)
}

def createCanvas(width:Int, height:Int) = {
  var canvas: Array[Array[String]]=Array.fill[String](height+2,width+2)(" ")
  var i=0
  def makeAHorizontalLine(rowNumber:Int,columnRange:Range,symbol:String) = {
    for(i<-columnRange){
      canvas(rowNumber)(i)=symbol
    }

  }
  def makeAVerticalLine(columnNumber:Int, rowRange:Range, symbol:String) = {
    for(i<-rowRange){
      canvas(i)(columnNumber)=symbol
    }
  }

//  canvas(0).transform(x => "-")
//  canvas(height+1).transform(x => "-")
  val colRange=0 until width+2
  makeAHorizontalLine(0,colRange,"-")
  makeAHorizontalLine(height+1,colRange,"-")

// column values
  val rowRange = 1 until height+1
  makeAVerticalLine(0,rowRange,"|")
  makeAVerticalLine(width+1,rowRange,"|")

  println(canvas.map(_.mkString(" ")).mkString("\n"))
}
readCommand("A",3,2);//width.height











