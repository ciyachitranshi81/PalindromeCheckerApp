import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while(left < right) {
            if(Character.toLowerCase(input.charAt(left)) !=
                    Character.toLowerCase(input.charAt(right))) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrome)
            System.out.println("Result : It is a Palindrome");
        else
            System.out.println("Result : Not a Palindrome");

        sc.close();
    }
}
