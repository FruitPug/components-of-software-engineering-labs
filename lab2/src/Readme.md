## Requirements

### Functional Requirements

* **FR1**: The system shall allow visitors to browse, search, and view book details, including title, author, genres, average rating, and user reviews.

* **FR2**: The system shall allow visitors to register by providing a unique email, username, and password, and to log in with valid credentials.

* **FR3**: The system shall allow registered users to log out securely, invalidating their session or authentication token.

* **FR4**: The system shall allow registered users to write, edit, and delete reviews for any book in the catalog, limited to one review per book per user.

* **FR5**: When a review is created, edited, or deleted, the system shall automatically update the book’s average rating and review count.

* **FR6**: The system shall allow registered users to like or unlike reviews to express agreement or support for a particular review.

* **FR7**: The system shall allow registered users to set and update their reading status for any book as “Reading,” “Want to Read,” or “Finished.”

* **FR8**: The system shall allow users to view and manage their profiles, including viewing lists of read or wanted books, reviews, and social connections.

* **FR9**: The system shall allow registered users to send, accept, reject, and remove friend requests, managing a list of friends within the platform.

* **FR10**: The system shall allow users to report inappropriate reviews, submitting them for administrative moderation.

* **FR11**: The system shall allow administrators to manage books — including adding new titles, editing book descriptions, and deleting books from the catalog.

* **FR12**: When an administrator deletes a book, the system shall cascade delete all related reviews and update ratings accordingly.

* **FR13**: The system shall allow administrators to manage users, including viewing profiles, modifying user information, and banning users who violate policies.

* **FR14**: When a user is banned, the system shall automatically remove all of their reviews and update affected book ratings.

* **FR15**: The system shall allow administrators to manage and delete reviews globally.


### Non-Functional Requirements

* **NFR1**: The system shall ensure that all passwords are stored securely using salted hashing algorithms.

* **NFR2**: The system shall provide a response time of less than 2 seconds with 500 simultaneous users.

* **NFR3**: The system shall ensure data consistency and integrity across related entities.

* **NFR4**: The system shall maintain 98% uptime during regular operation.

* **NFR5**: The system shall log all administrative actions for auditing and accountability.

* **NFR6**: The system shall comply with privacy regulations by allowing users to delete their accounts and associated data.

* **NFR7**: The system’s UI shall be responsive and usable on desktop and mobile devices.

* **NFR8**: The system shall provide database backups daily, store them for 1 year and allow full restoration within 30 minutes.


## Traceability Matrix
### Use Cases
* UC1: Browse Catalog
* UC2: Search Books
* UC3: View Book Details
* UC4: Register
* UC5: Login
* UC6: Logout
* UC7: Manage Review
* UC8: Write Review
* UC9: Edit Review
* UC10: Delete Review
* UC11: Like Review
* UC12: View Profile
* UC13: Manage Friends
* UC14: Send Friend Request
* UC15: Accept Friend Request
* UC16: Reject Friend Request
* UC17: Remove From Friends
* UC18: Set Reading Status
* UC19: Report Review
* UC20: Manage Books
* UC21: Add Book
* UC22: Delete Book
* UC23: Edit Description
* UC24: Manage Users
* UC25: Ban User
* UC26: Mod User
* UC27: Manage All Reviews
* UC28: Delete Reviews

### Table
| FC/UC | UC1 | UC2 | UC3 | UC4 | UC5 | UC6 | UC7 | UC8 | UC9 | UC10 | UC11 | UC12 | UC13 | UC14 | UC15 | UC16 | UC17 | UC18 | UC19 | UC20 | UC21 | UC22 | UC23 | UC24 | UC25 | UC26 | UC27 | UC28 |
|-------|-----|-----|-----|-----|-----|-----|-----|-----|-----|------|------|------|------|------|------|------|------|------|------|------|------|------|------|------|------|------|------|------|
| FC1   | ✅   | ✅   | ✅   |     |     |     |     |     |     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |
| FC2   |     |     |     | ✅   | ✅   |     |     |     |     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |
| FC3   |     |     |     |     |     | ✅   |     |     |     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |
| FC4   |     |     |     |     |     |     | ✅   | ✅   | ✅   | ✅    |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |
| FC5   |     |     |     |     |     |     |     | ✅   | ✅   | ✅    |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |
| FC6   |     |     |     |     |     |     |     |     |     |      | ✅    |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |
| FC7   |     |     |     |     |     |     |     |     |     |      |      |      |      |      |      |      |      | ✅    |      |      |      |      |      |      |      |      |      |      |
| FC8   |     |     |     |     |     |     |     |     |     |      |      | ✅    |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |
| FC9   |     |     |     |     |     |     |     |     |     |      |      |      | ✅    | ✅    | ✅    | ✅    | ✅    |      |      |      |      |      |      |      |      |      |      |      |
| FC10  |     |     |     |     |     |     |     |     |     |      |      |      |      |      |      |      |      |      | ✅    |      |      |      |      |      |      |      |      |      |
| FC11  |     |     |     |     |     |     |     |     |     |      |      |      |      |      |      |      |      |      |      | ✅    | ✅    | ✅    | ✅    |      |      |      |      |      |
| FC12  |     |     |     |     |     |     |     |     |     |      |      |      |      |      |      |      |      |      |      |      |      | ✅    |      |      |      |      |      | ✅    |
| FC13  |     |     |     |     |     |     |     |     |     |      |      |      |      |      |      |      |      |      |      |      |      |      |      | ✅    | ✅    | ✅    |      |      |
| FC14  |     |     |     |     |     |     |     |     |     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      | ✅    |      |      | ✅    |
| FC15  |     |     |     |     |     |     |     |     |     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      | ✅    | ✅    |
