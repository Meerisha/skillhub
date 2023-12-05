public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive 
check
        String formattedStr = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = formattedStr.length() - 1;

        while (left < right) {
            if (formattedStr.charAt(left) != formattedStr.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        String word = "Madam"; // Example string to check for palindrome
        boolean isPalindrome = isPalindrome(word);

        if (isPalindrome) {
            System.out.println("'" + word + "' is a palindrome.");
        } else {
            System.out.println("'" + word + "' is not a palindrome.");
        }
    }
}

