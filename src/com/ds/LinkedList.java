package com.ds;

public class LinkedList {
    private Node head;

    public LinkedList(){

    }
    public LinkedList(Node head) {
        this.head = head;
    }
    public void add(Node newNode){
        newNode.setNext(head);
        head = newNode;
    }
    public void delete(){
        head = head.getNext();
    }
    public void display(){
        Node n = head;
        while (n != null){
            System.out.println(n.getValue());
            n = n.getNext();
        }
    }
}
