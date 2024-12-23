import static org.junit.Assert.*;
import org.junit.Test;

public class TestServer {

    @Test
    public void testGetStatus() {
        Server server = new RealServer("192.168.0.1");

        assertEquals("Сервер працює", server.getStatus());
    }
}
