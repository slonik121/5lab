import static org.junit.Assert.*;
import org.junit.Test;

public class ServerProxyTest {

    @Test
    public void testGetStatusWithoutCache() {
        ServerProxy serverProxy = new ServerProxy("192.168.0.1");

        String status = serverProxy.getStatus();
        assertEquals("Сервер працює", status);
    }

    @Test
    public void testGetStatusWithCache() {
        ServerProxy serverProxy = new ServerProxy("192.168.0.1");

        String status1 = serverProxy.getStatus();
        assertEquals("Сервер працює", status1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String status2 = serverProxy.getStatus();
        assertEquals("Сервер працює", status2);
    }

    @Test
    public void testCacheExpiration() {
        ServerProxy serverProxy = new ServerProxy("192.168.0.1");

        String status1 = serverProxy.getStatus();
        assertEquals("Сервер працює", status1);

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String status2 = serverProxy.getStatus();
        assertEquals("Сервер працює", status2);
    }
}
