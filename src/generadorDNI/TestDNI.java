package generadorDNI;

public class TestDNI {
    public static void main(String[] args) {
        recogidaDatos u1= new recogidaDatos();
        u1.setNombre();
        u1.setApellidos();
        u1.setAñoNacimiento();
        u1.setPadres();
        u1.setAñoEmision();
        u1.setAñoCaducidad();
        u1.setClave();
        u1.setClave();
        u1.setLetra();
        u1.setNacionalidad();
        u1.impresionDNI();
    }
}
