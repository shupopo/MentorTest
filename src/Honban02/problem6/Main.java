package Honban02.problem6;

public class Main {
	public static void main(String args){
		Book b = new Book("afaf",222);
	}
	
}

class Book{
	private String title;
	private int price;
	
	public Book(){
		// insert code here
	}
	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	public void print(){
		System.out.println(title + ","+ price);
	}	
}