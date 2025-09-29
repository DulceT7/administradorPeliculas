package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import modulos.Pelicula;

public class MiListaView extends JDialog {

    public MiListaView(JFrame parent, ArrayList<Pelicula> miLista) {
        super(parent, "Mi Lista", false); // ventana hija de PeliculasView
        setSize(400, 600);
        setLocationRelativeTo(parent);

        // Panel principal con fondo degradado
        JPanel panelPrincipal = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color colorInicio = Color.BLACK;
                Color colorFin = new Color(100, 0, 0);
                GradientPaint gp = new GradientPaint(0, 0, colorInicio, 0, getHeight(), colorFin);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Mostrar películas de la lista
        for (Pelicula p : miLista) {
            JPanel panelPeli = new JPanel(new BorderLayout(5, 5));
            panelPeli.setOpaque(false);
            panelPeli.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            // Imagen
            try {
                ImageIcon icono = new ImageIcon(p.getImagen());
                Image img = icono.getImage().getScaledInstance(60, 90, Image.SCALE_SMOOTH);
                JLabel lblImagen = new JLabel(new ImageIcon(img));
                panelPeli.add(lblImagen, BorderLayout.WEST);
            } catch (Exception e) {
                JLabel lblError = new JLabel("Imagen no disponible");
                lblError.setForeground(Color.WHITE);
                panelPeli.add(lblError, BorderLayout.WEST);
            }

            //  título
            JLabel lblTitulo = new JLabel("<html><b>" + p.getTitulo() + "</b></html>");
            lblTitulo.setForeground(Color.WHITE);
            panelPeli.add(lblTitulo, BorderLayout.CENTER);

            panelPrincipal.add(panelPeli);
        }

        JScrollPane scroll = new JScrollPane(panelPrincipal);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        add(scroll);
    }
}
