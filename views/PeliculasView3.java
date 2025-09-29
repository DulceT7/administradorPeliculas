package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import modulos.Pelicula;
import paneles.PeliculasPanel;

public class PeliculasView3 {

    private JFrame ventana;
    private ArrayList<Pelicula> miLista = new ArrayList<>(); // Lista de favoritos

    public PeliculasView3(ArrayList<Pelicula> peliculas) {

        // Ventana principal
        ventana = new JFrame("Películas");
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        // HEADER
        JPanel headerJPanel = new JPanel(new BorderLayout());
        headerJPanel.setPreferredSize(new Dimension(1000, 60));
        headerJPanel.setBackground(Color.BLACK);

        // Logo
        JLabel logo = new JLabel("Para huevoo");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Arial", Font.BOLD, 15));
        logo.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        headerJPanel.add(logo, BorderLayout.WEST);

        // Agregar el header al JFrame
        ventana.add(headerJPanel, BorderLayout.NORTH);

        // Panel de películas con scroll (usando PeliculasPanel)
        JScrollPane scroll = PeliculasPanel.crearConScroll(peliculas, miLista);
        ventana.add(scroll, BorderLayout.CENTER);

        // Footer 
        JPanel footer = new JPanel();
        footer.setPreferredSize(new Dimension(1000, 50));
        footer.setBackground(Color.BLACK);

         // Botón que abre mi lista
        JButton btnMiLista = new JButton("Mi Lista");
        btnMiLista.addActionListener(ae -> {
            MiListaView miListaView = new MiListaView(ventana, miLista);
            miListaView.setVisible(true);
        });
        footer.add(btnMiLista);
        
        ventana.add(footer, BorderLayout.SOUTH);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
