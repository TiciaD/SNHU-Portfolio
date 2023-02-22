# SNHU Software Testing
## Overview
As a software engineer for Grand Strand Systems, you’ve been given an assignment to develop a mobile application for a customer. The customer will provide you with the requirements and your job is to code up the application and provide unit tests to verify that it meets the customer’s requirements. In this assignment, you will focus on delivering the contact services. The purpose of these services is to add, update, and delete contact objects within the application. There is no user interface for this assignment. The contact service uses in-memory data structures to support storing contacts and you will verify the contact service through JUnit tests. The contact service contains a contact object along with the contact service.

You will then construct a summary and reflections report to be submitted to your supervisor that summarizes your unit testing approach, your experience writing the JUnit tests, and the overall quality of your JUnit tests. This report will also highlight testing techniques and the mindset you adopted while working on this project.

## Requirements
- The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
- The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
- The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
- The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
- The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.

- The contact service shall be able to add contacts with a unique ID.
- The contact service shall be able to delete contacts per contact ID.
- The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
  - firstName
  - lastName
  - Number
  - Address
