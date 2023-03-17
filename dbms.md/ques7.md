# Explain the difference between the DELETE and TRUNCATE command in a DBMS.


  DELETE is a DML command that removes rows one by one and can be rolled back, but TRUNCATE is a DDL command that removes all rows at once and cannot be rolled back. TRUNCATE     is faster and uses fewer system resources, but it does not trigger ON DELETE triggers and releases space used by the table immediately.
  
   For more :https://www.interviewbit.com/dbms-interview-questions/
