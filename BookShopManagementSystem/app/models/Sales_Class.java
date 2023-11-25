package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Sales_Class extends Model{
	public int _sale_id;
	public int _sale_customer_id;
	public String _sale_amount;
	public String _sale_type;
	public String _sale_description;
	public Permission_Class _unnamed_Permission_Class_;

	public void addSales() {
		throw new UnsupportedOperationException();
	}

	public void editSales() {
		throw new UnsupportedOperationException();
	}

	public void deleteSales() {
		throw new UnsupportedOperationException();
	}

	public void searchSales() {
		throw new UnsupportedOperationException();
	}
}