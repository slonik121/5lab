import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо проксі для сервера
        ServerProxy serverProxy = new ServerProxy("192.168.0.1");

        // Створюємо адміністраторів
        Admin admin1 = new Admin("Єгор");
        Admin admin2 = new Admin("Матвій");

        // Список адміністраторів
        List<Admin> admins = new ArrayList<>();
        admins.add(admin1);
        admins.add(admin2);

        // Початковий статус сервера
        notifyAdmins(admins, "Початковий статус: " + serverProxy.getStatus());

        // Змінюємо статус сервера
        serverProxy.setStatus("Сервер перевантажений");
        notifyAdmins(admins, "Сервер змінив статус на: " + serverProxy.getStatus());

        // Видаляємо одного адміністратора
        admins.remove(admin2);
        notifyAdmins(admins, "Матвій більше не стежить за сервером");

        // Додаткова перевірка статусу
        serverProxy.setStatus("Сервер недоступний");
        notifyAdmins(admins, "Сервер змінив статус на: " + serverProxy.getStatus());
    }

    // Повідомляємо адміністраторів
    private static void notifyAdmins(List<Admin> admins, String message) {
        for (Admin admin : admins) {
            admin.update(message);
        }
    }
}
