import java.util.LinkedList;
import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to LinkedList
        LinkedList<Character> list = new LinkedList<>();

        for(char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare first and last characters
        while(list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if(first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}