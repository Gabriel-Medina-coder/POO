public class Main {
    public static void main(String[] args) {
        Inventario inventario=new Inventario(3);
        Producto producto1=new Producto();
        Producto producto2=new Producto();
        Producto producto3=new Producto();
        Producto producto4=new Producto();

        //Productos
        producto1.setCodigo("1ga");
        producto1.setNombre("Galletas");
        producto1.setCantidad(9);

        producto2.setCodigo("2so");
        producto2.setNombre("Soda");
        producto2.setCantidad(5);

        producto3.setCodigo("3li");
        producto3.setNombre("Limpiador");
        producto3.setCantidad(10);

        producto4.setCodigo("4du");
        producto4.setNombre("Dulces");
        producto4.setCantidad(25);

        //Agregar Productos
        System.out.println("==========AGREGAR===========");
        System.out.println("Agregado: " + inventario.agregarProducto(producto1));
        System.out.println("Agregado: " + inventario.agregarProducto(producto2));
        System.out.println("Agregado: " + inventario.agregarProducto(producto3));
        System.out.println("Agregado: " + inventario.agregarProducto(producto4));

        System.out.println("Total: " + inventario.totalIntems());

        System.out.println();
        //Buscar Productos
        System.out.println("===========BUSCAR=============");
        System.out.println("Producto: " + inventario.buscar("2so"));
        System.out.println("Producto: " + inventario.buscar("5fa"));

        System.out.println();
        //Eliminar Productos
        System.out.println("===========ELIMINAR=============");
        System.out.println("Eliminado: " + inventario.eliminarProducto("2so"));
        System.out.println("Total: " + inventario.totalIntems());

        System.out.println();
        //Agregar el ultimo producto
        System.out.println("===========AGREGAR=============");
        System.out.println("Agregado: " + inventario.agregarProducto(producto4));

        System.out.println("Total: " + inventario.totalIntems());

    }
}
