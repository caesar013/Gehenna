import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueuesandStacks {
    Stack<Character> stacks;
    Queue<Character> queues; // Change the declaration to use LinkedList

    QueuesandStacks() {
        stacks = new Stack<Character>();
        queues = new LinkedList<Character>();
    }

    void pushCharacter(char ch) {
        stacks.push(ch);
    }

    void enqueueCharacter(char ch) {
        queues.add(ch);
    }

    char popCharacter() {
        return stacks.pop();
    }

    char dequeueCharacter() {
        return queues.poll();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next().toLowerCase();
        s.close();
        QueuesandStacks stacks = new QueuesandStacks();
        for (int i = 0; i <= (input.length() / 2); i++) {
            stacks.pushCharacter(input.charAt(i));
            stacks.enqueueCharacter(input.charAt(input.length() / 2 + i));
        }
        if (input.length() % 2 == 0) {
            stacks.popCharacter();
        }
        boolean isPolindrome = true;
        for (int i = input.length() / 2; i < input.length(); i++) {
            if (stacks.popCharacter() != stacks.dequeueCharacter()) {
                System.out.println("The word, " + input + ", is not a palindrome.");
                isPolindrome = false;
                break;
            }
        }
        if (isPolindrome) {
            System.out.println("The word, " + input + ", is a palindrome.");
        }
    }
}
