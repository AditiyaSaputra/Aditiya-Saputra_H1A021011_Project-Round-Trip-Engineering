package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Receipt_Class extends Model{
	public int _receipt_id;
	public String _receipt_type;
	public String _receipt_description;
	public String _receipt_number;
	public int _receipt_customer_id;
	public Permission_Class _unnamed_Permission_Class_;

	public void addReceipt() {
		throw new UnsupportedOperationException();
	}

	public void editReceipt() {
		throw new UnsupportedOperationException();
	}

	public void deleteReceipt() {
		throw new UnsupportedOperationException();
	}

	public void searchReceipt() {
		throw new UnsupportedOperationException();
	}
}