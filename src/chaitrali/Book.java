package chaitrali;

public class Book {
	String title;
	String bookPublisher;
	String author;
	
	//Parameterized constructor of Book class
	Book(String title,String bookPublisher, String author)
	{
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}
	
	//Method to display all the Book details
	public void displayBookDetails()
	{
		System.out.println("Book Details: " + "\n" + "Book Title: " + title + "\n" +"Publisher: " +bookPublisher + "\n"+"author name: " + author );
	}

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Please enter Book Title, Publisher and author name:");
	//	String[] book = sc.nextLine().split(" ");
		
		Book bk = new Book("2 States","Novel Publisher", "Chetan Bhagat");
		bk.displayBookDetails();
	}

}
