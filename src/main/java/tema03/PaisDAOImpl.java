package tema03;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {

    public static PaisDAOImpl instace;

    private PaisDAOImpl() {

    }

    public static PaisDAOImpl getInstance() {
        if (instace == null) {
            return new PaisDAOImpl();
        }
        return instace;
    }

    private static List paises;

    public static List getPaises() {
        if (paises == null) {
            paises = new ArrayList();
            Pais p1 = new Pais("BOLIVIA");
            Pais p2 = new Pais("PERU");
            Pais p3 = new Pais("COLOMBIA");

            paises.add(p1);
            paises.add(p2);
            paises.add(p3);
        }
        return paises;
    }
}
