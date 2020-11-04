// The BST structures the data in a tee rather than a flat linear sequence. BSTs always start with a single node which in a Linked List we call the 'head' and in a tree we call the 'root'. A Binary Tree Node can have a left child and/or a right child; each child might have left and/or right children of its own. An entire section of a family might descend from one sibling as opposed to another. A binary search tree adds a requirement that for each node, all nodes to the left must have smaller values. Similarly the right must contain larger or equal values. This constraint holds for every node in the tree. BST nodes without children are called 'leaf' nodes. Depending on its values, no node is required to have both a left and right node. Even in a tree containing many values the root might only have one left or right child.

// Write a size() method that returns the number of nodes (values) contained in the tree.

// Return the smallest value stored in the BST

// Return whether a value is stored in a BST


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

            if (val < runner.value) {
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

    min() {

        if (this.root === null) {
            return "Empty tree";
        }

        let runner = this.root;

        while (runner.left !== null) {
            runner = runner.left;
        }
        return runner.value;

    }

    contains(val) {

        if (this.root === null) {
            return "Empty tree";
        }

        let runner = this.root;
        let found = false;

        while (!found && runner) {
            if (val < runner.value) {
                runner = runner.left;
            }
            else if (val > runner.value) {
                runner = runner.right;
            } else {
                found = true;
            }
        }

        return found;

    }

    size(pointer = this.root) {

        if (pointer === null) {
            return 0;
        } else {
            return this.size(pointer.left) + this.size(pointer.right) + 1;
        }

    }

    // Build a height() method on the BST object that returns the total height of the tree – the longest sequence of nodes from root node to leaf node.

    height(pointer = this.root) {

        if (pointer === null) {

            return 0;

        } else {

            var leftHeight = this.height(pointer.left);
            var rightHeight = this.height(pointer.right);
    
            return Math.max(leftHeight, rightHeight) + 1;

        }
    }

   // Write a remove(value) method that will remove the first instance of the value from the BST. If the value is stored in a "leaf" node we may simply remove the pointer to it, if the value is stored in a node with one "child" we can change the pointer from it to its child, and if the node has two "children" we will have to determine the "in-order-successor".

    remove(pointer = this.root, val) {

        if (pointer === null) {
            return "tree is empty";
        } 
        else if (val < pointer.value) {
            pointer.left = this.remove(pointer.left, val);
            return pointer
        }
        else if (val > pointer.value) {
            pointer.right = this.remove(pointer.right, val);
            return pointer;
        }
        
    }
}


const oak = new BST();
const pine = new BST();

oak.insert(100);
oak.insert(50);
oak.insert(200);
oak.insert(170);
oak.insert(300);
oak.insert(10);
oak.insert(425);
oak.insert(500);

console.log("The height is: ", oak.height());





