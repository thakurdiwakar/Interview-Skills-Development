
# Difference between "==" and "==" operators.

JavaScript, "==" and "===" are comparison operators, but they behave slightly differently.
"==" is the equality operator. It compares the values on both sides and returns true if they are equal, even if they are of different types. For example:
`
'5' == 5  // true
`
Here, the string '5' is equal to the number 5 when using the "==" operator.

"===" is the strict equality operator. It not only compares values but also checks if the types are the same. It returns true only if the values are equal and of the same type. For example:
`
'5' === 5 // false
`
In this case, "===" returns false because the types are different (string and number).

In summary, "==" checks for equality of values, while "===" checks for equality of values and types.