public class Computadora {
    private String brand;
    private String model;
    private boolean status = true;

    public void turnOn(){

    }

    public void turnOff(){

    }
//GETTERS
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isStatus() {
        return status;
    }
//SETTER
    public void setModel(String model) {
        this.model = model;
    }
}
