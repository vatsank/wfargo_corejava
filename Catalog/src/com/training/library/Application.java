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
         
         
         System.out.println(javaBook.equals(seliniumBook));   // checking different object
         
         
         Book bk = null;
         
         System.out.println(javaBook.equals(bk));   // checking cautious
         
         String bk2 = new String("Book");
         
         System.out.println(javaBook.equals(bk2));   // checking different classes
         
         
         System.out.println(javaBook.equals(javaBook));   // checking identity
         
         Book jb =new Book("Head First Java","Kathy Sieera",340.00,400);
         
         System.out.println("equlity"+javaBook.equals(jb));   // checking equality
         
         
	}

}
//http://bit.ly/java_01_vatsan


