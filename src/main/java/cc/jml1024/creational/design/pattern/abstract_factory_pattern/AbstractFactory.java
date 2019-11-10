package cc.jml1024.creational.design.pattern.abstract_factory_pattern;

public abstract class AbstractFactory {
    public abstract Printer getPrinter(String printerType);
    public abstract Shape getShape(String shapeType);
}
