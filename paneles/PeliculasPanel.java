package paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import modulos.Pelicula;
import views.DetallePeliculaView;

public class PeliculasPanel extends JPanel {

    public PeliculasPanel(ArrayList<Pelicula> peliculas, ArrayList<Pelicula> miLista) {
        int columnas = 5;
        int filas = 6;

        setLayout(new GridLayout(filas, columnas, 15, 15));
        setOpaque(false); // las tarjetas serán transparentes

        // Añadir hasta 30 películas como tarjetas
        for (int i = 0; i < Math.min(30, peliculas.size()); i++) {
            add(crearTarjetaPelicula(peliculas.get(i), miLista));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Fondo degradado vertical
        Graphics2D g2d = (Graphics2D) g;
        Color colorInicio = Color.BLACK;
        Color colorFin = new Color(100, 0, 0);
        GradientPaint gp = new GradientPaint(0, 0, colorInicio, 0, getHeight(), colorFin);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }

    private JPanel crearTarjetaPelicula(Pelicula pelicula, ArrayList<Pelicula> miLista) {
        JPanel tarjeta = new JPanel(new BorderLayout());
        tarjeta.setPreferredSize(new Dimension(150, 250));
        tarjeta.setOpaque(false); // para que se vea el fondo degradado

        // Imagen de la película
        try {
            ImageIcon icono = new ImageIcon(pelicula.getImagen());
            Image img = icono.getImage().getScaledInstance(180, 270, Image.SCALE_SMOOTH);
            JLabel lblImagen = new JLabel(new ImageIcon(img));
            lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
            tarjeta.add(lblImagen, BorderLayout.CENTER);
        } catch (Exception e) {
            JLabel errorLabel = new JLabel("Imagen no disponible");
            errorLabel.setForeground(Color.WHITE);
            errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
            tarjeta.add(errorLabel, BorderLayout.CENTER);
        }

        // Título (sin año)
        JLabel lblTitulo = new JLabel(
            "<html><center>" + pelicula.getTitulo() + "</center></html>"
        );
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 12));
        tarjeta.add(lblTitulo, BorderLayout.SOUTH);

        // Evento de clic → abrir detalles
        tarjeta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(tarjeta);
                DetallePeliculaView detalleView = new DetallePeliculaView(parentFrame, pelicula, miLista);
                detalleView.setVisible(true);
            }
        });

        return tarjeta;
    }

    // 👉 Método para devolver el panel ya dentro de un JScrollPane
    public static JScrollPane crearConScroll(ArrayList<Pelicula> peliculas, ArrayList<Pelicula> miLista) {
        PeliculasPanel panel = new PeliculasPanel(peliculas, miLista);
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        return scroll;
    }
}
