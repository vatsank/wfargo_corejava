package com.training.library;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args)  {
	
		 Book javaBook=null;
		 Book seliniumBook=null;
		 Book mocking=null;
		try {
		
			 javaBook = new Book("Head First Java","Kathy Sieera",140.00,400);
			  seliniumBook = new Book("Selinium Tessting","Tom",440.00,460);
			  mocking  = new Book("Junit Testing","Dick",13400.00,5400);
		}
		catch(RangeCheckException e)
		{
		    	e.printStackTrace();
		} finally {
			
			System.out.println("Inside Finally");
		}
		  
		//  BookManager.printBook(javaBook);
		  
		  BookManager mgr = new BookManager();
		  
         mgr.printBill(javaBook, 3);
         
         try {
		
        	 System.out.println(javaBook);
             
             Book[] bkList = {javaBook,seliniumBook,mocking};
              BookManager.printBook(bkList);
             
             
		} catch (NullPointerException e) {
	
			 System.err.println("Book Object may not be initialized " + e.getMessage());
		}
         
          
         Librarian chiefLibrarian= new Librarian(101,"Ganesh","Vizag");
         
         System.out.println(chiefLibrarian);
         
         
         System.out.println(javaBook.equals(seliniumBook));   // checking different object
         
         
         Book bk = null;
         
         System.out.println(javaBook.equals(bk));   // checking cautious
         
         String bk2 = new String("Book");
         
         System.out.println(javaBook.equals(bk2));   // checking different classes
         
         
         System.out.println(javaBook.equals(javaBook));   // checking identity
         
         Book jb=null;
		try {
			jb = new Book("Head First Java","Kathy Sieera",340.00,400);
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
         
         System.out.println("equlity"+javaBook.equals(jb));   // checking equality
         
         
	}

}
//http://bit.ly/java_01_vatsan


