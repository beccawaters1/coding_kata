
public class DiamondKata {
    public static void printDiamond(char c) {
        // 'C' - 'A' = 2 tells you how many steps the input character is above A
        int n = c - 'A';
        // set i to 0 and loop until i is less than or equal to n, incrementing i each time
        for (int i = 0; i <= n; i++) {
            printLine(i, n);
        }
        // start from n - 1 and loop until i is more than or equal to 0, decrementing i each time
        for (int i = n - 1; i>= 0; i--) {
            printLine(i, n);
        }
    }

    private static void printLine(int i, int n) {
        // 'A' + i starts with the letter A and moves forward by i letters with char converting to a character
        char current = (char) ('A' + i);
        // calculates the number of leading spaces needed for the current line so if n is 2 and i is 1, leadingSpaces will be 1
        int leadingSpaces = n - i;
        // prints the leading spaces for the current line
        System.out.print(" ".repeat(leadingSpaces));
        // prints the current character
        System.out.print(current);

        // if i is greater than 0
        if (i > 0) {
            // calculates the number of inner spaces needed for the current line so if i is 1, innerSpaces will be 1
            int innerSpaces = 2 * i - 1;
            // prints the inner spaces for the current line
            System.out.print(" ".repeat(innerSpaces));
            // prints the current character again for the second half of the diamond
            System.out.print(current);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        printDiamond('C');
    }

}