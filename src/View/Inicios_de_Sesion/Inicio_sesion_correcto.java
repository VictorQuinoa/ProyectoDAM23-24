package View.Inicios_de_Sesion;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Inicio_sesion_correcto extends JFrame {

    private JLabel aviso;
    private ImageIcon imagenTaskBar;
    private JPanel boton_continuar;
    private JPanel fondo;
    private JLabel japi;
    private JLabel texto_continuar;


    public Inicio_sesion_correcto() {
        initComponents();
    }

    private void initComponents() {

        fondo = new JPanel();
        aviso = new JLabel();
        japi = new JLabel();
        imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));
        boton_continuar = new JPanel();
        texto_continuar = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(imagenTaskBar.getImage());
        setAlwaysOnTop(true);
        setVisible(true);
        setLocation(new Point(600,600));
        setResizable(false);

        fondo.setBackground(new Color(204, 204, 204));

        aviso.setFont(new Font("MathJax_Fraktur", 0, 18));
        aviso.setText("Bienvenido");

        japi.setText(":D");

        boton_continuar.setBackground(new Color(204, 255, 255));
        boton_continuar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_continuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_continuar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                boton_continuarMouseClicked(evt);
            }
        });

        texto_continuar.setFont(new Font("MathJax_Fraktur", 0, 13));
        texto_continuar.setHorizontalAlignment(SwingConstants.CENTER);
        texto_continuar.setText("Continuar");

        GroupLayout boton_continuarLayout = new GroupLayout(boton_continuar);
        boton_continuar.setLayout(boton_continuarLayout);
        boton_continuarLayout.setHorizontalGroup(
                boton_continuarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(boton_continuarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(texto_continuar, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        boton_continuarLayout.setVerticalGroup(
                boton_continuarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(boton_continuarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(texto_continuar, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
        );

        GroupLayout fondoLayout = new GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(185, 185, 185)
                                                .addComponent(japi))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(boton_continuar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(aviso)))
                                .addContainerGap(151, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(aviso)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(japi)
                                .addGap(18, 18, 18)
                                .addComponent(boton_continuar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void boton_continuarMouseClicked(MouseEvent evt) {

    }
}
