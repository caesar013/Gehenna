package HackerRank.Java.DataStructures;

import java.util.LinkedList;

public class Generics {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        // this compareTo() method will return
        // -1 if a is less than b
        // 0 if a is equal to b
        // or 1 if a is greater than b
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        printArray(intArray);

        System.out.println(findMax(3, 4));
        System.out.println(findMax(7, 4));
        System.out.println(findMax(7, 7));
        System.out.println(findMax('a', 'u'));
        System.out.println(findMax("Hello", "World"));

        Queuey<String> stringQueue = new Queuey<String>();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("There");

        System.out.print(stringQueue.dequeue() + " ");
        System.out.println(stringQueue.dequeue() + ".");
    }
}

class Queuey<F> {
    LinkedList<F> queue;

    public Queuey() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(F n) {
        queue.addLast(n);
    }

    public F dequeue() {
        return queue.remove(0);
    }

    public F peek() {
        return queue.get(0);
    }
}
