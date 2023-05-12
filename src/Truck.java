public class Truck extends Vehicle {
    private boolean hasTrailer;

    public Truck(String modelName, int wheelsCount, boolean hasTrailer) {
        super(modelName, wheelsCount);
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }
}
