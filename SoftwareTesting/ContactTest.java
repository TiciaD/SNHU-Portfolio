import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContactTest {

	Contact contact = new Contact("1234567", "John", "Doe", "8001234567", "500 Main Street");
	
	@Test
	void testContact() {
		Contact testContact = new Contact("0001", "Bob", "Smith", "1002003000", "200 West Street");
		assertTrue(testContact.getContactID().equals("0001"));
		assertTrue(testContact.getFirstName().equals("Bob"));
		assertTrue(testContact.getLastName().equals("Smith"));
		assertTrue(testContact.getPhoneNumber().equals("1002003000"));
		assertTrue(testContact.getAddress().equals("200 West Street"));
	}

	@Test
	void getContactID() {
		assertEquals("1234567", contact.getContactID());
	}

	@Test
	void getFirstName() {
		assertEquals("John", contact.getFirstName());
	}

	@Test
	void getLastName() {
		assertEquals("Doe", contact.getLastName());
	}

	@Test
	void getPhoneNumber() {
		assertEquals("8001234567", contact.getPhoneNumber());
	}

	@Test
	void getAddress() {
		assertEquals("500 Main Street", contact.getAddress());
	}

	@Test
	void setFirstName() {
		contact.setFirstName("Jane");
		assertEquals("Jane", contact.getFirstName());
	}

	@Test
	void setLastName() {
		contact.setLastName("Smith");
		assertEquals("Smith", contact.getLastName());
	}

	@Test
	void setPhoneNumber() {
		contact.setPhoneNumber("9001002000");
		assertEquals("9001002000", contact.getPhoneNumber());
	}

	@Test
	void setAddress() {
		contact.setAddress("100 West Street");
		assertEquals("100 West Street", contact.getAddress());
	}
	
	@Test
	void testSetTooLongFirstName() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a first name that's longer than 10 characters
		assertThrows(IllegalArgumentException.class, () -> testContact.setFirstName("MyNameIsLong"));
	}
	
	@Test
	void testSetTooLongLastName() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a last name that's longer than 10 characters
		assertThrows(IllegalArgumentException.class, () -> testContact.setLastName("MyNameIsLong"));
	}
	
	@Test
	void testSetTooLongPhoneNumber() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a phone number that's longer than 10 characters
		assertThrows(IllegalArgumentException.class, () -> testContact.setPhoneNumber("11122233334"));
	}
	
	@Test
	void testSetTooShortPhoneNumber() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a phone number that's shorter than 10 characters
		assertThrows(IllegalArgumentException.class, () -> testContact.setPhoneNumber("111222333"));
	}
	
	@Test
	void testSetTooLongAddress() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a address that's longer than 30 characters
		assertThrows(IllegalArgumentException.class, () -> testContact.setAddress("2100 SuperLongStreetNameForTestingPurposes"));
	}
	
	@Test
	void testSetNullFirstName() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a first name that's null
		assertThrows(IllegalArgumentException.class, () -> testContact.setFirstName(null));
	}
	
	@Test
	void testSetNullLastName() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a last name that's null
		assertThrows(IllegalArgumentException.class, () -> testContact.setLastName(null));
	}
	
	@Test
	void testSetNullPhoneNumber() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set a phone number that's null
		assertThrows(IllegalArgumentException.class, () -> testContact.setPhoneNumber(null));
	}
	
	@Test
	void testSetNullAddress() {
		Contact testContact = new Contact("0002", "Joe", "Smith", "1112223333", "100 East Street");
		// Should throw an exception if we set an address that's null
		assertThrows(IllegalArgumentException.class, () -> testContact.setAddress(null));
	}

}

