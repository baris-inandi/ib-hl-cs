# Queues

To create a queue in ibps, use `QUEUE = new Queue()`.

> IMPORTANT: Queues are a FIFO (First In First Out) data structure. This means that the first item added to the queue will be the first item removed from the queue.

## Queue Methods

* `QUEUE.enqueue(item)` - adds an item to the back of the queue
* `QUEUE.dequeue()` - removes and returns the front item from the queue
* `QUEUE.peek()` - returns the front item from the queue without removing it
* `QUEUE.isEmpty()` - returns true if the queue is empty, false otherwise

## Applications

* Keyboard
* First Come First Serve services
* Customer Queues
* CPU Task Scheduling

## Circular Queues

A circular queue is a queue that uses a fixed size array. When the queue is full, the front of the queue wraps around to the back of the array. This is useful when you want to limit the size of the queue.

### Applications of Circular Queues

* CPU Task Scheduling
* Traffic Lightsx

## Traversing a Queue

```ibps
loop while NOT QUEUE.isEmpty()
    output QUEUE.dequeue()
end loop
```
