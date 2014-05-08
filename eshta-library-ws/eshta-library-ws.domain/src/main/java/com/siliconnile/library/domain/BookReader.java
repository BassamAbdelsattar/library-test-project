package com.siliconnile.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

@Entity
@Table(name = "book_reader")
public class BookReader extends BasicObject {

	private long bookId;
	private long readerId;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	@Column(name="book_id")
	public long getReaderId() {
		return readerId;
	}
	@Column(name="reader_id")
	public void setReaderId(long readerId) {
		this.readerId = readerId;
	}
	
	

}
