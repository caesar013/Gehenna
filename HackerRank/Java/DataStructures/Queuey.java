package HackerRank.Java.DataStructures;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey {
    LinkedList queue;

    public Queuey() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(String n) {
        queue.addLast(n);
    }

    public String dequeue() {
        return (String) queue.remove(0);
    }

    public String peek() {
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
        // Queuey q = new Queuey();
        // q.enqueue(5);
        // q.enqueue(6);
        // q.enqueue(7);
        // q.enqueue(8);
        // System.out.println("First out: " + q.dequeue());
        // System.out.println("Peek at the second item: " + q.dequeue());
        // System.out.println("Second out: " + q.dequeue());
        // System.out.println("Thirdout: " + q.dequeue());
        // System.out.println();

        // Queuey stringQueue = new Queuey();
        // stringQueue.enqueue("hi");
        // stringQueue.enqueue("There");

        // System.out.print(stringQueue.dequeue() + " ");
        // System.out.println(stringQueue.dequeue() + ".");

        Stack<String> stacky = new Stack<String>();
        stacky.push("There");
        stacky.push("hi");

        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + "!");

        System.out.println();
        System.out.println("Size: " + stacky.size());
        System.out.println("Peek: " + stacky.peek());
    }
}
