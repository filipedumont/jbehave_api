Feature: Phonebook methods



Scenario: User should be able to get phonebook contact list
When I view phonebook contacts
Then there are no errors and status is success

Scenario: User should be able to add a new contact in the contact list
When I add a new contact in contact list:
| name | mobilephone | homephone | 
| Filipe | 553188888888 | 4123784025|