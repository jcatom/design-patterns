package cc.jml1024.creational.design.pattern.test;

import cc.jml1024.creational.design.pattern.singleton_pattern.MainWindow;
import org.junit.Test;

public class SingletonPatternTest {

    @Test
    public void singletonPattern_test() {
        MainWindow mainWindow = MainWindow.getInstance();
        mainWindow.showMessage();
    }
}
