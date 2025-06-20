public class Inventario {
    Producto[] stock;

    public Inventario(int tamanio){
        stock = new Producto[tamanio];
    }

    public boolean agregarProducto(Producto p){
        for(int i=0;i<stock.length;i++){
            if(stock[i]==null){
                stock[i]=p;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo){
        for(int i=0;i<stock.length;i++){
            if (codigo==stock[i].getCodigo()){
                stock[i]=null;
                return true;
            }
        }
        return false;
    }

    Producto buscar(String codigo){
        for(int i=0;i<stock.length;i++){
            if (codigo==stock[i].getCodigo()){
                return stock[i];
            }
        }
        return null;
    }

    public int totalIntems(){ //CAMBIAR LA CONTAR
        int total=0;
        for(int i=0;i<stock.length;i++){
            if(stock[i]!=null){
                total=total+stock[i].getCantidad();
            }
        }
        return total;
    }
}
