public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;

    public EmpleadoPorHoras(String ID, String nombre, double salarioBase, int horasTrabajadas) {
        super(ID,nombre,salarioBase);
        this.horasTrabajadas=horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()*horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
