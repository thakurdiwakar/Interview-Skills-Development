# Difference between var and let keyword in javascript.



The `var` and `let` keywords are both used to declare variables in JavaScript, but there are some important differences between them.

* **Scope:** Variables declared with `var` are function-scoped, while variables declared with `let` are block-scoped. This means that a `var` variable is accessible from anywhere within the function in which it is declared, while a `let` variable is only accessible from within the block in which it is declared.
* **Hoisting:** `var` declarations are hoisted to the top of their scope, while `let` declarations are not. This means that a `var` variable can be accessed even before it is declared, while a `let` variable cannot be accessed until it is declared.
* **Redeclaration:** `var` variables can be redeclared, while `let` variables cannot. This means that you can declare a `var` variable multiple times within the same scope, but you can only declare a `let` variable once within the same block.
* **Temporal dead zone:** `let` variables have a temporal dead zone, while `var` variables do not. This means that you cannot access a `let` variable until the end of the statement in which it is declared.

Here is an example of the difference between `var` and `let` scoping:

```javascript
function foo() {
  var x = 1;
  {
    console.log(x); // 1
    var x = 2;
    console.log(x); // 2
  }
  console.log(x); // 1
}

foo();
```

In this example, the first `console.log()` statement will print `1`, the second `console.log()` statement will print `2`, and the third `console.log()` statement will print `1`. This is because the `var` variable `x` is function-scoped, so the second `var` declaration of `x` does not shadow the first `var` declaration of `x`.

Here is an example of the difference between `var` and `let` hoisting:

```javascript
function foo() {
  console.log(x); // ReferenceError: x is not defined
  let x = 1;
}

foo();
```

In this example, the `console.log()` statement will throw a `ReferenceError` because the `let` variable `x` is not declared yet. This is because `let` declarations are not hoisted, so the `let` declaration of `x` is not visible until the end of the `foo()` function.

Here is an example of the difference between `var` and `let` redeclaration:

```javascript
function foo() {
  var x = 1;
  x = 2;
  var x = 3; // Error: x is already defined
}

foo();
```

In this example, the second `var x = 2;` statement will not compile because the `var` variable `x` has already been declared. This is because `var` variables can be redeclared.

Here is an example of the difference between `var` and `let` temporal dead zone:

```javascript
function foo() {
  let x;
  if (true) {
    x = 1;
  }
  console.log(x); // ReferenceError: x is not defined
}

foo();
```

In this example, the `console.log()` statement will throw a `ReferenceError` because the `let` variable `x` is not defined yet. This is because the `let` variable `x` is not visible until the end of the `if` statement.

