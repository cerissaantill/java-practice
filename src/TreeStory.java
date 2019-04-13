import java.util.Scanner;
import java.lang.String;

public class TreeStory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("\nHow old are you? ");
        String ageAsString = scanner.nextLine();


        // age restriction conditional using parseInt
        int age = Integer.parseInt(ageAsString);

        if (age < 13) {
            // insert exit code
            System.out.print("Sorry, you must be at lease 13 to use this program.\n");

            // global system object
            System.exit(0);
        }



        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.print("\nEnter an adjective: ");
        String adjective = scanner.nextLine();
        String noun;  // declaring noun outside the do-while to give it global scope

        do {
            System.out.print("\nEnter a noun: ");
            noun = scanner.nextLine();

            // Sensor code block using Logical Or
            if (noun.equalsIgnoreCase("dork") ||
                    noun.equalsIgnoreCase("jerk") ||
                    noun.equalsIgnoreCase("nerd")) {
                System.out.println("That language is not allowed. Try again. \n\n");
            }
        } while(noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));



        System.out.print("\nEnter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("\nEnter a verb ending in -ing: ");
        String verb = scanner.nextLine();

        System.out.print("\nYour TreeStory: \n--------------------------\n");
        System.out.printf("\n%s is a %s %s. They are always %s %s.", name, adjective, noun, adverb, verb);


    } // main method

} // TreeStory class
