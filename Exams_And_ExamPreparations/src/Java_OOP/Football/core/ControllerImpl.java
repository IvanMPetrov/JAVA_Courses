package Java_OOP.Football.core;


import Java_OOP.Football.core.interfaces.Controller;
import Java_OOP.Football.entities.field.ArtificialTurf;
import Java_OOP.Football.entities.field.NaturalGrass;
import Java_OOP.Football.entities.field.interfaces.Field;
import Java_OOP.Football.entities.player.Men;
import Java_OOP.Football.entities.player.Women;
import Java_OOP.Football.entities.player.interfaces.Player;
import Java_OOP.Football.entities.supplement.Liquid;
import Java_OOP.Football.entities.supplement.Powdered;
import Java_OOP.Football.entities.supplement.interfaces.Supplement;
import Java_OOP.Football.repositories.SupplementRepositoryImpl;
import Java_OOP.Football.repositories.interfaces.SupplementRepository;

import java.util.LinkedHashMap;
import java.util.Map;

import static Java_OOP.Football.common.ConstantMessages.*;
import static Java_OOP.Football.common.ExceptionMessages.*;


public class ControllerImpl implements Controller {

    private SupplementRepository supplement;
    private Map<String, Field> fields;

    public ControllerImpl() {
        this.supplement = new SupplementRepositoryImpl();
        this.fields = new LinkedHashMap<>();
    }

    @Override
    public String addField(String fieldType, String fieldName) {
        Field field;

        if (fieldType.equals("ArtificialTurf")) {
            field = new ArtificialTurf(fieldName);
        } else if (fieldType.equals("NaturalGrass")) {
            field = new NaturalGrass(fieldName);
        } else {
            throw new NullPointerException(INVALID_FIELD_TYPE);
        }
        fields.put(fieldName, field);
        return String.format(SUCCESSFULLY_ADDED_FIELD_TYPE, fieldType);
    }

    @Override
    public String deliverySupplement(String type) {
        Supplement supl;

        if (type.equals("Powdered")) {
            supl = new Powdered();
        } else if (type.equals("Liquid")) {
            supl = new Liquid();
        } else {
            throw new IllegalArgumentException(INVALID_SUPPLEMENT_TYPE);
        }
        supplement.add(supl);
        return String.format(SUCCESSFULLY_ADDED_SUPPLEMENT_TYPE, type);
    }

    @Override
    public String supplementForField(String fieldName, String supplementType) {
        Supplement supl = supplement.findByType(supplementType);

        if (supl == null) {
            throw new IllegalArgumentException(String.format(NO_SUPPLEMENT_FOUND, supplementType));
        }
        Field field = fields.get(fieldName);
        field.addSupplement(supl);
        return String.format(SUCCESSFULLY_ADDED_SUPPLEMENT_IN_FIELD,supplementType,fieldName);
    }

    @Override
    public String addPlayer(String fieldName, String playerType, String playerName, String nationality, int strength) {
        Player playerToAdd;
        Field field = fields.get(fieldName);
        String output;

        if (playerType.equals("Men")) {
            playerToAdd = new Men(playerName, nationality, strength);

        } else if (playerType.equals("Women")) {
            playerToAdd = new Women(playerName, nationality, strength);
        } else {
            throw new IllegalArgumentException(INVALID_PLAYER_TYPE);
        }

        if (!canPlay(playerType, field)) {
            output = FIELD_NOT_SUITABLE;
        } else {
            fields.get(fieldName).addPlayer(playerToAdd);
            output = String.format(SUCCESSFULLY_ADDED_PLAYER_IN_FIELD, playerType, fieldName);
        }

        return output;
    }
    private boolean canPlay(String playerType, Field field) {
        boolean canPlay = playerType.equals("Men") && field.getClass().getSimpleName().equals("NaturalGrass");

        if (!canPlay) {
            canPlay = playerType.equals("Women") && field.getClass().getSimpleName().equals("ArtificialTurf");
        }
        return canPlay;
    }

    @Override
    public String dragPlayer(String fieldName) {
        Field field = fields.get(fieldName);
        field.drag();
        return String.format(PLAYER_DRAG, field.getPlayers().size());
    }

    @Override
    public String calculateStrength(String fieldName) {
        int totalStrengthSum = fields.get(fieldName).getPlayers().stream().mapToInt(Player::getStrength).sum();

        return String.format(STRENGTH_FIELD,fieldName,totalStrengthSum);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();



        fields.values().forEach(field -> sb.append(field.getInfo()).append(System.lineSeparator()));
        return sb.toString();
    }
}
