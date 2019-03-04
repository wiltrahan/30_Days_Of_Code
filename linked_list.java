// Task
// Complete the insert function in your editor so that it creates a new Node (pass data as the Node constructor argument) and inserts it at the tail of the linked list referenced by the head  parameter. Once the new node is added, return the reference to the head node.

// Note: If the head argument passed to the insert function is null, then the initial list is empty.

public static Node insert(Node head, int data) {
  //Complete this method
  if(head == null) {
    head = new Node(data);
  } else {
    Node nextNode = new Node(data);
    Node temp = head;

    while(temp.next != null) {
      temp = temp.next;
    }
      temp.next = nextNode;
    }
  return head;
}
