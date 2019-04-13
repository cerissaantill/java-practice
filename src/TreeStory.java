import java.util.Scanner;


public class TreeStory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.print("\nEnter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("\nEnter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("\nEnter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("\nEnter a verb ending in -ing: ");
        String verb = scanner.nextLine();

        System.out.print("\nYour TreeStory: \n--------------------------\n");
        System.out.printf("\n%s is a %s %s. They are always %s %s.", name, adjective, noun, adverb, verb);


    } // main method

} // TreeStory class
