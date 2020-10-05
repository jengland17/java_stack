public class SinglyLinkedList { 
    
    public Node head; 


    public SinglyLinkedList() {
        this.head = null;
    }

    public void addNode(int value) {

        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Node runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void removeNode() {

        if (head.next == null) {
            this.head = null;
        }

        Node runner = this.head;

        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }

    public void showValues() {

        Node runner = this.head;

        if(head == null) {
            System.out.println("No nodes to show!");
        }
        while(runner.next != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }

        System.out.println(runner.value);

    }

// starting from a SLL class, write a method that will reverse the order of the values stored in a Singly Linked list

    public void reverseOrder() {
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    }


}
