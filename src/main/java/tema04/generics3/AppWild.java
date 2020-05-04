package tema04.generics3;

import java.util.ArrayList;
import java.util.List;

public class AppWild {
    //recibe objetos de cualquier sub tipo de la clase persona
    private void listarUpperbounded(List<? extends Persona> list){
        for (Persona a: list){
            System.out.println(a.getName());
        }
    }
    //recibe ojetos de cualquier super tipo de alumno
    private void listarLowerBounded(List<? super Alumno> list){
        for (Object al: list){
            System.out.println(((Persona) al).getName());
        }
    }
    // no se indica el tipo que se va a recibir
    private void listarUnbounded(List<?> list){
        for (Object a: list){
            System.out.println(((Persona) a).getName());
        }
    }

    public static void main(String[] args) {
        AppWild app = new AppWild();

        Profesor p1 =new Profesor("Carlos");
        Alumno a2 =new Alumno("Vanessa");
        Alumno a3 =new Alumno("Guillermo");
        Alumno a4 =new Alumno("Gabriel");

        List<Persona> list = new ArrayList<>();
        list.add(p1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        app.listarUpperbounded(list);
        app.listarLowerBounded(list);
        app.listarUnbounded(list);
    }
}
