package cp213;

import java.util.Scanner;

/**
 * Class to demonstrate the use of Scanner with a keyboard and File objects.
 *
 * @author your name here
 * @version 2022-01-08
 */
public class ScannerTest {

	/**
	 * Count lines in the scanned file.
	 *
	 * @param source Scanner to process
	 * @return number of lines in scanned file
	 */
	public static int countLines(final Scanner source) {
		int count = 0;

		while (source.hasNextLine()) {
			source.nextLine();
			count++;
		}

		return count;
	}

	/**
	 * Count tokens in the scanned object.
	 *
	 * @param source Scanner to process
	 * @return number of tokens in scanned object
	 */
	public static int countTokens(final Scanner source) {
		int tokens = 0;

		while (source.hasNext()) {
			source.next();
			tokens++;
		}

		return tokens;
	}

	/**
     * Ask for and total integers from the keyboard.
     *
     * @param source Scanner to process
     * @return total of positive integers entered from keyboard
     */
    public static int readNumbers(final Scanner keyboard) {
    	int total = 0;

    	for (;;) {
    		// If next token is an int, consume it with nextInt()
    		if (keyboard.hasNextInt()) {
    			int value = keyboard.nextInt();
    			if (value > 0) {
    				total += value;
    			}
    			continue;
    		}

    		// If next token is exactly "q", consume and stop
    		if (keyboard.hasNext("q")) {
    			keyboard.next(); // consume 'q'
    			break;
    		}

    		// Otherwise, consume the rest of the current line and report it as invalid
    		if (!keyboard.hasNextLine()) {
    			break;
    		}
    		String invalid = keyboard.nextLine().trim();
    		if (!invalid.isEmpty()) {
    			System.out.printf("'%s' is not an integer or 'q'.%n", invalid);
    			}
    		}
    	return total;
    	}
}
