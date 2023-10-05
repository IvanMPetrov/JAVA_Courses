package Abstractions_First_Lection.Cards;

public enum CardSuits {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int multiplier;

    CardSuits(int power) {
        this.multiplier = power;
    }

    public int getMultiplier() {
        return multiplier;
    }
}