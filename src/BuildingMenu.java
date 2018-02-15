/*
 * Herb Everett
 *
 * This is an experiment. It doesn't quite work because launch()
 * can only work once. There appears to be a workaround, but
 * this is not the time to try it. I'd like to explore this later.
 */

import java.lang.*;
import java.util.Scanner;
import javafx.application.Platform;

public class BuildingMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        char quit = 'n';
        int entryChoice;

        while (quit != 'y') {
            Platform.setImplicitExit(false);

            System.out.println("Menu");
            System.out.println("1. Type 1 to enter a new building" + "\n"
                    + "2. Type 2 to show a building" + "\n"
                    + "3. Type 3 to select the building code" + "\n"
                    + "4. Type 4 to for a list of buildings");
            entryChoice = scan.nextInt();

            switch (entryChoice) {
                case 1:
                    BuildingGridPane.main(args);
                    break;
                case 2:
                    BuildingBorderPane.main(args);
                    break;
                case 3:
                    BuildingCodePane.main(args);
                    break;
                case 4:
                    BuildingNames.main(args);
                    break;
                default:
                    System.out.println("That's an incorrect choice");
            }
            System.out.println("Would you like to quit (y/n) ");
            input = scan.next().toLowerCase();
            quit = input.charAt(0);
        }
    }

}
