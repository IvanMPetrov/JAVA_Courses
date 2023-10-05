package Abstractions_First_Lection.Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Suits:");
        for (CardSuits suits : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suits.ordinal(),suits.name());
        }

        System.out.println("Card Ranks:");

        for (CardRank ranks : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",ranks.ordinal(),ranks.name());
        }

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());


        System.out.printf("Card name: %s of %s; Card power: %d",cardRank,cardSuits,
                cardRank.getPower() + cardSuits.getMultiplier());
    }
}