package tema04.generics2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        /*List<String> lista =new ArrayList<>();
        lista.add("Mitocode");
        lista.add(String.valueOf(23));*/

        //String text = (String) lista.get(0);
        /*String text = lista.get(0);
        //Integer number= (Integer) lista.get(1);
        //String textNumber = String.valueOf(lista.get(1));
        String textNumber = lista.get(1);

        System.out.println(text);
        //System.out.println(number);
        System.out.println(textNumber);*/

        /*String[] array = new String[5];
        array[0]="Mitocode";
        array[1]*/

        Clase<String, Integer, String, Double> c = new Clase<>("Mitocode", 25, "Mito", 25.0);
        c.mostrarTipo();

        List<Clase<String,Integer,String,String>> lista = new ArrayList<>();
        lista.add(new Clase ("Mitocode", 25, "Carlos", "test"));
        for (Clase<String,Integer,String,String> c1: lista){
            c1.mostrarTipo();
        }

    }
}
