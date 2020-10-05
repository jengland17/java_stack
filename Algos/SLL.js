class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}


class SLL {
    constructor() {
        this.head = null;
    }

    add(val) {
        var newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            var runner = this.head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    display(){
        var runner = this.head;
        while (runner != null){
            console.log(runner.val);
            runner = runner.next;
        }
    }

    reverse() {
        var runner = this.head;
        var nextUp = null;
        var prev = null;
        while (runner != null){
            nextUp = runner.next;
            // save runner.next
            runner.next = prev;
            // set current runner.next to prev
            prev = runner;
            // set prev to the current runner
            runner = nextUp;
            // set runner to runner.next
        }
        // set this.head to the last node
        this.head = prev;
    }
}