# Stacks and Queues

## Linear Abstract Data Type (ADT)
- Linear
  - Finite collection of objects
  - Each objects has one immediate predecessor or one immediate successor
  - Exception:
    - first object has no predecessor
    - last object has no successor
  - Stacks are **linear ADTs**
- ADT
  - data structure that is a container with a finite number of objects
  - there is a r'ship between the objects being stored
  - Defined by the operations or behaviour of the operations

## Potential backing data structures for a Stack ADT
- Arrays
- Singly-Linked Lists
- Understanding the tradeoffs in time-complexities allows you to implement a Stack ADT with an optimised backing data structures (chosen)
  - e.g. if choosing a DS for `O(1)` access, choose an array (`O(1)`) rather than a SLL (`O(n)`)

## What is a stack?
- FILO / LIFO

### Supported Operations
- `void push(x)`
- `x push(x)`
- `x peek() / x top()`
- `boolean isEmpty()`
- `void clear()`
- `int size()`

### Unsupported Operations
- Searching for data
- Arbitrary index access
- Arbitrary add or remove

## The Call Stack
How method calls behave
- When a method is called, the current method that is active is put on pause, and the new method that was just called begins execution
- When a method call terminates (i.e. returns), the method call that was previously active unpauses and continues execution from where the method call was made.

## Performance of a Linked-List backed stacks
- No `tail` pointer
- Stacks are lightweight
- Singly-linked lists (no `tail` pointers) are the best and keeps the time complexity to `O(1)`

## Array-backed stacks
- Just need to track the `size` of the array
- Clearing this kind of stack
  - just leave data and overwrite as you go
    - java cannot GC the data
  - manually reset each index in the array to `null`
    - makes clearing an `O(n)` operation
  - reassign the backing array to a new array
    - allows java to GC the array and keeps clearing to `O(1)`
