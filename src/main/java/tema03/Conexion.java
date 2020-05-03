package tema03;

public class Conexion {

    private static Conexion instance = null;

    private Conexion(){

    }
    public static Conexion getInstance(){
        if (instance == null){
            instance = new Conexion();
        }
        return instance;
    }
}
