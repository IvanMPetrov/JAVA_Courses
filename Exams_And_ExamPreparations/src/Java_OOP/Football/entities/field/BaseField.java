package Java_OOP.Football.entities.field;


import Java_OOP.Football.entities.field.interfaces.Field;
import Java_OOP.Football.entities.player.interfaces.Player;
import Java_OOP.Football.entities.supplement.interfaces.Supplement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static Java_OOP.Football.common.ConstantMessages.NOT_ENOUGH_CAPACITY;
import static Java_OOP.Football.common.ExceptionMessages.FIELD_NAME_NULL_OR_EMPTY;

public abstract class BaseField implements Field {


    private String name;
    private int capacity;
    private Collection<Supplement> supplements;
    private Collection<Player> players;

    protected BaseField(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        supplements = new LinkedList<>();
        players = new LinkedList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(FIELD_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int sumEnergy() {
        return supplements.stream().mapToInt(Supplement::getEnergy).sum();
    }

    @Override
    public void addPlayer(Player player) {

        if (players.size() == capacity) {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }
        players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        players.remove(player);
    }

    @Override
    public void addSupplement(Supplement supplement) {

        supplements.add(supplement);
    }

    @Override
    public void drag() {
        players.forEach(Player::stimulation);
    }

    @Override
    public String getInfo() {
        String playersInformation = null;
        if (players.isEmpty()) {
            playersInformation = "none";
        } else {
            playersInformation = players.stream().map(Player::getName).collect(Collectors.joining(" "));
        }
        return String.format("%s (%s):%n" +
                "Player: %s%n" +
                "Supplements: %d%n" +
                "Energy: %d", name, getClass().getSimpleName(), playersInformation, supplements.size(), sumEnergy());
    }

    @Override
    public Collection<Player> getPlayers() {
        return players;
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return supplements;
    }

    @Override
    public String getName() {
        return this.name;
    }


}
