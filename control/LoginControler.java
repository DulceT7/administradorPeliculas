package control;

public class LoginControler {

    // Datos del usuario
    String[][] credenciales = {
        {"carlosx", "1a2b3c"},
        {"demo", "demo"}, {"dataguite@scl.edu.gt", "dato123"},
        {"dulce", "123"}, {"", ""}
    };

    public boolean validacionDatos(String EntradaUsuario, String EntradaContrasenna) {
        for (int i = 0; i < credenciales.length; i++) {
            if (credenciales[i][0].equals(EntradaUsuario) &&
                credenciales[i][1].equals(EntradaContrasenna)) {
                return true;
            }
        }
        return false;
    }
}
