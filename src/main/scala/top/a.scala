
println("Welcome to the Drawing Canvas!")




def readCommand(command: Any) = {
  case (commandType,x,y) => createCanvas(x,y)
}


def createCanvas(width:Int, height:Int) = {
  //create a 2D array here
  val x="a"
  var canvas = Array.ofDim(100, 60)

}


def createCanvas = {
  println("Create a canvas: ")
  val command = readLine()
  command match {
    case (_,x,_) => val width = x
    case (_,_,y) => val height = y
  }


}











