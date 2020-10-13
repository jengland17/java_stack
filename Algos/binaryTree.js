// The BST structures the data in a tee rather than a flat linear sequence. BSTs always start with a single node which in a Linked List we call the 'head' and in a tree we call the 'root'. A Binary Tree Node can have a left child and/or a right child; each child might have left and/or right children of its own. An entire section of a family might descend from one sibling as opposed to another. A binary search tree adds a requirement that for each node, all nodes to the left must have smaller values. Similarly the right must contain larger or equal values. This constraint holds for every node in the tree. BST nodes without children are called 'leaf' nodes. Depending on its values, no node is required to have both a left and right node. Even in a tree containing many values the root might only have one left or right child.


class BTNode {
    constructor(val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}


class BST {
    constructor() {
        this.root = null;
    }

    insert(val) {

        const newNode = new BTNode(val);

        if (this.root === null) {
            this.root = newNode;
            return;
        }

        let runner = this.root;

        while (runner !== null) {

            if( val < runner.value) {
                // go left
                if (runner.left === null) {
                    runner.left = newNode;
                    return;
                } else {
                    runner = runner.left;
                }
            } else {
                // go right
                if (runner.right === null) {
                    runner.right = newNode;
                    return;
                } else {
                    runner = runner.right;
                }
            }
        }
    }

    print(pointer = this.root) {
        if (pointer !== null) {
            console.log(pointer.value);
            this.print(pointer.left);
            this.print(pointer.right);
        }
    }


}


const oak = new BST();

oak.insert(100);
oak.insert(50);
oak.insert(200);
oak.insert(170);
oak.insert(300);

console.log(oak);

oak.print();
