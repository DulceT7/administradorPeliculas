package views;

import javax.swing.*;
import java.awt.*;
import modulos.Pelicula;
import java.util.ArrayList;

public class DetallePeliculaView extends JDialog {

    public DetallePeliculaView(JFrame parent, Pelicula pelicula, ArrayList<Pelicula> miLista) {
        super(parent, pelicula.getTitulo(), true);
        setSize(500, 700);
        setLocationRelativeTo(parent);

        JPanel panel = new JPanel(new BorderLayout(10, 10)) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, Color.BLACK, 0, getHeight(), new Color(100, 0, 0));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel);

        try {
            ImageIcon icono = new ImageIcon(pelicula.getImagen());
            Image img = icono.getImage().getScaledInstance(350, 400, Image.SCALE_SMOOTH);
            JLabel lblImagen = new JLabel(new ImageIcon(img));
            lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(lblImagen, BorderLayout.NORTH);
        } catch (Exception e) {
            JLabel errorLabel = new JLabel("Imagen no disponible");
            errorLabel.setForeground(Color.WHITE);
            panel.add(errorLabel, BorderLayout.NORTH);
        }

        JTextArea descripcion = new JTextArea(pelicula.getDescripcion());
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        descripcion.setEditable(false);
        descripcion.setForeground(Color.WHITE);
        descripcion.setOpaque(false);
        JScrollPane scrollDesc = new JScrollPane(descripcion);
        scrollDesc.setOpaque(false);
        scrollDesc.getViewport().setOpaque(false);
        panel.add(scrollDesc, BorderLayout.CENTER);

        JButton btnAñadir = new JButton("Añadir a mi lista");
        btnAñadir.addActionListener(ae -> {
            if (!miLista.contains(pelicula)) {
                miLista.add(pelicula);
                JOptionPane.showMessageDialog(this, pelicula.getTitulo() + " añadido a tu lista");
            } else {
                JOptionPane.showMessageDialog(this, pelicula.getTitulo() + " ya está en tu lista");
            }
        });

        JPanel panelBoton = new JPanel();
        panelBoton.setOpaque(false);
        panelBoton.add(btnAñadir);
        panel.add(panelBoton, BorderLayout.SOUTH);
    }
}
