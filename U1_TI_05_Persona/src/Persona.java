public class Persona {
    private String name;
    private double height;
    private double weight;

    //GETTERS
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    //SETTERS
    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Calcular
    public double calculateIMC(){
        double imc = 0;
            imc = weight / (height * height);
        return imc;
    }
    public String clasificateIMC(){
        String message = "";
        if (calculateIMC() < 18.5){
            message += "Bajo Peso";
        }else if ((calculateIMC() >= 18.5 && calculateIMC() < 25)){
            message += "Peso Normal";
        }else if ((calculateIMC() >= 25 && calculateIMC() < 30)){
            message += "Sobre Peso";
        }else if ((calculateIMC() >= 30)){
            message += "Obesidad";
        }
    return message;
    }

}
