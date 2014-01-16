public class BookShop{

	Book[] Inventory;
	int numberOfBooksInStore = 0;

	BookShop(int shopSize){
		System.out.println("created new BookShop of Size " + shopSize);
		if(shopSize<1){
			System.out.println("The shop you entered is to small");
		} else{ 
			Inventory = new Book[shopSize];
		}
	} 

	void addBook(String titel,String isbn,double price){
		if(!(getBook(titel)==null)){
			System.out.println("Book is already in store: "+ titel);
			return;
		}
		if(numberOfBooksInStore < Inventory.length){
			Book myBook = new Book(titel,isbn,price);
			Inventory[numberOfBooksInStore] = myBook;
			numberOfBooksInStore++;
		} else{
			System.out.println("BookShop at maximum capacity");
		}
	}

	void printBooks(){
		if(numberOfBooksInStore>0){
			for(int i = 0;i<Inventory.length && i <numberOfBooksInStore ;i++){
				System.out.println(Inventory[i]);
			}
		} else {
			System.out.println("BookStore is Empty");
		}
	}
	
	Book getBook(String titel){
		for(int i = 0; i<Inventory.length && i < numberOfBooksInStore; i++){
			Book myBook;
			myBook = Inventory[i];
			if(titel.equals(myBook.titel)){
				return	myBook; 
			} else{ 
			}
			
		}
		return null;
	}


}
