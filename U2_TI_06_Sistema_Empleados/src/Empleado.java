public abstract class Empleado {
    private String ID;
    private String name;
    private double salarioBase;

    public Empleado(String ID, String nombre, double salarioBase) {
        this.ID = ID;
        this.name = nombre;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();

    //Getters and Setters

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = name;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
