package com.training.library;

public class Application {

	public static void main(String[] args) {
	
		  Book javaBook = new Book("Head First Java","Kathy Sieera",340.00,400);
		  Book seliniumBook = new Book("Selinium Testing","Tom",440.00,460);
		  Book mocking = new Book("Junit Testing","Dick",1340.00,5400);
		  
		//  BookManager.printBook(javaBook);
		  
		  BookManager mgr = new BookManager();
		  
         mgr.printBill(javaBook, 3);
         
         System.out.println(javaBook);
        
        Book[] bkList = {javaBook,seliniumBook,mocking};
         BookManager.printBook(bkList);
        
         
         Librarian chiefLibrarian= new Librarian(101,"Ganesh","Vizag");
         
         System.out.println(chiefLibrarian);
         
	}

}
//http://bit.ly/java_01_vatsan


