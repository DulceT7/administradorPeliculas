package views;

import javax.swing.*;
import java.awt.*;
public class InicioView {

    private JFrame miVentana;
    private JPanel panelUsuarios;

    public InicioView() {
        // Ventana
        miVentana = new JFrame("Administrador de Películas");
        miVentana.setSize(1000, 700);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocationRelativeTo(null);

        // Panel de fondo con degradado negro → rojo oscuro
        JPanel fondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color colorInicio = Color.BLACK;
                Color colorFin = new Color(100, 0, 0);
                g2d.setPaint(new GradientPaint(0, 0, colorInicio, 0, getHeight(), colorFin));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        fondo.setLayout(new BorderLayout());
        miVentana.setContentPane(fondo);

        // Título arriba
        JLabel titulo = new JLabel("¿Quién eres? Elige tu perfil", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        titulo.setForeground(Color.WHITE);
        titulo.setBorder(BorderFactory.createEmptyBorder(200, 0, 20, 0));
        fondo.add(titulo, BorderLayout.NORTH);

        // Panel de usuarios 
        panelUsuarios = new JPanel();
        panelUsuarios.setOpaque(false);
        panelUsuarios.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
        fondo.add(panelUsuarios, BorderLayout.CENTER);

        // llamada de botones -> BotonesModulos ----
        modulos.BotonesModulos.agregarBotones(this);

        // Mostrar ventana
        miVentana.setVisible(true);
    }

    // GETTER para que BotonesModulos pueda añadir botones
    public JPanel getPanelUsuarios() {
        return panelUsuarios;
    }

    public JFrame getVentana() {
        return miVentana;
    }
}
