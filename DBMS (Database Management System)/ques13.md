
Indexing in DBMS is a technique for improving the performance of database queries by reducing the number of disk accesses required to retrieve data. An index is a data structure that organizes the data in a table in a specific way to make it easier to search.

When a query is executed against a database table, the DBMS first checks to see if there is an index on the column(s) that are being referenced in the query. If there is an index, the DBMS will use the index to quickly locate the rows in the table that match the query criteria. Without an index, the DBMS would have to scan the entire table, row by row, to find the matching rows.

There are different types of indexes that can be created in a DBMS, including:

  1.Primary index: A primary index is a unique index that is created on the primary key of a table.

  2.Secondary index: A secondary index is an index that can be created on any column in a table, other than the primary key.

  3.Clustered index: A clustered index is an index that stores the data in the table in the same order as the index.

  4.Non-clustered index: A non-clustered index is an index that stores the data in the table in a different order than the index.
