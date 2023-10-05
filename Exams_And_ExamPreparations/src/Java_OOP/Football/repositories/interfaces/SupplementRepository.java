package Java_OOP.Football.repositories.interfaces;


import Java_OOP.Football.entities.supplement.interfaces.Supplement;

public interface SupplementRepository {
    void add(Supplement supplement);

    boolean remove(Supplement supplement);

    Supplement findByType(String type);
}
