# What are the wait() and sleep() methods?

## wait():
As the name suggests, it is a non-static method that causes the current thread to wait and go to sleep until some other threads call the notify () or notifyAll() method for the object’s monitor (lock). It simply releases the lock and is mostly used for inter-thread communication. It is defined in the object class, and should only be called from a synchronized context. 

Example:  

synchronized(monitor) 

{ 

monitor.wait();       Here Lock Is Released by Current Thread  

} 


## sleep():
As the name suggests, it is a static method that pauses or stops the execution of the current thread for some specified period. It doesn’t release the lock while waiting and is mostly used to introduce pause on execution. It is defined in thread class, and no need to call from a synchronized context.  

Example:  

synchronized(monitor) 

{ 

Thread.sleep(1000);     Here Lock Is Held by The Current Thread 

//after 1000 milliseconds, the current thread will wake up, or after we call that is interrupt() method 

} 
