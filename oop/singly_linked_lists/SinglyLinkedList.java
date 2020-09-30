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

}
