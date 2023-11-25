package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Stocks_Class extends Model{
	public int _stock_id;
	public String _stock_items;
	public String _stock_type;
	public String _stock_description;
	public String _stok_number;
	public Permission_Class _unnamed_Permission_Class_;

	public void addStock() {
		throw new UnsupportedOperationException();
	}

	public void editStock() {
		throw new UnsupportedOperationException();
	}

	public void deleteStock() {
		throw new UnsupportedOperationException();
	}

	public void searchStock() {
		throw new UnsupportedOperationException();
	}
}