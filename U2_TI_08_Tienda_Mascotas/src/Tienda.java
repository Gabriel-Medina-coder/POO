import java.util.ArrayList;
import java.util.List;

public class Tienda {
    List<Animal> inventario= new ArrayList<Animal>();

    public boolean VenderAnimal(Cliente c, Animal a){
        if (c.mascotas.contains(a)){
            return false;
        } else  {
            inventario.add(inventario);
        }
    }
}
