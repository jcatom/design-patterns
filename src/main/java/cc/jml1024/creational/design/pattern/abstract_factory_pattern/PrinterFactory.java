package cc.jml1024.creational.design.pattern.abstract_factory_pattern;

public class PrinterFactory extends AbstractFactory {
    @Override
    public Printer getPrinter(String printerType) {
        if (printerType == null) {
            return null;
        }

        if (printerType.equalsIgnoreCase("paper")) {
            return new PaperPrinter();
        } else if (printerType.equalsIgnoreCase("web")) {
            return new WebPrinter();
        } else if (printerType.equalsIgnoreCase("screen")) {
            return new ScreenPrinter();
        }

        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
