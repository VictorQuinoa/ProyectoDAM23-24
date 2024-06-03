package View.Inicios_de_Sesion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Inicio_sesion_incorrecto extends JFrame {

    private JLabel aviso;
    private ImageIcon imagenTaskBar;
    private JLabel troste;
    private JLabel texto_reintento;
    private JPanel fondo;
    private JPanel boton_reintento;


    public Inicio_sesion_incorrecto() {
        initComponents();
    }

    private void initComponents() {

        fondo = new JPanel();
        aviso = new JLabel();
        troste = new JLabel();
        imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));
        boton_reintento = new JPanel();
        texto_reintento = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(imagenTaskBar.getImage());
        setResizable(false);
        setVisible(true);
        setLocation(new Point(600,600));
        setSize(new java.awt.Dimension(500, 219));



        fondo.setBackground(new Color(204, 204, 204));
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));

        aviso.setFont(new Font("MathJax_Fraktur", 0, 13));
        aviso.setText("El nombre de usuario o la contraseña son incorrectas");

        troste.setText(";(");

        boton_reintento.setBackground(new Color(204, 255, 255));
        boton_reintento.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_reintento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton_reintento.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                boton_reinicioMouseClicked(evt);
            }
        });

        texto_reintento.setFont(new Font("MathJax_Fraktur", 0, 13)); // NOI18N
        texto_reintento.setText("Volver a intentar");

        GroupLayout jPanel2Layout = new GroupLayout(boton_reintento);
        boton_reintento.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 103, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(texto_reintento, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(texto_reintento, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(fondo);
        fondo.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(182, 182, 182)
                                                .addComponent(troste))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(aviso))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(boton_reintento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(aviso)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(troste)
                                .addGap(26, 26, 26)
                                .addComponent(boton_reintento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 382, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 175, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(fondo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }

    private void boton_reinicioMouseClicked(MouseEvent evt) {
        dispose();
    }
}

