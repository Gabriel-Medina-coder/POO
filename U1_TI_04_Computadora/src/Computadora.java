public class Computadora {
    private String brand;
    private String model;
    private boolean status = true;

    public void turnOn(){
        if (status==false){
            status=true;
        }
        System.out.println("Turned On");
    }

    public void turnOff(){
        if (status==true){
            status=false;
        }
        System.out.println("Turned Off");
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
