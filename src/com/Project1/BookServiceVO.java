package com.Project1;

public class BookServiceVO {

	private String bookNum;
	private String bookName;
	private String author;
	
	public BookServiceVO() {};
	
	public BookServiceVO(String bookNum, String bookName, String author) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookNum() {
		return bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		
		String str = String.format("%3s| %4s-%4s ", bookNum, bookName, author);
		
		return str;
	}
}
