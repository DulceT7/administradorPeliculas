package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import modulos.Pelicula;
import paneles.PeliculasPanel;

public class PeliculasView {

    private JFrame ventana;
    private ArrayList<Pelicula> miLista = new ArrayList<>(); // Lista de favoritos

    public PeliculasView(ArrayList<Pelicula> peliculas) {

        // Ventana principal
        ventana = new JFrame("Películas y Series");
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); // Centra la ventana
        ventana.setLayout(new BorderLayout());

        // Header
        JPanel headerJPanel = new JPanel(new BorderLayout());
        headerJPanel.setPreferredSize(new Dimension(1000, 60));
        headerJPanel.setBackground(Color.BLACK);

        // Logo
        JLabel logo = new JLabel("Para chichi");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Arial", Font.BOLD, 20));
        logo.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        headerJPanel.add(logo, BorderLayout.WEST);

        // Lupa
        ImageIcon lupaIcon = new ImageIcon("assets/iconos/lupa.png");
        Image imgLupa = lupaIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JButton btnLupa = new JButton(new ImageIcon(imgLupa));
        btnLupa.setPreferredSize(new Dimension(50, 50));
        btnLupa.setBorderPainted(false);
        btnLupa.setContentAreaFilled(false);
        btnLupa.setFocusPainted(false);
        btnLupa.setOpaque(false);
        headerJPanel.add(btnLupa, BorderLayout.EAST);

        ventana.add(headerJPanel, BorderLayout.NORTH);

        // Panel de películas con scroll (ya integrado desde PeliculasPanel)
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
