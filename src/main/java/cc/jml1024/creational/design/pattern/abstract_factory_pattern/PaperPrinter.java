package cc.jml1024.creational.design.pattern.abstract_factory_pattern;

public class PaperPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("paper");
    }
}
