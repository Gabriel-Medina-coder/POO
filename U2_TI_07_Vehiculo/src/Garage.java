import javax.print.DocFlavor;

public class Garage{
    private int numEspacios;
    private Vehiculo[] espacios;

    public Garage(int numEspacios) {
        espacios=new Vehiculo[numEspacios];
        this.numEspacios=numEspacios;
    }



    public boolean estacionar(Vehiculo vehiculo){
        for (int i = 0; i < numEspacios; i++) {
            if(espacios[i] == null){
                espacios[i]=vehiculo;
                return true;
            }
        }
        return false;
    }
    public boolean retirar(String placa){
        for (int i = 0; i < numEspacios; i++) {
            if (espacios[i].getPlaca().equals(placa)) {
                espacios[i]=null;
                return true;
            }
        }
        return false;
    }
    public int contarVehiculos() {
        int cantVehiculo=0;
        for (int i = 0; i < numEspacios; i++) {
            if(espacios[i]!=null){
                cantVehiculo++;
            }
        }
        return cantVehiculo;
    }
}
