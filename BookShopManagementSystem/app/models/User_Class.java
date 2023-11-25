package models;
 
import java.util.*;
import javax.persistence.*;
import java.time.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class User_Class extends Role_Class {
	public int _user_id;
	public int _user_rile_id;
	public String _user_name;
	public String _user_email;
	public LocalDate _user_dob;
	public String _user_address;

	public void addUser() {
		throw new UnsupportedOperationException();
	}

	public void editUser() {
		throw new UnsupportedOperationException();
	}

	public void deleteUser() {
		throw new UnsupportedOperationException();
	}

	public void searchUser() {
		throw new UnsupportedOperationException();
	}
}