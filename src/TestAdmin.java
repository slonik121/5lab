import static org.junit.Assert.*;
import org.junit.Test;

public class TestAdmin {

    @Test
    public void testUpdate() {
        Admin admin = new Admin("Єгор");
        String status = "Сервер працює";

        admin.update(status);

        assertEquals("Сервер працює", admin.getLastStatus());
    }
}
