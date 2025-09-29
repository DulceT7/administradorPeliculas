package modulos;

import javax.swing.*;
import java.awt.*;
import database.Peliculas;
import views.InicioView;
import views.PeliculasView;
import views.PeliculasView2;
import views.PeliculasView3;

public class BotonesModulos {

    
    public static void agregarBotones(InicioView inicioView) {
        JPanel panelUsuarios = inicioView.getPanelUsuarios();

        //  Botón 1 
        ImageIcon icon1 = new ImageIcon(BotonesModulos.class.getResource("/assets/iconos/icono1.png"));
        Image img1 = icon1.getImage().getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        JButton btnChichi = new JButton("Chichi", new ImageIcon(img1));
        configurarBoton(btnChichi);
        // Evento al hacer clic: cerrar ventana de inicio y abrir PeliculasView
        btnChichi.addActionListener(e -> {
            inicioView.getVentana().dispose();
            new PeliculasView(Peliculas.peliculas);
        });
        // Agregar el botón al panel de usuarios
        panelUsuarios.add(btnChichi);
        
        //  Botón 2 
        ImageIcon icon2 = new ImageIcon(BotonesModulos.class.getResource("/assets/iconos/icono2.png"));
        Image img2 = icon2.getImage().getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        JButton btnPijolito = new JButton("Pijolito", new ImageIcon(img2));
        configurarBoton(btnPijolito);
        btnPijolito.addActionListener(e -> {
            inicioView.getVentana().dispose();
            new PeliculasView2(Peliculas.peliculas);
        });
        panelUsuarios.add(btnPijolito);
        
        //  Botón 3 
        ImageIcon icon3 = new ImageIcon(BotonesModulos.class.getResource("/assets/iconos/icono3.png"));
        Image img3 = icon3.getImage().getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        JButton btnHuevitoo = new JButton("Huevitoo", new ImageIcon(img3));
        configurarBoton(btnHuevitoo);
        btnHuevitoo.addActionListener(e -> {
            inicioView.getVentana().dispose();
            new PeliculasView3(Peliculas.peliculas);
        });
        panelUsuarios.add(btnHuevitoo);
            
        // Refrescar el panel para que se muestren correctamente los botones agregados
        panelUsuarios.revalidate();
        panelUsuarios.repaint();
    }

    // Método auxiliar para configurar la apariencia de los botones
    private static void configurarBoton(JButton boton) {
        // Texto centrado debajo del icono
        boton.setHorizontalTextPosition(SwingConstants.CENTER);
        boton.setVerticalTextPosition(SwingConstants.BOTTOM);
        // Color del texto y fuente
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        // Estilo del botón: sin bordes ni relleno, transparente
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
        boton.setOpaque(false);
    }
}
