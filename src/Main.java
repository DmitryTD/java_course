public class Main {
    public static void main(String[] args) {
        // 1 машина
        Engine carEngine = new PetrolEngine();
        Car car = new Car("Автомобиль", 4, carEngine);
        car.displayInfo();
        car.start();
        car.stop();

        System.out.println("\n====\n");

        // 2 велосипед
        Engine bisycleEngine = new NoneEngine();
        Bicycle bisycle = new Bicycle("Велосипед", 2, bisycleEngine);
        bisycle.displayInfo();
        bisycle.start();
        bisycle.stop();

        System.out.println("\n====\n");

        // 3 самокат
        Engine scooterEngine = new NoneEngine();
        Scooter scooter = new Scooter("Скутер", 2, scooterEngine);
        scooter.displayInfo();
        scooter.start();
        scooter.stop();

        System.out.println("\n====\n");

        // 4 моноколесо
        Engine monoWheelEngine = new ElectricEngine();
        MonoWheel monoWheel = new MonoWheel("Моноколесо", 1, monoWheelEngine);
        monoWheel.displayInfo();
        monoWheel.start();
        monoWheel.stop();
    }
}