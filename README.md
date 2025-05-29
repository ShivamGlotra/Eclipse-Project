# Bank Management App (JavaFX, Eclipse)

A simple GUI Banking application built in JavaFX, serving as a prototype for a login and transaction management app. Users can create accounts, log in, check balances, and perform withdrawals or deposits. All data is stored in a MySQL database.

## Features

- **User Authentication:** Create new accounts and securely log in.
- **Account Management:** View account balances.
- **Transactions:** Deposit and withdraw funds.
- **Database Integration:** All user and transaction data stored in MySQL.
- **GUI:** Interactive JavaFX-based user interface.

## Getting Started

### Prerequisites

- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- JavaFX SDK (if not bundled with your JDK)
- The following libraries:
  - [jcalendar](https://toedter.com/jcalendar/)
  - [mysql-connector-java](https://dev.mysql.com/downloads/connector/j/)

### Setup Instructions

1. **Clone or Download the Project**
   - Import the project as an Eclipse Java project.

2. **Install Dependencies**
   - Add `jcalendar` and `mysql-connector-java` JARs to your project’s build path.

3. **Configure the Database**
   - Create a MySQL database and update database connection details in the code as required (host, username, password, database name).
   - Import any provided SQL scripts to set up necessary tables.

4. **Run the Application**
   - Open the `Main` or `Login` file in Eclipse.
   - Right-click and choose `Run As > Java Application`.

## Usage

- Register a new account or log in with existing credentials.
- View your balance, deposit, or withdraw money.
- All changes are reflected in the MySQL database.

## Libraries Used

- **JavaFX:** For building the graphical user interface.
- **jcalendar:** For date selection components.
- **mysql-connector-java:** For connecting Java to MySQL databases.

## Author

Made by Shivam Glotra while self-learning via the web and books.

---

*This project can be used as a learning prototype for JavaFX login and transaction apps with database integration.*
