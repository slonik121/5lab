import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestServerMonitor {

    @Test
    public void testAddObserver() {
        ServerMonitor monitor = new ServerMonitor();
        Admin admin = new Admin("Єгор");
        monitor.addObserver(admin);
        List<Observer> observers = monitor.getObservers();
        assertTrue(observers.contains(admin));
    }

    @Test
    public void testNotifyObservers() {
        ServerMonitor monitor = new ServerMonitor();
        Admin admin = new Admin("Єгор");
        monitor.addObserver(admin);
        monitor.changeServerStatus("Сервер перевантажений");
        // Перевіряємо, чи отримав адмін оновлення
    }
}
