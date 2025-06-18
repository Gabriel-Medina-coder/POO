public class EmpleadoTiempoCompleto extends Empleado {
    private String beneficios;

    public EmpleadoTiempoCompleto(String ID, String nombre, double salarioBase, String beneficios) {
        super(ID, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    public double calcularSalario(){
        double salarioBase = super.getSalarioBase();
        salarioBase = salarioBase * 8;
        return salarioBase;
    }
}
