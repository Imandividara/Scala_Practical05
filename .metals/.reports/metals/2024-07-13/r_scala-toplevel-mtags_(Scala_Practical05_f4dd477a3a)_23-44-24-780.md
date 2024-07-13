error id: file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala:[457..458) in Input.VirtualFile("file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala", "object InventoryManagementSystem {
    import scala.io.StdIn.readLine

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
    def 
}

")
file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala
file:///C:/Users/HP/OneDrive/Documents/Scala_Project05/Scala_Practical05/q1.scala:19: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace