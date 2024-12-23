public class Admin implements Observer {
    private String name;
    private String lastStatus;  // Змінна для зберігання останнього статусу

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        this.lastStatus = status; // Оновлюємо останній статус
        System.out.println("Адмін " + name + " отримав оновлення: " + status);
    }

    // Метод для отримання останнього статусу
    public String getLastStatus() {
        return lastStatus;
    }
}
