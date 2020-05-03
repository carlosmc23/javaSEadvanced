package tema02;

import java.util.ArrayList;
import java.util.List;

public class App {

    List canasta = new ArrayList();

    private void verificar(Object objecto){
        if (objecto instanceof Fruta){
            canasta.add(objecto);
            System.out.println("Fruta agregada: "+((Fruta) objecto).getNombre());
        }else {
            System.out.println("Elemento no permitido: " + ((Galleta) objecto).getName());
        }
    }

    public static void main(String[] args) {
        /*String cadena= new String("Mitocode");
        if (cadena instanceof String){
            System.out.println("Es un string");
        }*/
        /*Alumno alumno = new Alumno();
        if (alumno instanceof Persona){
            System.out.println("Es un persona");
        }*/

        System.out.println("Canasta abierta por favor ingresar solo frutas");

        Manzana m1 = new Manzana("manzana roja");
        Manzana m2 = new Manzana("manzana verde");
        Naranja n1 = new Naranja("naranja verde sin pepa");
        Galleta g1= new Galleta("galleta de chocolate");
        App app =new App();
        app.verificar(m1);
        app.verificar(m2);
        app.verificar(n1);
        app.verificar(g1);
    }
}
