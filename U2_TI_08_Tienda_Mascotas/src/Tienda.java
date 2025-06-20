import java.util.ArrayList;
import java.util.List;

public class Tienda {
    List<Animal> inventario= new ArrayList<Animal>();

    public boolean venderAnimal(Cliente c, Animal a){
        if (inventario.contains(a)){
            c.mascotas.add(a);
            inventario.remove(a);
            return true;
        } else if (c.mascotas.contains(a)) {
            System.out.println("Mascota en tu colección");
        }else
            System.out.println("Mascota no disponible");
        return false;
    }

    public boolean reabastecer(Animal a){
        if (inventario.contains(a)){
            System.out.println("Error: Mascota duplicada");
            return false;
        }else inventario.add(a);
        System.out.println("Agregado correctamente");
        return true;
    }
}
