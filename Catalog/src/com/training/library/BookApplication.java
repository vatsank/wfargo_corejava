package com.training.library;

public class BookApplication {

	public static void main(String[] args) {

		
		EBook javaBook = 
				new EBook("Java Book",101,"Ramesh",10,200);
		
		LibraryManager.showBorrowingTime(javaBook);
		
		
		Journals chemicalJournal = new Journals("Chemical Society",202, "Ganesh","ICEE","Inorganic");
		

		
		LibraryManager.showBorrowingTime(chemicalJournal);
		
		
		
	}

}
