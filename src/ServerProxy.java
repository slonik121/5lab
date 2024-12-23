public class ServerProxy implements Server {
    private RealServer realServer;
    private String cachedStatus;
    private long lastUpdateTime;
    private static final long CACHE_EXPIRATION_TIME = 5000; // 5 секунд

    public ServerProxy(String ipAddress) {
        this.realServer = new RealServer(ipAddress);
    }

    @Override
    public String getStatus() {
        if (cachedStatus == null || System.currentTimeMillis() - lastUpdateTime > CACHE_EXPIRATION_TIME) {
            cachedStatus = realServer.getStatus();
            lastUpdateTime = System.currentTimeMillis();
        } else {
            System.out.println("Використання кешованого статусу.");
        }
        return cachedStatus;
    }

    public void setStatus(String newStatus) {
        realServer.setStatus(newStatus);
        cachedStatus = null; // Скидаємо кеш, щоб отримати актуальні дані
    }
}
