## What is denormalization ?

Denormalization is a strategy used on a previously-normalized database to increase performance. In computing, denormalization is the process of trying to improve the read performance of a database, at the expense of losing some write performance, by adding redundant copies of data or by grouping data.

Here are some of the benefits of denormalization:

* **Improved read performance:** Denormalization can improve read performance by reducing the number of joins required to retrieve data. For example, if a table contains a list of products and their prices, and you want to retrieve a list of all products with their prices, you would need to join the product table with the price table. However, if the price information were added as a redundant column to the product table, you could simply retrieve the product information from a single table.
* **Reduced complexity:** Denormalization can reduce the complexity of database queries by making them simpler and easier to write. This can be especially beneficial for complex queries that involve multiple tables.
* **Improved scalability:** Denormalization can improve the scalability of a database by reducing the number of database transactions required to retrieve data. This is because denormalized databases can often be read more efficiently than normalized databases.


The decision of whether or not to denormalize a database is a complex one. There are many factors to consider, including the specific needs of the application, the performance requirements of the database, and the complexity of the database schema.
