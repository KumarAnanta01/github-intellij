package LogicalP;

public class C {

    public static void main(String[] args) {
        // Example input String
        String s = "I am from Techwave";

        // Variables to store counts
        int vowelsCount = 0;
        int specialCharsCount = 0;
        int othersCount = 0;

        // Loop through each character in the String
        for (char c : s.toCharArray()) {
            // Check if the character is a vowel
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelsCount++;
            }
            // Check if the character is a special character
            else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                specialCharsCount++;
            }
            // Count all other characters (letters and digits)
            else if (Character.isLetterOrDigit(c)) {
                othersCount++;
            }
        }

        // Print the results
        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Special Characters Count: " + specialCharsCount);
        System.out.println("Other Characters Count: " + othersCount);
    }

}
