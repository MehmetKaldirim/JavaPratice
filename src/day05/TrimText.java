package day05;

public class TrimText {
    public static void main(String[] args) {
        String textWithWhitespaces = "\n\t text with whitespaces!";

        String str = " Inside Main";
        String subs = str.substring(0, 6);
        long n = subs.trim().length();

        System.out.println("textWithWhitespaces = " + textWithWhitespaces);

        String trimmedText = textWithWhitespaces.trim();
        System.out.println("trimmedText = " + trimmedText);
        System.out.println("subs = " + subs + " and lengt of subs is " + n);
    }
}

