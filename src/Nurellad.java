import java.util.Random;
import java.util.Scanner;

public class Nurellad {
    public static void main(String[] args) {

        Random random = new Random();
        int amountOfBricks = random.nextInt(24)*2 + 51; // an odd number between 50 and 100
        System.out.println("Amount of bricks = " + amountOfBricks);
        int containerCapacity = random.nextInt(2)*2 + 6; // even number between 5 and 10
        System.out.println("Container capacity = " + containerCapacity);
        int fullContainers = amountOfBricks / containerCapacity;
        int notFullBlocks = amountOfBricks % containerCapacity;
        if (notFullBlocks == 0) {
            System.out.println(notFullBlocks + " blocks in the container that is not full");
            System.out.println("We have " + fullContainers + " full containers");
            System.out.println("We have in total " + fullContainers + " containers");
        } else {
            System.out.println(notFullBlocks + " blocks in the container that is not full");
            System.out.println("We have " + fullContainers + " full containers");
            System.out.println("We have in total " + (fullContainers + 1) + " containers");
        }
    }
}
