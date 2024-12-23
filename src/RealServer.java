public class RealServer implements Server {
    private String ipAddress;
    private String currentStatus;

    public RealServer(String ipAddress) {
        this.ipAddress = ipAddress;
        this.currentStatus = "Сервер працює"; // Початковий статус
    }

    @Override
    public String getStatus() {
        System.out.println("Отримання статусу з реального сервера: " + ipAddress);
        return currentStatus;
    }

    public void setStatus(String newStatus) {
        this.currentStatus = newStatus;
        System.out.println("Статус сервера змінено на: " + newStatus);
    }
}
