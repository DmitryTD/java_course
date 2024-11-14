public sealed abstract class Engine permits PetrolEngine, ElectricEngine, NoneEngine {
    protected FuelType fuelType;

    public Engine(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    public abstract String getEngineInfo();
}

final class PetrolEngine extends Engine {
    public PetrolEngine() {
        super(FuelType.PETROL);
    }

    @Override
    public String getEngineInfo() {
        return "бензин";
    }
}

final class ElectricEngine extends Engine {
    public ElectricEngine() {
        super(FuelType.ELECTRIC);
    }

    @Override
    public String getEngineInfo() {
        return "электричество";
    }
}

final class NoneEngine extends Engine {
    public NoneEngine() {
        super(FuelType.NONE);
    }

    @Override
    public String getEngineInfo() {
        return "нет двигателя";
    }
}
