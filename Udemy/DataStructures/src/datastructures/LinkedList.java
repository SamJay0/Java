package datastructures;

/**
 *
 * @author LukasVyhnalek
 */
public class LinkedList {

    private class Node {

        private String value;
        private Node next;

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;

    LinkedList() {
        this.head = null;
    }

    public void insert(String value) {
        this.head = new Node(value, this.head);
    }

    public boolean search(String value) {
        Node n = this.head;
        while (n != null) {
            if (n.getValue().equals(value)) {
                return true;
            }
            n = n.getNext();
        }
        return false;
    }

    public boolean delete(String value) {
        //list is empty
        if (this.head == null) {
            return false;
        //the value to delete is head
        } else if (this.head.getValue().equals(value)) {
            //deleting head
            this.head = this.head.getNext();
            return true;
        }
       //any other node in the list
        Node previous = this.head;
        Node current = this.head.getNext();
        while (current != null) {
            if (current.getValue().equals(value)) {
                previous.setNext(current.getNext());
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    public void print() {
        Node n = this.head;
        while (n != null) {
            System.out.print(n.getValue() + " > ");
            n = n.getNext();
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insert("Sam");
        list.insert("Juma");
        list.insert("Jay");
        list.insert("JAys");
        list.print();
        list.delete("sam");
        list.print();
        System.out.println(list.search("Samu"));
  }
}

