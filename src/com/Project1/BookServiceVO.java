package com.Project1;

public class BookServiceVO {

	private String bookNum;
	private String bookName;
	private String author;
	private int stock;
	private boolean loan;
	
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isLoan() {
		return loan;
	}

	public void setLoan(boolean loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		
		String str = String.format("%4s %4s %4s", bookNum, bookName, author);
		
		return str;
	}
}
