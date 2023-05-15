# Explain the term “Scope” in JavaScript and write its different type.
Managing the availability of variables or objects in an application is governed by the concept of scope. In JavaScript, there are two types of scope as follows:

- **Global Scope**: A variable having global scope can be accessed from anywhere in the program. These variables that are declared outside of any function can be accessed from any place in the program.

Example:

`let subject = "DataScience"
function mySUbject() {
    // Your code here
}`

- **Local Scope**: Variables with a local scope can only be accessed within the same function in which they are declared. Whenever a variable is declared inside a function, it becomes local to the function. As soon as a function begins, local variables are created and deleted when the function is executed.

Example:

```
function mySubject() {
 let subject = "DataScience";
     // Your code here 
}
```