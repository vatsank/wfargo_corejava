package com.training.library;
/**
 * 
 * @author Srivatsan
 *
 */
public class BookManager {
	
	/**
	 * 
	 * @param book Represent the com.training.Book class
	 *  Used to Print the details one Book.
	 *  @return
	 */
	public static void printBook(Book book)
	{
		System.out.println("Book Name :="+book.getBookName());
		System.out.println("Page Count :="+book.getPageCount());
		System.out.println("Price :="+book.getPrice());
		System.out.println("Author :="+book.getAuthor());
	}

	// overloaded Print Book Method - Argument only Changed Name remains  same
	public static void printBook(Book[] books)
	{
		
		for(Book book :books)
		{
	       printBook(book);                 // reuse - Code redundancy is minimized;
	    }
		
	}	
	public void printBill(Book book, int itemCount)
	{
		double amount = book.getPrice() * itemCount;
		
		//System.out.println(book);
		printBook(book);
		System.out.println("Quantity :="+ itemCount);
		System.out.println("Price :="+ amount);
		
		book.setPrice(book.getPrice()+100);
	}
	
}







