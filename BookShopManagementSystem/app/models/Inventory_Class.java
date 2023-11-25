package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Inventory_Class extends Model{
	public int _inventory_id;
	public String _inventory_type;
	public String _inventory_description;
	public String _inventory_items;
	public String _inventory_number;
	public Permission_Class _unnamed_Permission_Class_;

	public void addInventory() {
		throw new UnsupportedOperationException();
	}

	public void editInventory() {
		throw new UnsupportedOperationException();
	}

	public void deleteInventory() {
		throw new UnsupportedOperationException();
	}

	public void searchInventory() {
		throw new UnsupportedOperationException();
	}
}