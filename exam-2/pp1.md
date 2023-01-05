# Past Paper Question

The names of vegetables must be always held in alphabetical order in a list in the memory.
The application program should allow insertion and deletion of the names of vegetables in the list.

___
**(a)** Compare the use of a dynamic linked list for holding these names of vegetables with a static one-dimentional array *[3]*

> The program is required to take to add/remove items from the list. A dynamic linked list is a good choice for this as it can be resized as needed unlike a static array, which needs to be recreated every time a new item is added.

___
Given the following vegetables: potato, asparagus, lettuce, radish:
___

**(b)** Sketch a single linked list holding these vegetables *[2]*

> The list would look like this:
> asparagus -> lettuce -> potato -> radish

___
**(ci)** List the steps required to insert cabbage into the linked list *[4]*

> 1. get the next node
> 2. if it's alphabetical position is less than the new node, repeat step 1
> 3. when the loop ends, replace the pointer of the previous node with the new node
> 4. set the pointer of the new node to the next node

___
**(cii)** Explain why deleting the first node in this list is different to deleting other nodes *[2]*

> When the first node is removed, it must be noted that for the linked list to still be valid, the head pointer must be updated to point to the next node. *[1]*

___
**(d)** State the dynamic data structure suitable for maintaining this list of vegetables which will allow faster searching for a given vegetable name *[2]*

> The binary tree is the better option since its asymptotic time complexity is O(log n) for insertion and deletion.

___
The vegetable names are input in the following order: potato, asparagus, lettuce, radish.
___

**(e)** Sketch the data structure suggested in the part (d) containing the vegetable names sorted in alphabetical order. *[3]*

```text
           lettuce
           /     \
    asparagus    potato
                 /    \
              null    radish
```
