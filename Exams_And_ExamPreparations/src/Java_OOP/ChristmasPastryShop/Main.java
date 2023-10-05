package Java_OOP.ChristmasPastryShop;

import Java_OOP.ChristmasPastryShop.core.ControllerImpl;
import Java_OOP.ChristmasPastryShop.core.EngineImpl;
import Java_OOP.ChristmasPastryShop.core.interfaces.Controller;
import Java_OOP.ChristmasPastryShop.entities.booths.interfaces.Booth;
import Java_OOP.ChristmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Java_OOP.ChristmasPastryShop.entities.delicacies.interfaces.Delicacy;
import Java_OOP.ChristmasPastryShop.io.ConsoleReader;
import Java_OOP.ChristmasPastryShop.io.ConsoleWriter;
import Java_OOP.ChristmasPastryShop.repositories.BoothRepositoryImpl;
import Java_OOP.ChristmasPastryShop.repositories.CocktailRepositoryImpl;
import Java_OOP.ChristmasPastryShop.repositories.DelicacyRepositoryImpl;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.BoothRepository;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.CocktailRepository;
import Java_OOP.ChristmasPastryShop.repositories.interfaces.DelicacyRepository;


public class Main {
    public static void main(String[] args) {

        DelicacyRepository<Delicacy> delicacyRepository = new DelicacyRepositoryImpl();
        CocktailRepository<Cocktail> cocktailRepository = new CocktailRepositoryImpl();
        BoothRepository<Booth> boothRepository = new BoothRepositoryImpl();

        Controller controller = new ControllerImpl(delicacyRepository, cocktailRepository, boothRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();
    }
}
