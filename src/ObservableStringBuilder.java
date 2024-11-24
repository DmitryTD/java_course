import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {
    private StringBuilder stringBuilder; // Внутренний объект StringBuilder
    private List<Observer> observers;    // Список наблюдателей

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.observers = new ArrayList<>();
    }

    // Добавить наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Удалить наблюдателя
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Уведомить всех наблюдателей
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.onStateChange(stringBuilder.toString());
        }
    }

    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyObservers();
        return this;
    }


    public String toString() {
        return stringBuilder.toString();
    }
}
