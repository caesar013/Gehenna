package HackerRank.Java.DataStructures.LinkedList;

public class LinkedListUS {

    // Properties
    Node head;
    int count;

    // Constructors
    public LinkedListUS() {
        head = null;
        count = 0;
    }

    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0 || (count - 1) < index) {
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // get size
    public int size() {
        return this.count;
    }

    // is empty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove() {
        if (head.getNext() == null) {
            head = null;
        }
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        
    }
}
