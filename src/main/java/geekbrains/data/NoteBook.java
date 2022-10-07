package geekbrains.data;

public class NoteBook extends Computer {

    private int batteryCapacity;

    public NoteBook() {
    }

    public NoteBook(String id, String model, Memory memory, String ssd, int batteryCapacity) {
        super(id, model, memory, ssd);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Notebook id=" + getId() + ", " +
                getModel() + ", " +
                getMemory() + ", " +
                getSsd() + ", " +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }
}