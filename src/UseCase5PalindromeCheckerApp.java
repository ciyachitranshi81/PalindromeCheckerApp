/**
 * ==============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 4: Stack Based Palindrome Validation
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using the Stack data structure.
 *
 * Flow:
 * - Push each character of the string into the stack
 * - Pop characters one by one (reverse order)
 * - Compare popped characters with original string
 * - Display the result
 *
 * @author Developer
 * @version 4.0
 */

import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("======================================");
        System.out.println("     PALINDROME CHECKER USING STACK   ");
        System.out.println("======================================");

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Push characters into stack
        for(int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Display
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare
        if(input.equalsIgnoreCase(reversed))
            System.out.println("Result : It is a Palindrome");
        else
            System.out.println("Result : Not a Palindrome");

        sc.close();
    }
}