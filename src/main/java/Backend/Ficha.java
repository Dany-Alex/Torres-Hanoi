package Backend;

public class Ficha {

    private String Nombre;
    private int ID;
    private Ficha arriba = null;

    public Ficha(String Nombre, int ID) {
        this.Nombre = Nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Ficha getArriba() {
        return arriba;
    }

    public void setArriba(Ficha arriba) {
        this.arriba = arriba;
    }

}
