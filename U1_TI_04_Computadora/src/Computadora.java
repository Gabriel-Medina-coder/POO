import javax.swing.plaf.IconUIResource;

public class Computadora {
    private String brand = "Dell";
    private String model;
    private boolean status = false;

    public void turnOn(){
        if (status==false){
            status=true;
            System.out.println("Turning On...");
        }
        else {
            if (status==true){
                System.out.println("Turned on");
            }
        }
    }

    public void turnOff(){
        if (status==true){
            status=false;
        }
        System.out.println("Turning Off...");
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
