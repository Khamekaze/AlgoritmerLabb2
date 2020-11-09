package com.khamurai.aodlabb2;

public class BinaryTree {

    Node root;

    public void printInOrder(Node tree) {
        if (tree == null) {
            return;
        }
        printInOrder(tree.left);
        System.out.println(tree.key);
        printInOrder(tree.right);
    }

    public void printInPreOrder(Node tree) {
        if (tree == null) {
            return;
        }
        System.out.println(tree.key);
        printInPreOrder(tree.left);
        printInPreOrder(tree.right);
    }

    public void printInPostOrder(Node tree) {
        if (tree == null) {
            return;
        }

        printInPostOrder(tree.left);
        printInPostOrder(tree.right);
        System.out.println(tree.key);
    }

    public void printInReverseOrder(Node tree) {
        if (tree == null) {
            return;
        }

        printInReverseOrder(tree.right);
        System.out.println(tree.key);
        printInReverseOrder(tree.left);
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public void remove(int key) {
        root = removeRecur(root, key);
    }

    public Node removeRecur(Node tree, int key) {
        if (tree == null) {
            return null;
        }

        if (key < tree.key) {
            tree.setLeft(removeRecur(tree.getLeft(), key));
        } else if (key > tree.key) {
            tree.setRight(removeRecur(tree.getRight(), key));
        } else {
            //0 eller 1
            if (tree.getLeft() == null) {
                return tree.getRight();
            } else if (tree.getRight() == null) {
                return tree.getLeft();
            }
            tree.setData(tree.getRight().min());
            tree.setRight(removeRecur(tree.getRight(), tree.key));
        }

        return tree;

    }

    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            root.insert(key);
        }
    }

    public Node get(Node node, int value) {
        if (value == node.key) {
            return node;
        }

        if (value < node.key) {
            return get(node.getLeft(), value);
        } else if (value > node.key) {
            return get(node.getRight(), value);
        }
        return null;
    }


    class Node {
        Node left;
        Node right;
        int key;

        public Node(int key) {
            this.key = key;
        }

        public void insert(int key) {
            if (this.key == key) {
                return;
            }

            if (key < this.key) {
                if (left == null) {
                    left = new Node(key);
                } else {
                    left.insert(key);
                }
            } else {
                if (right == null) {
                    right = new Node(key);
                } else {
                    right.insert(key);
                }
            }
        }

        public void setData(int key) {
            this.key = key;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public Node get(int key) {
            if (key == this.key) {
                return this;
            }
            if (key < this.key) {
                if (left != null) {
                    return left.get(key);
                }
            } else {
                if (right != null) {
                    return right.get(key);
                }
            }
            return null;
        }

        public int min() {
            if (left == null) {
                return key;
            } else {
                return left.min();
            }
        }
    }
}
