package com.tedu.bean;

import java.util.Date;

public class OaBookBean {
	private int id;
	private String isbn;
	private String title;
	private String author;
	private String press;
	
	@Override
	public String toString() {
		return "OaBookBean [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", press="
				+ press + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	
	
}
