package database;

import java.util.ArrayList;
import modulos.Pelicula;

public class MiLista {

    public static ArrayList<Pelicula> lista = new ArrayList<>();

    // Método para agregar a la lista
    public static void agregar(Pelicula p) {
        if (!lista.contains(p)) {
            lista.add(p);
        }
    }

  
    // Método para obtener la lista
    public static ArrayList<Pelicula> obtenerLista() {
        return lista;
    }
}
