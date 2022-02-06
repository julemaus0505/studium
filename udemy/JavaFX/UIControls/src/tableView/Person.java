package tableView;
import javafx.beans.property.SimpleStringProperty;

public class Person {

	private final SimpleStringProperty userName;
	private final SimpleStringProperty firstName;
	private final SimpleStringProperty lastName;
	private final SimpleStringProperty email;

	public Person(String uName, String fName, String lName, String email) {
		this.userName = new SimpleStringProperty(uName);
		this.firstName = new SimpleStringProperty(fName);
		this.lastName = new SimpleStringProperty(lName);
		this.email = new SimpleStringProperty(email);
	}

	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String fName) {
		firstName.set(fName);
	}
	
	public void setUserName(String uName) {
		userName.set(uName);
	}

	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String fName) {
		lastName.set(fName);
	}

	public String getEmail() {
		return email.get();
	}

	public void setEmail(String fName) {
		email.set(fName);
	}

	public String getUserName() {
		return userName.get();
	}

}
