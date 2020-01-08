package com.fire.tree;

public class BST<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left,right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    private BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
        if (root == null) {
            root = new Node(e);
            size++;
        }else {
            add(root,e);
        }
    }

    private void add(Node node, E e) {
//        递归停止条件
        if (e.equals(node))
            return;
        else if (e.compareTo(node.e) < 0 && node.left == null){
            node.left = new Node(e);
            size++;
            return;
        }else if (e.compareTo(node.e) > 0 && node.right == null){
            node.right = new Node(e);
            size++;
            return;
        }

        if (e.compareTo(node.e) < 0)
            add(node.left,e);
        else
            add(node.right,e);
    }

//    查询
    public boolean contains(E e){
        return contains(root,e);
    }

    private boolean contains(Node node,E e){
        if (node == null)
            return false;
        if (e.compareTo(node.e) == 0)
            return true;
        else if (e.compareTo(node.e) < 0)
            return contains(node.left,e);
        else
            return contains(node.right,e);
    }
}
