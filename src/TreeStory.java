import java.util.Scanner;


public class TreeStory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.print("\nEnter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.printf("\n%s is very %s.", name, adjective);


    } // main method

} // TreeStory class
