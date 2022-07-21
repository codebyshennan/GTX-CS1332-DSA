# Queues

## Supported Operations
- `void enqueue(x)` -> at the `tail`
- `x dequeue(x)` -> at the `head`
- `x peek() / x top()`
- `boolean isEmpty()`
- `void clear()`
- `int size()`

## Unsupported Operations
- Searching for data
- Arbitrary index access
- Arbitrary add or remove

## Linked-list backed queues
- because we need operations on both sides, a `head` and `tail` reference is needed to make the `add` and `remove` operations as efficient as possible
  - at the `head`: `add` is `O(1)`, `remove` is `O(1)`
  - at the `tail`: `add` is `O(1)`, `remove` is `O(n)`
  - therefore, we enqueue (add) at the `tail` and dequeue (remove) at the `head`
- SLL with `tail`
  - enqueue at the `tail` and dequeue from the `head`
- DLL with `tail`:
  - `enqueue` and `dequeue` can occur at either end; must be opposite
  - not necessary for a queue implementation (has a higher memory imprint)

## Locality of Reference
A significant portion of a processor's job is trying to 'predict' what will happen next in code execution. When the code has an `if` statement, it will try to predict which branch of code is more likely to happen so that it can work on the task ahead of time. 

In the case of traversing through a list, processors implement **spatial locality**, which is where they will prefetch data in adjacent memory locations to optimize the process. This speeds up the process of traversing an `ArrayList` considerably since a lot of time is saved in accessing memory.

Compared to a `LinkedList`, the processor doesn't know 'what' a `LinkedList` is per se, so it doesn't 'know' that you're likely to want the data from the next reference of a LinkedList. This means that it doesn't benefit nearly as much from spatial locality, meaning that in many cases an `ArrayList` may be preferable to a `LinkedList` even if the Big-O says otherwise unless the Big-O difference is particularly egregious.

