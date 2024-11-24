public class Main {

    public static class FirstObserver implements Observer {
        @Override
        public void onStateChange(String newState) {
            System.out.println("Первый наблюдатель: " + newState);
        }
    }

    public static class SecondObserver implements Observer {
        @Override
        public void onStateChange(String newState) {
            System.out.println("Второй наблюдатель: " + newState);
        }
    }

    public static void main(String[] args) {
        ObservableStringBuilder builder = new ObservableStringBuilder();

        // Создаем наблюдателей
        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();

        builder.addObserver(firstObserver);
        builder.addObserver(secondObserver);

        builder.append("test1");
        builder.append(", test2");

        builder.removeObserver(firstObserver);
        builder.append(", test3");
    }
}

