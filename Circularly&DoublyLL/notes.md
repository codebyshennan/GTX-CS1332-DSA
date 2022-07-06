# Doubly Linked List

- Solves the problem of inefficient removal from back operations that SLL has.
- Almost always has a `tail` pointer.
- Takes the overhead (not much) of extra memory usage in exchange for better time efficiency.

## Adding to the front

- Create the new node
- Set the new node's next pointer to the current `head`
- Set the `head`'s previous pointer to the new node
- Set `head` to the new node

## Adding to the back

- Create the new node
- Set the new node's previous pointer to the `tail`
- Set the `tail`'s next pointer to the new node
- Set the `tail` to the new node

Note: always change pointers last, if not we lose O(1) access to the current node

## Removing from the front or the back
- Can now be done by reassigning `head` or `tail` to the `next` or `previous` node respectively, and assigning the other reference to `null`

# Circularly-Linked List
`next` of the last node points back to `head`
no need for a `tail` pointer
can be singly or doubly linked

## Adding to the front of a CLL efficiently O(1)
- Create an empty node
- Add the new node at index 1 (basically between the `head` and the second node)
- Move the data from the `head` to the new node
- Add the new data into the `head` node (ensures the `.next` ref of the last node remains pointing at the `head`)

## Adding to the back of a CLL 
- Create an empty node
- Add the new node to index 1 (same as adding from front)
- Copy data from the `head`
- Place the new data in the `head`
- Move the `head` reference to the newly constructed node

## Removing from the front
- Removing from the front becomes a bit trickier than just moving the head forwards
- Move the data from `head.next` into `head`

## Where do we find LinkedLists
- Singly Linked List
  - History of web browser searches (back button)
- Doubly Linked List
  - Most recently used cache; music app that keeps track of your most recent songs
- Circular Linked List
  - Music playlist that starts over once completed
