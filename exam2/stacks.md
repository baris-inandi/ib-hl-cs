# Stacks

To create a stack in ibps, use `STACK = new Stack()`.

> IMPORTANT: Stacks are a LIFO (Last In First Out) data structure. This means that the last item added to the stack will be the first item removed from the stack.

## Stack Methods

* `STACK.push(item)` - adds an item to the top of the stack
* `STACK.pop()` - removes and returns the top item from the stack
* `STACK.peek()` - returns the top item from the stack without removing it

## Traversing a Stack

```ibps
loop while NOT STACK.isEmpty()
    output STACK.pop()
end loop
```

## Applications of Stacks

* Back button in a web browser
* Undo functionality in a text editor
* Web browser history
* Computer Memory Management
