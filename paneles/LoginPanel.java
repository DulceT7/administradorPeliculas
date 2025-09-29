package paneles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import control.LoginControler;
import views.InicioView;

public class LoginPanel {
    private JPanel panelLogin;
    private JTextField entradaCorreo;
    private JPasswordField entradaContra;

    public LoginPanel() {
        // Panel con degradado negro → rojo
        panelLogin = new JPanel() {
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

        panelLogin.setSize(500, 800);
        panelLogin.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Título
        JLabel titulo = new JLabel("Login");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(false);
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.add(titulo, gbc);

        // Entrada Correo
        entradaCorreo = new JTextField();
        entradaCorreo.setPreferredSize(new Dimension(100, 40));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panelLogin.add(entradaCorreo, gbc);

        // Entrada Contraseña
        entradaContra = new JPasswordField();
        entradaContra.setPreferredSize(new Dimension(100, 40));
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelLogin.add(entradaContra, gbc);

        // Botón
        JButton btnIngresar = new JButton("Ingresar");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(btnIngresar, gbc);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entradaUsuario = entradaCorreo.getText();
                String entradaContrasenna = new String(entradaContra.getPassword());

                if (new LoginControler().validacionDatos(entradaUsuario, entradaContrasenna)) {
                    new InicioView();
                    JFrame ventanaPadre = (JFrame) SwingUtilities.getWindowAncestor(panelLogin);
                    ventanaPadre.dispose();
                } else {
                    System.out.println("Usuario o contraseña incorrectos");
                }
            }
        });
    }

    public JPanel getJPanel() {
        return panelLogin;
    }
}
