package View;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

//librerias externas para poder usar esos Layouts
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Panel_Inicio {

    private JFrame base;
    private JPanel Fondo;
    private JPanel boton_cerrar;
    private JLabel contraseña;
    private  JLabel foto;
    private JLabel inicio_sesion;
    private JPanel inicios_de_sesion;
    private JPasswordField insertar_contraseña;
    private JTextField insertar_nombre;
    //usamos los JSeparator para darle un toque bonito dejabo de los fields
    private JSeparator linea_contraseña;
    private JSeparator linea_nombre;
    private JLabel nombre;
    private JLabel olvido_contraseña;
    private JPanel panel_boton_inicio_sesion;
    private JPanel panel_boton_registrarse;
    private JPanel panel_botones;
    private JPanel panel_foto;
    private JPanel panel_olvido_contraseña;
    private JLabel registrarse;
    private JLabel simbolo_cerrar;
    private JPanel soporte_boton_cerrar;
    private Dimension size_panel_foto;
    private Dimension size_foto;
    private Dimension size_base_frame;
    private Dimension size_Fondo;
    private Dimension size

    public Panel_Inicio(){

        base = new JFrame();
        Fondo = new JPanel();
        panel_foto = new JPanel();
        foto = new JLabel();
        inicios_de_sesion = new JPanel();
        nombre = new JLabel();
        contraseña = new JLabel();
        insertar_contraseña = new JPasswordField();
        insertar_nombre = new JTextField();
        linea_nombre = new JSeparator();
        linea_contraseña = new JSeparator();
        panel_botones = new JPanel();
        panel_boton_inicio_sesion = new JPanel();
        inicio_sesion = new JLabel();
        panel_boton_registrarse = new JPanel();
        registrarse = new JLabel();
        panel_olvido_contraseña = new JPanel();
        olvido_contraseña = new JLabel();
        soporte_boton_cerrar = new JPanel();
        boton_cerrar = new JPanel();
        simbolo_cerrar = new JLabel();
        size_panel_foto = new Dimension(1200,618);
        size_foto = new Dimension(800,200);
        size_Fondo = new Dimension(1200,618);


        base.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        base.setAlwaysOnTop(true);
        base.setLocationByPlatform(true);
        base.setUndecorated(true);
        base.setResizable(false);
        base.setVisible(true);
        base.setSize(new java.awt.Dimension(780, 280));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setPreferredSize(size_Fondo);
        Fondo.setLayout(new AbsoluteLayout());
}
    }

