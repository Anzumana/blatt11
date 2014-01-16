public class Main{
	public static void main(String[] args){
		System.out.println("Start of my Programm");

		Book myBook= new Book("Sprechen Sie Java","978-3-89864-595-9" ,29.90);
		BookShop myBookShop = new BookShop(5);
		//System.out.println(myBook);
		myBookShop.addBook("A Book","030403",12.9);
		myBookShop.addBook("B Book","9939903",1.9);
		myBookShop.addBook("C Book","9939903",1.9);
		myBookShop.addBook("D Book","9939903",1.9);
		myBookShop.addBook("E Book","9939903",1.9);
		myBookShop.addBook("E Book","9939903",1.9);
		myBookShop.printBooks();
		//System.out.println(myBookShop.getBook("C"));
		if(args.length > 0){
			String consolTitelSearch = "";
			for(int i = 0; i<args.length;i++){
				if(i+1==args.length){
					consolTitelSearch += args[i];
				} else{
					consolTitelSearch += args[i] + " ";
				}
				
			}
			System.out.println(myBookShop.getBook(consolTitelSearch));
		}

		System.out.println("End of my Programm");
	}
}
