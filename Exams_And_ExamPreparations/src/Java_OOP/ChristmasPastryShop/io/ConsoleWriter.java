package Java_OOP.ChristmasPastryShop.io;

import Java_OOP.ChristmasPastryShop.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    public void writeLine(String text) {
        System.out.println(text);
    }
}
