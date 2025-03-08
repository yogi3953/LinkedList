Linked-List
# Linked List in Java
  A Linked List is a linear data structure in which elements (nodes) are linked using pointers. Unlike arrays, linked lists do not have a fixed size and provide       
  efficient insertions and deletions.

# Types of Linked Lists
  1.Singly Linked List – Each node has a reference to the next node.
  2.Doubly Linked List – Each node has references to both the next and previous nodes.
  3.Circular Linked List – The last node points to the first node, forming a cycle.
  4.Singly Circular Linked List: Last node points to the first.
  5.Doubly Circular Linked List: Last node's next points to the first, and the first node’s previous points to the last.

# Structure of a Node
Each node in a linked list consists of:
  1.Data (the value stored in the node)
  2.Pointer (reference to the next node)

# Operations in a Linked List
1️⃣ Insertion
  1.At the beginning – Update the head pointer.
  2.At the end – Traverse to the last node and update its next pointer.
  3.At a given position – Traverse to the position and insert the new node.
2️⃣ Deletion
  1.From the beginning – Update the head pointer.
  2.From the end – Traverse and remove the last node.
  3.From a specific position – Traverse and adjust pointers.
3️⃣ Traversal
  1.Start from head and iterate through nodes using the next pointer.

# Advantages of Linked List
✅ Dynamic Size – Unlike arrays, linked lists do not have a fixed size.
✅ Efficient Insertions & Deletions – No need for shifting elements.
✅ Memory Utilization – Uses memory efficiently by allocating as needed.

# Disadvantages of Linked List
❌ Extra Memory Overhead – Each node requires extra space for pointers.
❌ Slower Access – Accessing elements requires traversal, unlike arrays (O(1) access).

# Time Complexity
Operation	Singly Linked   List	  Doubly Linked List
Insertion at Beginning	  O(1)	  O(1)
Insertion at End	        O(n)	  O(1) (if tail pointer is used)
Deletion at Beginning	    O(1)	  O(1)
Deletion at End	          O(n)	  O(1)
Searching	                O(n)	  O(n)

# When to Use a Linked List?
  1.When frequent insertions and deletions are required.
  2.When memory reallocation (dynamic size) is needed.
  3.When sequential access is preferred over random access.
