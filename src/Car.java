public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля " + getModelName());
    }

    public void doService() {
        super.doService();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}

