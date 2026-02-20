import java.util.Scanner;
public class UseCase3PalindromeApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("PALINDROME CHECKER -UC3");
        System.out.println("=================================================");
        System.out.println("Enter a string :");
        String input = scanner.nextLine();
        String reversed ="";
        for(int i = input.length()-1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }
        System.out.println("Original String: "+ input);
        System.out.println("Reversed String: " + reversed);
        if(input.equalsIgnoreCase(reversed)){
            System.out.println("Result: It is a Palindrome");
        }
        else{
            System.out.println("Result : Not a Palindrome");
        }
        scanner.close();
    }

}
