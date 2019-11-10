package cc.jml1024.creational.design.pattern.test;

import cc.jml1024.creational.design.pattern.factory_pattern.Shape;
import cc.jml1024.creational.design.pattern.factory_pattern.ShapeFactory;
import org.junit.Test;

public class FactoryPatternTest {
    @Test
    public void getShape_test() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        shape.draw();
        Shape shape1 = factory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();
    }
}
