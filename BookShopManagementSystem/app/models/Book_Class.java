package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Book_Class extends Model{
	public int _book_id;
	public String _book_name;
	public String _book_author;
	public String _book_type;
	public String _book_price;
	public String _book_description;
	public int _book_customer_id;
	public Permission_Class _unnamed_Permission_Class_;

	public void addBooks() {
		throw new UnsupportedOperationException();
	}

	public void editBooks() {
		throw new UnsupportedOperationException();
	}

	public void deleteBooks() {
		throw new UnsupportedOperationException();
	}

	public void searchBooks() {
		throw new UnsupportedOperationException();
	}
}