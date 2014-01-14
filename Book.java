public class Book{
	String titel;
	String isbnNumber;
	double price;
	Book(){
		System.out.println("Created a new Book Object");
		
	}
	public String toString(){
		System.out.println("Test of to String");
		return "Book(Sprechen Sie Java,"+ isbnNumber +"," + price+ ")";
	}
	Book(String titel,String isbnNumber, double price){
		this.titel = titel;
		this. isbnNumber = isbnNumber;
		this.price = price;
	}



}
