error id: file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala:[87..90) in Input.VirtualFile("file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala", "object InventoryManagementSystem {
    import scala.io.StdIn.readLine

    def
    def getProductList(): List[String] = {
        var products = List[String]()
        var input = ""

        println("Enter product names (type 'done' to finish): ")

        while(input != "done"){
            input = readLine()
            if(input != "done"){
                products = products :+ input
            }
        }
        products
    }
    def printProductList(products: List[String]): Unit ={
        products.zipWithIndex.foreach{ case (product,index) =>
                println(s"${index + 1}.$product")
            }
    }
    def getTotalProduct(products: List[String]): Int = {
        products.length
    }

}

")
file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala
file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala:5: error: expected identifier; obtained def
    def getProductList(): List[String] = {
    ^
#### Short summary: 

expected identifier; obtained def