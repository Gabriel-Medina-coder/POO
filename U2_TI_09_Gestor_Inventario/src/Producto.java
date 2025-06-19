public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    public void setCodigo(String codigo) {
       if (codigo.isEmpty()) {
           System.out.println("El codigo no puede estar vacio");
       }else  {
           this.codigo = codigo;
       }
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
        }else  {
            this.nombre = nombre;
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }else   {
            System.out.println("Debe existir minimo 1 producto");
        }
    }
}
