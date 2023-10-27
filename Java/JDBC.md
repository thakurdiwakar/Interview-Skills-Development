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
2. Create a Connection object by calling `DriverManager.getConnection()` with the
   appropriate `database URL, username, and password`.
3. Use the Connection object to create a Statement, PreparedStatement, or CallableStatement to execute SQL queries.

## What is the difference between DriverManager and DataSource in JDBC?

- **DriverManager**: It is responsible for managing the available JDBC drivers.
  It loads the appropriate driver based on the JDBC URL and provides connections using DriverManager.getConnection().
- **DataSource**: It is an alternative to DriverManager and provides a standardized way to manage connections in a
  connection pool. It offers features like connection pooling, connection caching, and transaction management.

## How do you load JDBC drivers?

- JDBC drivers can be loaded using the Class.forName() method by specifying the fully qualified class name of the
  driver.

For example:

```
Class.forName("com.mysql.cj.jdbc.Driver");
```

## What are the different types of statements in JDBC?

- There are three types of statements in JDBC:

1. **Statement**: Used to execute static SQL statements without parameters.
2. **PreparedStatement**: A precompiled SQL statement that can accept input parameters.
3. **CallableStatement**: Used to execute stored procedures or functions in the database.

## Explain ResultSet in JDBC and its types.

- ResultSet represents the result of a database query. It provides methods to navigate through the result set and
  retrieve data. The types of ResultSet are:

1. **TYPE_FORWARD_ONLY**: The result set can only be traversed forward.
2. **TYPE_SCROLL_INSENSITIVE**: The result set can be scrolled both forward and backward, but the changes made in the
   database are not reflected.
3. **TYPE_SCROLL_SENSITIVE**: The result set can be scrolled both forward and backward, and the changes made in the
   database are reflected
