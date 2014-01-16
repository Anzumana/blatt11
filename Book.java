/* if we were to define any of the variables as static this make them class variables. meaning that we don;t have individual variables for every object of the class but 1 varibale for the whole class.
 * in our specific example if we were to chang ethe titel of the book to be a static variable. we would stll be able to add all the book. however the book objects that we would store inside the bookstore would all have the title of the last added book.
 * THis happens because each time the constructor of the book class gets called it changes the class variable titel.
 *
 *
 */
public class Book {
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
