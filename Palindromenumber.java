import java.util.Scanner;
public class Palindromenumber{
  // Start your code here
  public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
      String n = x.nextLine();
      String cleanedInput = n.replaceAll("[^a-zA-Z]", "").toLowerCase();
      boolean isPalindrome = true;
      int left = 0, right = cleanedInput.length() - 1;
      while(left < right){
        if(cleanedInput.charAt(left) != cleanedInput.charAt(right)){
          isPalindrome = false;
          break;
      }
      left++;
      right--;
      }
  if(isPalindrome){
    System.out.println("The string \"" + n + "\" is a palindrome.");
  } else{
    System.out.println("The string \"" + n + "\" is not a palindrome.");
    x.close();
  }
  }
}