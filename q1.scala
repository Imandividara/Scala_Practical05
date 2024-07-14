object InventoryManagementSystem {
    import scala.io.StdIn.readLine

    def main(args: Array[String]): Unit = {
        val products = getProductList()
        printProductList(products)
        val totalProducts = getTotalProduct(products)
        println(s"Total number of products entered: $totalProducts")
    }

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
    def printProductList(products: List[String], index: Int = 0): Unit = {
       products match {
         case Nil => 
         case head :: tail =>
           println(s"${index + 1}. $head")
           printProductList(tail, index + 1)
  }
}

    def getTotalProduct(products: List[String]): Int = {
        products.length
    }

}

