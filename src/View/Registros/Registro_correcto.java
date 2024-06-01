package View.Registros;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.ImageIcon;

public class Registro_correcto extends JFrame {
    private JLabel Aviso;
    private JPanel boton;
    private JLabel label_boton;
    private ImageIcon imagenTaskBar;


    public Registro_correcto() {
        initComponents();
    }

    private void initComponents() {

        Aviso = new JLabel();
        boton = new JPanel();
        label_boton = new JLabel();
        imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setVisible(true);
        setIconImage(imagenTaskBar.getImage());

        Aviso.setFont(new Font("MathJax_Fraktur", 0, 12)); // NOI18N
        Aviso.setText("Registro completado. Ya puedes cerrar las ventanas e iniciar sesión");

        boton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_boton.setFont(new Font("MathJax_Math", 0, 13)); // NOI18N
        label_boton.setHorizontalAlignment(SwingConstants.CENTER);
        label_boton.setText("OK");
        label_boton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                label_botonMouseClicked(evt);
            }
        });

        GroupLayout botonLayout = new GroupLayout(boton);
        boton.setLayout(botonLayout);
        botonLayout.setHorizontalGroup(
                botonLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(botonLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        botonLayout.setVerticalGroup(
                botonLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(botonLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addComponent(Aviso, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(boton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(Aviso)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(boton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );

        pack();
    }

    private void label_botonMouseClicked(MouseEvent evt) {
        dispose();

    }




}
