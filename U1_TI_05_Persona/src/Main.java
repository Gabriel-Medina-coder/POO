import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        persona.setName(nombre);

        System.out.println("Introduzca su altura: ");
        double altura = sc.nextDouble();
        persona.setHeight(altura);

        System.out.println("Introduzca el peso: ");
        double peso = sc.nextDouble();
        persona.setWeight(peso);

        System.out.println("Nombre: " + persona.getName());
        System.out.println("IMC: " + persona.calculateIMC());
        System.out.println("Status: " + persona.clasificateIMC());
    }
}