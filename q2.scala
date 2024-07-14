import scala.collection.mutable.HashSet
import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object LibraryApp {
  
  val library: HashSet[Book] = HashSet(
    Book("Amba Yaluwo", "T B Ilangarathne", "1234567890"),
    Book("Gamperaliya", "Martin Wickramasinghe", "2345678901"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "3456789012")
  )

  // Add a new book to the library
  def addBook(book: Book): Unit = library += book

  // Remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = library.retain(_.isbn != isbn)

  // Check if a book is already in the library by its ISBN
  def isBookInLibrary(isbn: String): Boolean = library.exists(_.isbn == isbn)

  // Display the current library collection
  def displayLibrary(): Unit = {
    if (library.isEmpty) {
      println("The library is empty.")
    } else {
      println("Current library collection:")
      library.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  // Search for a book by its title
  def searchBookByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) => println(s"Found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None => println(s"No book found with title: $title")
    }
  }

  // Display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.isEmpty) {
      println(s"No books found by author: $author")
    } else {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    var continue = true
    while (continue) {
      println(
        """
          |Library Management System
          |1. Add a new book
          |2. Remove a book
          |3. Check if a book is in the library
          |4. Display the current library collection
          |5. Search for a book by title
          |6. Display all books by a specific author
          |7. Exit
          |Choose an option:
          |""".stripMargin)
      readLine().toInt match {
        case 1 =>
          println("Enter title:")
          val title = readLine()
          println("Enter author:")
          val author = readLine()
          println("Enter ISBN:")
          val isbn = readLine()
          addBook(Book(title, author, isbn))
          println("Book added.")
        case 2 =>
          println("Enter ISBN of the book to remove:")
          val isbn = readLine()
          removeBook(isbn)
          println("Book removed.")
        case 3 =>
          println("Enter ISBN to check:")
          val isbn = readLine()
          println(s"Book exists: ${isBookInLibrary(isbn)}")
        case 4 =>
          displayLibrary()
        case 5 =>
          println("Enter title to search:")
          val title = readLine()
          searchBookByTitle(title)
        case 6 =>
          println("Enter author to search:")
          val author = readLine()
          displayBooksByAuthor(author)
        case 7 =>
          continue = false
          println("Exiting the Library Management System.")
        case _ =>
          println("Invalid choice. Please choose a valid option.")
      }
    }
  }
}
