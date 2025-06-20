public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Bobby",1);
        Gato gato1 = new Gato("Steve",3);

        Cliente cliente1  = new Cliente("Gabriel");
        Cliente cliente2  = new Cliente("Maria");

        Tienda tienda = new Tienda();

        tienda.reabastecer(perro1);
        System.out.println(tienda.inventario.getFirst().getNombre());
        System.out.println("Vendido: " + tienda.VenderAnimal(cliente1,perro1));


    }
}
