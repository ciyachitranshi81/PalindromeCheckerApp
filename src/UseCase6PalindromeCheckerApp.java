import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        System.out.println("======================================");
        System.out.println("   FIFO vs LIFO PALINDROME CHECKER    ");
        System.out.println("======================================");

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        while(!stack.isEmpty() && !queue.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if(fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Result : It is a Palindrome");
        else
            System.out.println("Result : Not a Palindrome");

        sc.close();
    }
}
