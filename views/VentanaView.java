package views;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import paneles.BannerPanel;
import paneles.LoginPanel;

public class VentanaView {

    private JFrame ventana;

    
    public VentanaView() {

        // Crear ventana principal
        ventana = new JFrame("Inicio de Sesión");
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());
        ventana.setLocationRelativeTo(null);

        // BannerPanel y agregarlo a la ventana
        BannerPanel bannerPanel = new BannerPanel();
        ventana.add(bannerPanel.getBanner(), BorderLayout.WEST);

        // LoginPanel y agregarlo a la ventana
        LoginPanel loginPanel = new LoginPanel();
        ventana.add(loginPanel.getJPanel());

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
