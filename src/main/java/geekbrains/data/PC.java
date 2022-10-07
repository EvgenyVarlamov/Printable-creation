package geekbrains.data;

public class PC extends Computer {
    private int powerSupply;

    public PC(String id, String model, Memory memory, String ssd, int powerSupply) {
        super(id, model, memory, ssd);
        this.powerSupply = powerSupply;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "PC{" + getId() + ", " +
                getModel() + ", " +
                getMemory() + ", " +
                getSsd() + ", " +
                "powerSupply=" + powerSupply +
                '}';
    }
}
