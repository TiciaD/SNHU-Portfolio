import java.util.ArrayList;

public class ContactService {
	// create a list to hold all the Contact objects
	private ArrayList<Contact> contacts;

	public ContactService() {
		// initiate an empty contact list
		contacts = new ArrayList<>();
	}

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	// Add contact to list
	public void addContact(Contact newContact) {
		// null check
		if (newContact != null) {
			// Check if contact is a duplicate value, initialize as false
			boolean isDuplicate = false;

			// Loop over contact list
			for (Contact contact : contacts) {
				// if new contact is equal to a contact already in list
				if (contact.equals(newContact)) {
					// set duplicate state to true
					isDuplicate = true;
				}
			}

			// If the contact is not a duplicate
			if (!isDuplicate) {
				// Add contact to list and return success message
				contacts.add(newContact);
				System.out.println("Contact added successfully!");
			} else {
				// return error message
				System.out.println("Error occurred, contact was not added");
			}
		} else {
			System.out.println("Error occurred, contact was not added");
		}
	}

	// Delete contact from list
	public void deleteContact(String contactID) {
		// null check
		if (contactID != null) {
			// Loop over contact list
			for (Contact contact : contacts) {
				// if contact ID is equal to contact ID of a contact already in list
				if (contact.getContactID().equals(contactID)) {
					// remove contact object from list
					contacts.remove(contact);
					// Print success message
					System.out.println("Contact deleted successfully!");
					return;
				}
			}
			System.out.println("Error occurred, could not find this contact in the contact list");
		} else {
			// Print error message
			System.out.println("Error occurred, contact was not deleted");
		}
	}

	// Update contact with given info based on contactId
	public void updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		// null check
		if (contactID != null) {
			// Loop over contact list
			for (Contact contact : contacts) {
				if (contact.getContactID().equals(contactID)) {
					if (firstName != null && !firstName.equals("") && !(firstName.length() > 10)) {
						contact.setFirstName(firstName);
					} else {
						System.out.println(
								"Error occurred: Value required and must be less than 10 characters. First Name was not set");
					}
					if (lastName != null && !lastName.equals("") && !(lastName.length() > 10)) {
						contact.setLastName(lastName);
					} else {
						System.out.println(
								"Error occurred: Value required and must be less than 10 characters. Last Name was not set");
					}
					if (phoneNumber != null && !phoneNumber.equals("") && (phoneNumber.length() == 10)) {
						contact.setPhoneNumber(phoneNumber);
					} else {
						System.out.println(
								"Error occurred: Value required and must be 10 characters. Phone number was not set");
					}
					if (address != null && !address.equals("") && !(address.length() > 30)) {
						contact.setAddress(address);
					} else {
						System.out.println(
								"Error occurred: Value required and must be less than 30 characters. Address was not set");
					}
					System.out.println(this.getContacts().toString());
				} else {
					System.out.println("Error occurred, could not find this contact in the contact list");
				}
			}
		} else {
			System.out.println("Error occurred, could not find this contact ID in the contact list");
		}

	}

}

