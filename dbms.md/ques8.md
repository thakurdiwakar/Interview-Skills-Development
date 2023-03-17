# When does checkpoint occur in DBMS?


A checkpoint in a DBMS occurs either explicitly through a command issued by a DBA, automatically at a configured interval, during recovery after a system failure, or when the end of the transaction log is reached. The purpose of a checkpoint is to ensure that all modified data pages are written to the disk and that the database can be recovered without losing data.
