# Difference between Event Handler and Event listener

The terms event handler and event listener are often used interchangeably, but there is a slight difference between the two. An event handler is a function that is called when an event occurs. An event listener is an object that listens for events and calls the appropriate event handler when an event occurs.

In JavaScript, event handlers are typically defined using the `addEventListener()` method. For example, the following code defines an event handler for the `click` event on a button element:

```
button.addEventListener('click', function() {
  // This code will be executed when the button is clicked.
});
```

The `addEventListener()` method takes two arguments: the name of the event and the function that will be called when the event occurs. In this example, the name of the event is `click` and the function that will be called is a anonymous function.

Event listeners are typically defined using the `on` property. For example, the following code defines an event listener for the `click` event on a button element:

```
button.on('click', function() {
  // This code will be executed when the button is clicked.
});
```

The `on` property takes two arguments: the name of the event and the function that will be called when the event occurs. In this example, the name of the event is `click` and the function that will be called is a anonymous function.

There is no difference in the functionality of event handlers and event listeners. However, there are some differences in the way that they are used. For example, event handlers are typically used when you want to define a specific function to be called for a specific event. Event listeners are typically used when you want to define a generic function to be called for a variety of events.

