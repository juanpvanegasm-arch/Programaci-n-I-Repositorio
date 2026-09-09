public class Fruticolores {

    private String nombre;

    private String tipo;

    private String color;

    private String sabor;

    public Fruticolores (String nombre, String tipo, String color, String sabor) {

        this.nombre = nombre;

        this.tipo = tipo;

        this.color = color;

        this.sabor = sabor;

    } public String toString (){

        return "nombre: " + nombre + "\n tipo: " + tipo + "\n color: " + color + " \n Sabor: " + sabor;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getSabor(){
        return sabor;

    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }

}
