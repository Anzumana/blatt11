public class Book{
	String titel;
	String isbn;
	double price;
		
	public String toString(){
		return "Book(" + titel +" ,"+ isbn+"," + price+ ")";
	}
	Book(String titel,String isbn, double price){
		this.titel = titel;
		this.isbn= isbn;
		this.price = price;
	}



}
