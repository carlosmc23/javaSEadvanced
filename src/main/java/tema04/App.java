package tema04;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){

        Clase<String> c=new Clase<String>("mito code");
        Clase<Integer> c1=new Clase<Integer>(24);
        c.mostrarTipo();
        c1.mostrarTipo();
    }
}
