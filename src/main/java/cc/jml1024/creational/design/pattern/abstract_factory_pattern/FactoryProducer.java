package cc.jml1024.creational.design.pattern.abstract_factory_pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("PRINTER")) {
            return new PrinterFactory();
        }
        return null;
    }
}
