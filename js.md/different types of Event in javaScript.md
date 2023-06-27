# Explain different types of Event in javaScript

There are many different types of events in JavaScript. Some of the most common ones include:

* **Mouse events:** These events are triggered when the user interacts with the page using their mouse. Some common mouse events include `click`, `mousedown`, `mouseup`, `mouseover`, and `mouseout`.
* **Keyboard events:** These events are triggered when the user presses or releases a key on their keyboard. Some common keyboard events include `keydown`, `keypress`, and `keyup`.
* **Form events:** These events are triggered when the user interacts with a form on the page. Some common form events include `submit`, `reset`, `change`, and `focus`.
* **Document events:** These events are triggered when something happens to the document itself, such as when it loads, unloads, or changes size. Some common document events include `load`, `unload`, `resize`, and `scroll`.
* **Other events:** There are many other types of events that can occur in JavaScript, such as events related to multimedia, network activity, and errors.

When an event occurs, the browser will fire an event object. This object contains information about the event, such as the type of event, the element that triggered the event, and any additional information that is relevant to the event.

JavaScript code can be attached to events using event handlers. Event handlers are functions that are called when a particular event occurs. For example, the following code attaches an event handler to the `click` event for the `button` element:

```
button.onclick = function() {
  // Do something when the button is clicked.
};
```


