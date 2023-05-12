public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        vehicle.checkEngine();

        if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            if (truck.hasTrailer()) {
                truck.checkTrailer();
            }
        }
    }
}