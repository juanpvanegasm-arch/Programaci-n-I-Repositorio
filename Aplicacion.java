public class Aplicacion {

    public static void main(String[]args){

        Fruticolores naranja = new Fruticolores("Naranja", "Cítrico", "Naranja", "Acido");

        System.out.println(naranja);

        naranja.setSabor("Agrio");

        System.out.print(naranja);


    }
}
