package cp213;

/**
 * @author Solomon Olufelo - 210729170 - oluf9170@mylaurier.ca
 * @version 2025-09-28
 */
public class Cipher {
    // Constants
    public static final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int ALPHA_LENGTH = ALPHA.length();

    /**
     * Encipher a string using a shift cipher. Each letter is replaced by a letter
     * {@code n} letters to the right of the original. Thus for example, all shift
     * values evenly divisible by 26 (the length of the English alphabet) replace a
     * letter with itself. Non-letters are left unchanged.
     *
     * @param string the string to encipher
     * @param n      the number of letters to shift
     * @return the enciphered string in all upper-case
     */
    public static String shift(final String string, final int n) {

	if (string == null) {
		return null;
	}
	StringBuilder result = new StringBuilder();
	
	String upperString = string.toUpperCase();
	
	for (int i = 0; i < upperString.length(); i++) {
		char currentChar = upperString.charAt(i);
		
		if (currentChar >= 'A' && currentChar <= 'Z') {
			int originalPosition = currentChar - 'A';
			int newPosition = (originalPosition + n % ALPHA_LENGTH + ALPHA_LENGTH) % ALPHA_LENGTH;
			char newChar = (char) ('A' + newPosition);
            result.append(newChar);
		} else {
            // Non-letters are left unchanged
            result.append(currentChar);
        }
    }
    
    return result.toString();
}

    /**
     * Encipher a string using the letter positions in ciphertext. Each letter is
     * replaced by the letter in the same ordinal position in the ciphertext.
     * Non-letters are left unchanged. Ex:
     *
     * <pre>
    Alphabet:   ABCDEFGHIJKLMNOPQRSTUVWXYZ
    Ciphertext: AVIBROWNZCEFGHJKLMPQSTUXYD
     * </pre>
     *
     * A is replaced by A, B by V, C by I, D by B, E by R, and so on. Non-letters
     * are ignored.
     *
     * @param string     string to encipher
     * @param ciphertext ciphertext alphabet
     * @return the enciphered string in all upper-case
     */
    public static String substitute(final String string, final String ciphertext) {

    	// Handle null inputs
        if (string == null || ciphertext == null) {
            return null;
        }
        
        // Validate ciphertext length
        if (ciphertext.length() != ALPHA_LENGTH) {
            throw new IllegalArgumentException("Ciphertext must be exactly " + ALPHA_LENGTH + " characters long");
        }
        
        // StringBuilder for efficient string building
        StringBuilder result = new StringBuilder();
        
        // Convert input to uppercase for consistent processing
        String upperString = string.toUpperCase();
        String upperCiphertext = ciphertext.toUpperCase();
        
        // Process each character in the string
        for (int i = 0; i < upperString.length(); i++) {
            char currentChar = upperString.charAt(i);
            
            // Check if character is a letter (A-Z)
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Find the position of the letter in the standard alphabet (0-25)
                int alphabetPosition = currentChar - 'A';
                
                // Replace with the character at the same position in the ciphertext
                char substitutedChar = upperCiphertext.charAt(alphabetPosition);
                result.append(substitutedChar);
            } else {
                // Non-letters are left unchanged
                result.append(currentChar);
            }
        }
        
        return result.toString();
    }
}

