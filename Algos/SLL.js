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
            runner.next = prev;
            prev = runner;
            runner = nextUp;
        }
        this.head = prev;
    }

    remove(val) {
        if(!this.head) {
            return false;
        }
        if(this.head.value === val) {
            this.head = this.head.next;
            return true;
        }
        let runner = this.head;
        while(runner.next) {
            if(runner.next.value === val) {
                runner.next = runner.next.next;
                return true;
            }
            runner = runner.next;
        }
        return false;
    }

    removeAt(index) {
        if(!this.head) {
            return null;
        }
        if(index === 0) {
            let output = this.head.value;
            this.head = this.head.next;
            return output;
        }
        let runner=this.head;
        for(let i=0; i<index-1; i++) {
            runner=runner.next;
            if(!runner) {
                return null;
            }
        }
        if(!runner && !runner.next) {
            return null;
        }
        let response = runner.next.value;
        runner.next = runner.next.next;
        return response;
    }

    hasLoop() {

        if (this.head == null) {
            return "Nothing";
        }

        else {

            var slow = this.head;
            var fast = this.head.next;

            while (fast != null) {

                if (fast == slow) {
                    return true
                }

                fast = fast.next.next;
                slow = slow.next;

            }
        }

        return false;

    }
}

var list1 = new SLL();
list1.add(3);
list1.add(2);
list1.add(1);
var lastNode = list1.head.next.next;
lastNode.next = list1.head;

console.log(list1.hasLoop());
