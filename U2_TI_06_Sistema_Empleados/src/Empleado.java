public abstract class Empleado {
    private String ID;
    private String name;
    private double salarioBase;

    public Empleado(String ID, String name, double salarioBase) {
        this.ID = ID;
        this.name = name;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();
}
