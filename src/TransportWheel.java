public abstract class TransportWheel implements Transport {
    protected String name;
    protected int wheels;

    public TransportWheel(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Количество колес: " + wheels );
    }
}
