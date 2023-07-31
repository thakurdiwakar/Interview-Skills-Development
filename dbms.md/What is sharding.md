## What is sharding 

Sharding is a database partitioning technique that divides a large database into smaller, faster, and more easily managed parts. These smaller parts are called data shards. The word "shard" means "a small part of a whole."

Sharding is used to improve the scalability and performance of a database. By dividing the data into smaller shards, the load on each shard is reduced, which improves performance. Additionally, sharding allows the database to scale horizontally by adding more shards as the data grows.

There are two main types of sharding: horizontal sharding and vertical sharding.

* **Horizontal sharding** divides the data into shards based on the rows in a table. For example, a database of customer records could be sharded by customer ID. This would mean that all customer records with the same customer ID would be stored in the same shard.
* **Vertical sharding** divides the data into shards based on the columns in a table. For example, a database of customer records could be sharded by the customer's first name, last name, and email address. This would mean that all customer records with the same first name would be stored in the same shard.

### Features of Sharding:
Sharding makes the Database smaller
Sharding makes the Database faster
Sharding makes the Database much more easily manageable
Sharding can be a complex operation sometimes
Sharding reduces the transaction cost of the Database
Each shard reads and writes its own data.
Many NoSQL databases offer auto-sharding.
Failure of one shard doesn’t effect the data processing of other shards.
