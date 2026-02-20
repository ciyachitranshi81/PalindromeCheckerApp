import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        System.out.println("======================================");
        System.out.println("     DEQUE PALINDROME CHECKER         ");
        System.out.println("======================================");

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        for(int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        while(deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear) {
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