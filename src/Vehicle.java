
public abstract class Vehicle implements Maintenance {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public abstract void updateTyre();

    @Override
    public void doService() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
