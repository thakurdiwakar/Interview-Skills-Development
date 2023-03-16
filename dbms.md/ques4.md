### What is meant by ACID properties in DBMS?

ACID is an acronym for Atomicity, Consistency, Isolation, and Durability, which are a set of properties that guarantee reliability and consistency in a database management system (DBMS). These properties ensure that database transactions are executed reliably and accurately, even in the presence of system failures or errors.

Here's a brief overview of each ACID property:

 1.Atomicity: Atomicity refers to the "all-or-nothing" property of transactions, meaning that a transaction is either executed in its entirety or not at all. If any part of the transaction fails, the entire transaction is rolled back to its previous state, ensuring that the database remains consistent.

 2.Consistency: Consistency refers to the state of the database before and after a transaction is executed. A transaction should transform the database from one consistent state to another consistent state. The database should always satisfy certain rules and constraints, such as referential integrity constraints and unique key constraints.

 3.Isolation: Isolation refers to the ability of a transaction to operate independently of other transactions. Each transaction should be isolated from other transactions, so that the intermediate states of a transaction are not visible to other transactions. This ensures that the database remains consistent, even when multiple transactions are executed simultaneously.

 4.Durability: Durability refers to the ability of the database to recover from failures and maintain data integrity. Once a transaction is committed, its changes should be permanent and survive system failures, such as power outages, hardware failures, or software crashes.
