package com.Project1;

public class BookServiceVO {

	private String bookName;
	private String author;
	
	
	
	public BookServiceVO() {};
	
	public BookServiceVO(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		
		String str = String.format("%4s-%4s ", bookName, author);
		
		return str;
	}
}
