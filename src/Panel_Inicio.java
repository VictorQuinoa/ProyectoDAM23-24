import javax.swing.*;
import java.awt.*;

public class Panel_Inicio {

    private JFrame base_paneles;
    private JPanel inicios_de_sesion;
    private JPanel logo;
    private JPanel botones;
    private JButton inicio_sesion;
    private JButton olvido_Contraseña;
    private JButton registro;
    private JTextField insertar_nombre;
    private JTextField insertar_contraseña;
    private JLabel nombre;
    private JLabel contraseña;

    public Panel_Inicio(){
        base_paneles = new JFrame();
        base_paneles.setLayout(new GridLayout(3,1));
        base_paneles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        base_paneles.setVisible(true);


    }

}
