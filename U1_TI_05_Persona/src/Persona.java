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
            imc = (height * height) / weight;
        return imc;
    }
    public String clasificateIMC(){
        if (calculateIMC() < 18.5){
            System.out.println("El peso es bajo");
        }else if ((calculateIMC() >= 18.5 && calculateIMC() < 25)){
            System.out.println("El peso es normal");
        }else if ((calculateIMC() >= 25 && calculateIMC() < 30)){
            System.out.println("El peso indica sobrepeso");
        }else if ((calculateIMC() >= 30)){
            System.out.println("El peso indica Obesidad");
        }
    }

}
