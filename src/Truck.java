public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика " + getModelName());
    }

    public void doService() {
        super.doService();
        checkEngine();
        checkTrailer();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
