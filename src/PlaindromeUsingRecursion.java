import java.util.Scanner;

public class PlaindromeUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets find if the input is Palindrome or not");
        System.out.print("Enter a word or phrase: ");
        String word = input.next();

        word = word.replaceAll(" ","").toLowerCase();

        boolean result = isPalindrome(word,0,word.length()-1);

        if(result){
            System.out.println(word + " is a palindrome!");
        }else{
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int start, int end){
        //base case: if start matches end it means all characters matched
        if (start >= end){
            return true;
        }

        //if charcaters at start and end don't match it's not palindrome
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        //move towards the middle
        return isPalindrome(str, start + 1, end -1);
    }
}
