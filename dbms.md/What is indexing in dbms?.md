## What is indexing in dbms?

Indexing is a technique used in database management systems (DBMS) to improve the speed of data retrieval. An index is a data structure that stores a subset of the data in a database, along with pointers to the location of the full data records. When a user queries the database for data, the DBMS can use the index to quickly find the relevant records.

There are two main types of indexes:

* **Primary indexes** are created on the primary key of a table. The primary key is a unique identifier for each record in a table, so the primary index can be used to quickly find any record in the table.
* **Secondary indexes** are created on other columns in a table. Secondary indexes can be used to improve the speed of queries that are based on those columns.

Indexing can significantly improve the performance of database queries. For example, a query that would take 10 seconds to execute without an index might only take 1 second with an index.

