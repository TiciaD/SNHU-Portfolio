
public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;

	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException(
					"Invalid input, task ID cannot be null or more than 10 characters");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException(
					"Invalid input, first name cannot be null or more than 10 characters");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException(
					"Invalid input, last name cannot be null or more than 10 characters");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException(
					"Invalid input, phone number cannot be null and must be exactly 10 characters");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException(
					"Invalid input, address cannot be null or more than 30 characters");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getContactID() {
		return contactID;
	}

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException(
					"Error occurred, name was not set. first name cannot be null or more than 10 characters");
		} else {			
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException(
					"Error occurred, last name was not set. last name cannot be null or more than 10 characters");
		} else {		
			
			this.lastName = lastName;
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException(
					"Error occurred, phone number was not set.  phone number cannot be null and must be exactly 10 characters");
		} else {		
			this.phoneNumber = phoneNumber;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException(
					"Invalid input, address cannot be null or more than 30 characters");
		} else {			
			this.address = address;
		}
	}

	@Override
	public String toString() {
		return "Contact ID: " + contactID + " " + firstName + " " + lastName + " | " + phoneNumber + " | " + address;
	}
}
