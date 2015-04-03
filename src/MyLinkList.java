

class MyLinkList 
{
    Node head = null;
    
    Node insert(int value)
    {
	// inserts a new node at the top of the list.
	
	Node newnode = new Node(value);
	// if there is already a head node, make
	// our newnode's "next" equal to that one.
	if (head != null)
	{
	    newnode.next = head;
	}
	// now make our newnode the head.
	head = newnode;
	return newnode;
    }
    
    
    int count()
    {
	// traverse the nodes starting from the head and
	// return the number of nodes in the linked list.
	return -1;
    }
    
    Node append(int value)
    {
	// append this node to the end of the linked list.
	Node newnode = new Node(value);
	
	// is head empty?  if so, just put  here
	if (head == null)
	{
	    // this node is our head node
	    this.head = newnode;
	}
	else
	{
	    
	    // find the last node - it's the one with
	    // its 'next' set to null.
	    
	    Node last = this.head;
	    while (last.next != null)
	    {
		last = last.next;
	    }
	    // make the last node point to this one
	    last.next = newnode;
	}
	return newnode;
    }
    
    boolean delete(int value)
    {
	// delete the node that matches this value.
	// There are three cases
	
	// 1. the head node is the one that matches.
	if (this.head.data == value)
	{
	    this.head = this.head.next;
	    return true;
	}
	
	// 2. one of the later nodes matches
	Node current = this.head;
	Node prior = current;
	while (current != null)
	{
	    if (current.data == value)
	    {
		// found it!
		prior.next = current.next;
		return true;
	    }
	    prior = current;
	    current = current.next;
	}
	// 3.  none of the nodes match
	return false;
	    
    }
    
    Node findTail()
    {
	Node current = this.head;
	Node prior = current;
	while (current != null)
	{
	    prior = current;
	    current = current.next;
	}
	return prior;
    }
    
    void display()
    {
	// traverse the nodes starting from the head and
	// print each node's data.
    }
    
}
