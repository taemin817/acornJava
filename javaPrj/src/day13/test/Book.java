package day13.test;

public class Book {
	String bookCode;
	String bookTitle;
	String author;
	
	public Book() {	}	// 기본생성자
	
	public Book(String bookCode, String bookTitle, String author) {
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "책코드 : "+bookCode+"\n책이름 : "+bookTitle+"\n책저자 : "+author;
	}
}
