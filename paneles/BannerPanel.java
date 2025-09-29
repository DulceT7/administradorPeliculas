package paneles;

import java.awt.*;
import javax.swing.*;

public class BannerPanel {
    private JPanel panelBanner;

    public BannerPanel() {
        // Panel con degradado negro → rojo
        panelBanner = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color colorInicio = Color.BLACK;
                Color colorFin = new Color(100, 0, 0); // rojo tipo Netflix
                GradientPaint gp = new GradientPaint(0, 0, colorInicio, 0, getHeight(), colorFin);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panelBanner.setPreferredSize(new Dimension(500, 800));
        panelBanner.setLayout(new GridBagLayout());

        // Panel intermedio para textos
        JPanel panelTextos = new JPanel();
        panelTextos.setOpaque(false);
        panelTextos.setLayout(new BoxLayout(panelTextos, BoxLayout.Y_AXIS));

        JLabel textoCentral = new JLabel("Disfruta donde quieras", SwingConstants.CENTER);
        textoCentral.setForeground(Color.WHITE);
        textoCentral.setFont(new Font("Arial", Font.BOLD, 25));
        textoCentral.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelTextos.add(textoCentral);

        panelTextos.add(Box.createRigidArea(new Dimension(0, 10)));

        JLabel textoDebajo = new JLabel("Haz streaming en tu teléfono, tablet, laptop y TV.", SwingConstants.CENTER);
        textoDebajo.setForeground(Color.WHITE);
        textoDebajo.setFont(new Font("Arial", Font.PLAIN, 20));
        textoDebajo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelTextos.add(textoDebajo);

        panelBanner.add(panelTextos);
    }

    public JPanel getBanner() {
        return panelBanner;
    }
}
