package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Role_Class extends Model{
	public int _role_id;
	public String _role_title;
	public String _role_description;

	public void addRole() {
		throw new UnsupportedOperationException();
	}

	public void editRole() {
		throw new UnsupportedOperationException();
	}

	public void deleteRole() {
		throw new UnsupportedOperationException();
	}

	public void searchRole() {
		throw new UnsupportedOperationException();
	}

	public void assignRole() {
		throw new UnsupportedOperationException();
	}
}