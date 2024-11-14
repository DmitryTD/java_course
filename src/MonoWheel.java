public class MonoWheel extends TransportWheel{
    private Engine engine;

    public MonoWheel(String name, int wheel, Engine engine) {
        super(name, wheel);
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Моноколесо едет");
    }

    @Override
    public void stop() {
        System.out.println("Моноколесо не едет");
    }

    @Override
    public void displayInfo() {
        System.out.println("Название: " + this.name);
        System.out.println("Количество колес: " + wheels );
        System.out.println("Тип топлива: " + engine.getEngineInfo());
    }
}
