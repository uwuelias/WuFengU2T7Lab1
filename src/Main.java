import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String firstHalf;
        String secondHalf;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello user!");
        System.out.print("Please enter a string");
        String str1 = scan.nextLine();
        System.out.println();
        System.out.println("The length of the string is " + str1.length());
        if (str1.length()%2 == 1) {
             firstHalf = str1.substring(0, str1.length()/2);
             secondHalf = str1.substring(str1.length()/2+1);
        }
        else {
            firstHalf = str1.substring(0, str1.length()/2+1);
            secondHalf = str1.substring(str1.length()/2-1);
        }
        System.out.println("The first half of the word is " + firstHalf);
        System.out.println("The second half of the word is " + secondHalf);
        System.out.print("Please enter another string: ");
        String str2 = scan.nextLine();
        System.out.println();
        if (str1.length() == str2.length()) {
            System.out.println("The two strings are the same length");
        }
        if (str1.length() > str2.length()) {
            System.out.println("The first string is longer than the second string.");
        }
        if (str1.length() < str2.length()) {
            System.out.println("The second string is longer than the first string.");
        }
        if (str1.equals(str2)) {
            System.out.println("The two strings have the same sequence of character.");
        }
        else {
            System.out.println("the two strings does not have the same sequence of character.");
        }
        if (str1.compareTo(str2) > 0) {
            System.out.println("The first string comes first alphabetically.");
        }
        if (str1.compareTo(str2) < 0) {
            System.out.println("The second string comes first alphabetically.");
        }
        if (str1.contains(str2)) {
            System.out.println(str1.indexOf(str2));
        }
        if 
    }
}
