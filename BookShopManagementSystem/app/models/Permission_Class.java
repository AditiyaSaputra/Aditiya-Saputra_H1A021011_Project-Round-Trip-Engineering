package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Permission_Class extends Model{
	public int _permission_id;
	public int _permission_role_id;
	public String _permission_title;
	public String _permission_module;
	public String _permission_description;
	public Book_Class _unnamed_Book_Class_;
	public Stocks_Class _unnamed_Stocks_Class_;
	public Receipt_Class _unnamed_Receipt_Class_;
	public Sales_Class _unnamed_Sales_Class_;
	public Inventory_Class _unnamed_Inventory_Class_;

	public void addPermission() {
		throw new UnsupportedOperationException();
	}

	public void editpermission() {
		throw new UnsupportedOperationException();
	}

	public void deletePermission() {
		throw new UnsupportedOperationException();
	}

	public void searchPermission() {
		throw new UnsupportedOperationException();
	}
}