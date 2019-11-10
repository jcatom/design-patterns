package cc.jml1024.creational.design.pattern.singleton_pattern;

public class MainWindow {
    private static MainWindow instance = new MainWindow();

    private MainWindow(){}

    public static MainWindow getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
