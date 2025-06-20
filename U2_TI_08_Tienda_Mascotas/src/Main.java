public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Bobby",1);
        Gato gato1 = new Gato("Steve",3);

        Cliente cliente1  = new Cliente("Gabriel");
        Cliente cliente2  = new Cliente("Maria");

        Tienda tienda = new Tienda();

        System.out.println("================Agregar al inventario=====================");
        tienda.reabastecer(perro1);
        tienda.reabastecer(gato1);

        System.out.println("================Inventario Disponible=====================");
        System.out.println(tienda.inventario);

        System.out.println("================Venta=====================");
        System.out.println("Vendido: " + tienda.venderAnimal(cliente1,perro1));

        System.out.println("Vendido: " + tienda.venderAnimal(cliente2,perro1));

        System.out.println("Vendido: " + tienda.venderAnimal(cliente1,perro1));
        
        System.out.println("================Inventario Disponible=====================");
        System.out.println(tienda.inventario);
    }
}
