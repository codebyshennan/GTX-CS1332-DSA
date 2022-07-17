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
  - at the `head`: `add` is `O(1)`, `remove` is `O(1)
  - at the `tail`: `add` is `O(1)`, `remove` is `O(n)`
  - therefore, we enqueue (add) at the `tail` and dequeue (remove) at the `head`
- SLL with `tail`
  - enqueue at the `tail` and dequeue from the `head`
- DLL with `tail`:
  - `enqueue` and `dequeue` can occur at either end; must be opposite
  - not necessary for a queue implementation (has a higher memory imprint)
