public class App {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("20243DS040","Cesar",502.4,"Seguro social");
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("20243ds041","Gabriel",205.7,6);

        System.out.println("EMPLEADO DE TIEMPO COMPLETO");
        System.out.println("Empleado: " + empleado1.getNombre());
        System.out.println("Salario Base: " + empleado1.getSalarioBase());
        System.out.println("Salario: " + empleado1.calcularSalario());

        System.out.println("");
        System.out.println("EMPLEADO POR HORAS");
        System.out.println("Empleado: " + empleado2.getNombre());
        System.out.println("Salario Base: " + empleado2.getSalarioBase());
        System.out.println("Horas: " + empleado2.getHorasTrabajadas());
        System.out.println("Salario: " + empleado2.calcularSalario());
    }
}
