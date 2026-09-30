class Book{
String title;
String author;
double price;

void showbookdetails(){
	System.out.println("Book Title : "+title);
	System.out.println("Book Author Name: "+author);
	System.out.println("Book Price : "+price);

		}
	public static void main(String args[]){
		Book bk=new Book();
		bk.title="Apna Java";
		bk.author="Mr.Sumit Tripathi";
		bk.price=960.50;

		bk.showbookdetails();

		
		}
}