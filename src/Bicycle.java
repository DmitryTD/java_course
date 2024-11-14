public class Bicycle extends TransportWheel {
    private Engine engine;

    public Bicycle(String name, int wheel, Engine engine){
        super(name, wheel);
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Велосипед едет");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед не едет");
    }

    @Override
    public void displayInfo() {
        System.out.println("Название: " + this.name);
        System.out.println("Количество колес: " + wheels );
        System.out.println("Тип топлива: " + engine.getEngineInfo());
    }

}
