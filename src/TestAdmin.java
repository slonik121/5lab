import static org.junit.Assert.*;
import org.junit.Test;

public class AdminTest {

    @Test
    public void testUpdate() {
        Admin admin = new Admin("Єгор");
        String status = "Сервер працює";
        admin.update(status);
        // Тестуємо, чи працює метод update
    }
}
