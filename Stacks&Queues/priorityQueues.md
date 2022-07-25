## Priority Queue ADT
- Stack ADT ( remove -> most recently added element )
- Queue ADT ( remove -> least recently added element )
- Priority Queue ADT ( remove -> element with the highest priority )

- Common uses
  - Retrieve minimum values from a collection of data
  - Retrieve maximum values from a collection of data

- Requirements 
  - Comparable data

- Problem
  - Efficiently ranking by priority
  - solution: heaps as backing data structure

In practice, a linear model doesn't work very well for implementing priority queues. Considering the idea of implementing a priority queue by maintaining a sorted list, there are two options, array-backed sorted list or linked sorted list.

### Array Backed Sorted List
Similar to an ArrayQueue where the element with the highest priority could be at the front, while the element with lowest priority could be at the back. With this model, dequeueing and peeking would be `O(1)` operations like in the ArrayQueue. In general, enqueueing would be an `O(N)` procedure, even if we consider amortizing the resize cost. This is cause if we wanted to enqueue, we'd need to maintain the sorted order of the data, so we'd need to shift data around to place it. There are other variations we could use such as flipping the priority order and keeping the data zero-aligned, but they all lead us to similar conclusions.

For the linked version, it would again be similar to a LinkedQueue where the element with highest priority would be at the head while the element with highest priority would be at the head while the element with lowest priority would be at the tail. Peeking and dequeueing remain as `O(1)` but enqueueing would be `O(N)` since we need to find the location to insert the data.


## Deques
- short for 'double-ended queue'
- does not have a single expected removal behaviour
- can add and remove from both ends efficiently

Array Backed Deques
- `addLast()`
  - increment back (mod by capacity) -> add at back
- `removeFirst()`
  - remove at front -> increment front (mod by capacity)
- `addFirst()`
  - decrement front (check if <0) -> add at front
- `removeLast()`
  - remove at back -> decrement back (check if < 0 )

## % operator
-9 % 5 = 1 since -10 = 5 (-2) + 1
however, `js` -9 % 5 = -4 since -9 is negative, and -4 is closest to 0 of the negative remainders.
