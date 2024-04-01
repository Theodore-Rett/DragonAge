import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dragon d = new Dragon();
        boolean keepGoing = true;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("You currently have " + d.getCount() + " dragons.");
            System.out.println("[k]eep going, [q]uit");

            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("k")) {

                d.addNew((int)(Math.random()*20)+3);
                d.remove((int)(Math.random()*10)+5);

            } else if(input.equalsIgnoreCase("q")) {
                keepGoing = false;
            } else {
                System.out.println("Invalid input.");
            }


        } while(d.getCount() > 0 && keepGoing);

        if(d.getCount() <= 0) {
            System.out.println("You have no more dragons :(");
        }

    }
}