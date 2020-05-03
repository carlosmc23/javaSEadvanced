package tema03;

import static tema03.PaisDAOImpl.getPaises;

public class App {
    public static void main(String[] args) {

        /*PaisDAOImpl dao = new PaisDAOImpl();
        for (Object obj:dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }

        System.out.println("*******************");

        for (Object obj:dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        PaisDAOImpl dao1 = new PaisDAOImpl();
        for (Object obj:dao1.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }*/
        //PaisDAOImpl dao = PaisDAOImpl.getInstance();
        for (Object obj : PaisDAOImpl.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
        for (Object obj : PaisDAOImpl.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
        PaisDAOImpl dao = PaisDAOImpl.getInstance();
        for (Object obj : dao.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }

    }
}
