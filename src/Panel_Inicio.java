import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Panel_Inicio {

    private JFrame base_paneles;
    private JPanel inicios_de_sesion;
    private JPanel panel_logo;
    private JPanel botones;
    private JButton inicio_sesion;
    private JButton olvido_Contraseña;
    private JButton registro;
    private JTextField insertar_nombre;
    private JTextField insertar_contraseña;
    private JLabel nombre;
    private JLabel contraseña;
    private ImageIcon logo;
    private Image imagen_pintada;
    private Image icono;
    private String ubicacion_logo;
    private JLabel espacio_logo;

    public Panel_Inicio(){
        //Definición de la base para poner los paneles
        base_paneles = new JFrame();
        base_paneles.setLayout(new GridLayout(3,1));
        base_paneles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        base_paneles.setBounds(600, 400, 600,600);
        base_paneles.setVisible(true);
        base_paneles.setResizable(false);

        //Comando para poner el icono de la aplicación (como en la barra de tareas por ej.)
        try{
          icono = ImageIO.read(new File("Decorativos/Imagenes/1200x655_iStock-1437617733.jpg"));
          imagen_pintada = ImageIO.read(new File("Decorativos/Imagenes/appreciated!.png"));
        }catch (IOException e) {
            e.printStackTrace();
        }

        base_paneles.setIconImage(icono);

        //Panel de arriba para poner el logo
        panel_logo = new JPanel(){
            //método para pintar la imagen
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen en el panel
                g.drawImage(icono, 0, 0, getWidth(), getHeight(), this);
                g.drawImage(imagen_pintada,0,0,getWidth(),getHeight(),this);
            }
        };
        ubicacion_logo = "Decorativos/Imagenes/appreciated!.jpg";
        logo = new ImageIcon(ubicacion_logo);
        imagen_pintada = logo.getImage();
        base_paneles.add(panel_logo);


        //Panel del centro para los registros

        inicios_de_sesion = new JPanel();
        inicios_de_sesion.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

    }

}
