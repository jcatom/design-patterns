package cc.jml1024.creational.design.pattern.test;

import cc.jml1024.creational.design.pattern.abstract_factory_pattern.AbstractFactory;
import cc.jml1024.creational.design.pattern.abstract_factory_pattern.FactoryProducer;
import cc.jml1024.creational.design.pattern.abstract_factory_pattern.Printer;
import cc.jml1024.creational.design.pattern.abstract_factory_pattern.Shape;
import org.junit.Test;

public class AbstractFactoryPatternTest {

    @Test
    public void getShapeFactory_test() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape.draw();
        shape1.draw();
        shape2.draw();
    }

    @Test
    public void getPrinterFactory_test() {
        AbstractFactory printerFactory = FactoryProducer.getFactory("PRINTER");
        Printer printer = printerFactory.getPrinter("web");
        Printer printer1 = printerFactory.getPrinter("paper");
        Printer printer2 = printerFactory.getPrinter("screen");
        printer.print();
        printer1.print();
        printer2.print();
    }
}
