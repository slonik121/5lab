import java.util.ArrayList;
import java.util.List;

public class ServerMonitor {
    private List<Observer> observers = new ArrayList<>();
    private String serverStatus;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void changeServerStatus(String status) {
        this.serverStatus = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(serverStatus);
        }
    }

    public List<Observer> getObservers() {
        return new ArrayList<>(observers);
    }
}
