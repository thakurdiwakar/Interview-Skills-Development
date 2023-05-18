# JDBC Interview Questions

## 1. what is JDBC?

- JDBC (Java Database Connectivity) is an API (Application Programming Interface) that provides a standard way for Java
applications to interact with databases. It allows developers to perform database operations, such as connecting to a
database, executing SQL queries, and retrieving or modifying data.

## 2. What are the core interfaces provided by JDBC?

- The core interfaces provided by JDBC are:

1. **Connection**: Represents a connection to a database.
2. **Statement**: Used to execute SQL statements and retrieve results.
3. **PreparedStatement**: A precompiled SQL statement that can be parameterized.
4. **CallableStatement**: Used to execute stored procedures.
5. **ResultSet**: Represents a set of results obtained from a database query.

## What are the steps to establish a JDBC connection to a database?
- The steps to establish a JDBC connection are as follows:

1. Load the JDBC driver class using `Class.forName()`
2. Create a Connection object by calling `DriverManager.getConnection()` with the appropriate `database URL, username, and password`.
3. Use the Connection object to create a Statement, PreparedStatement, or CallableStatement to execute SQL queries.

## What is the difference between DriverManager and DataSource in JDBC?

- DriverManager: It is responsible for managing the available JDBC drivers. It loads the appropriate driver based on the JDBC URL and provides connections using DriverManager.getConnection().
  DataSource: It is an alternative to DriverManager and provides a standardized way to manage connections in a connection pool. It offers features like connection pooling, connection caching, and transaction management.