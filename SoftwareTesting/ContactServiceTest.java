import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	ContactService contactService = new ContactService();
	Contact testContact1 = new Contact("0001", "John", "Doe", "8001234567", "500 Main St");
	Contact testContact2 = new Contact("0002", "Jane", "Doe", "8001112222", "200 East St");

	@Test
	public void testAddContact() {
		assertEquals(contactService.getContacts().size(), 0);
		contactService.addContact(testContact1);
		assertEquals(contactService.getContacts().size(), 1);
		assertEquals(contactService.getContacts().toString(), "[Contact ID: 0001 John Doe | 8001234567 | 500 Main St]");
	}

	@Test
	public void testDeleteContact() {
		assertEquals(contactService.getContacts().size(), 0);
		contactService.addContact(testContact1);
		assertEquals(contactService.getContacts().size(), 1);
		contactService.deleteContact("0001");
		assertEquals(contactService.getContacts().size(), 0);
	}

	@Test
	public void testUpdateContact() {
		assertEquals(contactService.getContacts().size(), 0);
		contactService.addContact(testContact1);
		assertEquals(contactService.getContacts().size(), 1);
		assertEquals(contactService.getContacts().toString(), "[Contact ID: 0001 John Doe | 8001234567 | 500 Main St]");
		contactService.updateContact(testContact1.getContactID(), "Bob", "Smith", "9003334444", "100 West St");
		assertEquals(contactService.getContacts().toString(),
				"[Contact ID: 0001 Bob Smith | 9003334444 | 100 West St]");
	}

}
