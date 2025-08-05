package labprograms;

public class StringOperations {
    public static void main(String[] args) {
        String input = "khajahussain";

        // <------ Replace all characters except the last one with '#' ----->
        String replaced = "";
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1) {
                replaced += input.charAt(i);
            } else {
                replaced += "#";
            }
        }

        // <-----Remove duplicate characters---->
        String noDup = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (noDup.indexOf(ch) == -1) {
                noDup += ch;
            }
        }

        //<------------ Convert characters at odd positions to Uppercase---------------------->
        String oddUpper = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i % 2 != 0) {
                ch = Character.toUpperCase(ch);
            }
            oddUpper += ch;
        }

        System.out.println("Replaced: " + replaced);
        System.out.println("Without duplicates: " + noDup);
        System.out.println("Odd positions upper: " + oddUpper);
    }
}
