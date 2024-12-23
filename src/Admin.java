public class Admin {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public void update(String status) {
        System.out.println("Адмін " + name + " отримав оновлення: " + status);
    }
}