package Arrays_Exercise;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String firstInput = scanner.nextLine();

        while (!firstInput.equals("Yohoho!")) {
            String[] partsOfInput = firstInput.split(" ");

            switch (partsOfInput[0]) {
                case "Loot":
                    for (int i = 1; i < partsOfInput.length; i++) {
                        boolean flag = true;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (partsOfInput[i].equals(treasureChest[j])) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            String newLoot = partsOfInput[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newLoot.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(partsOfInput[1]);

                    if (position <= treasureChest.length - 1 && position >= 0) {
                        String dropItem = treasureChest[position];
                        for (int i = position; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;

                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int numberOfStealingItems = Integer.parseInt(partsOfInput[1]);

                    if (numberOfStealingItems >= 0 && numberOfStealingItems < treasureChest.length) {
                        for (int i = 0; i < numberOfStealingItems; i++) {
                            System.out.print(treasureChest[treasureChest.length - numberOfStealingItems + i]);
                            if (i != numberOfStealingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[treasureChest.length - numberOfStealingItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;

                    } else if (numberOfStealingItems >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;

            }


            firstInput = scanner.nextLine();
        }

        String treasureCount = String.join("", treasureChest);
        int counter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            counter++;
        }
        double averageTreasure = (1.0 * counter) / treasureChest.length;
        if (counter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}

