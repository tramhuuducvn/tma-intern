package MiniExercises.models;

/**
 * Define a class that holds information about a mobile phone device:
 * model,
 * manufacturer,
 * price,
 * owner,
 * battery characteristics (model, hours idle andhours talk)
 * display characteristics (size and number of colors).
 * Define 3 separate classes (class GSM holding instances of the classes Battery
 * and Display).
 */

public class GSM {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private Battery batteryAccessory;
    private Display displayAccessory;

    public GSM(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = 0;
        this.owner = null;
        this.batteryAccessory = null;
        this.displayAccessory = null;
    }

    public GSM(String model, String manufacturer, double price, String owner,
            Battery batteryAccessory, Display displayAccessory) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.batteryAccessory = batteryAccessory;
        this.displayAccessory = displayAccessory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Battery getBatteryAccessory() {
        return batteryAccessory;
    }

    public void setBatteryAccessory(Battery batteryAccessory) {
        this.batteryAccessory = batteryAccessory;
    }

    public Display getDisplayAccessory() {
        return displayAccessory;
    }

    public void setDisplayAccessory(Display displayAccessory) {
        this.displayAccessory = displayAccessory;
    }

    @Override
    public String toString() {
        return "GSM [model=" + model + ", manufacturer=" + manufacturer + ", price=" + price + ", owner=" + owner
                + ", batteryAccessory=" + batteryAccessory + ", displayAccessory=" + displayAccessory + "]";
    }
}
