public class ServiceStation {
    public void check(Maintenance maintenance) {
        System.out.println("Обслуживаем " + ((Vehicle) maintenance).getModelName());
        maintenance.doService();
    }
}