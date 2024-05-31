package View;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Insertar_nueva_contraseña extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField insertar_nueva_contraseña;
    private javax.swing.JPanel boton;
    private javax.swing.JSeparator linea_nContraseña;
    private javax.swing.JLabel label_boton;
    private javax.swing.JLabel label_nContraseña;

    public Insertar_nueva_contraseña() {
        initComponents();
    }



    private void initComponents() {
        ImageIcon imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));

        fondo = new javax.swing.JPanel();
        boton = new javax.swing.JPanel();
        label_boton = new javax.swing.JLabel();
        label_nContraseña = new javax.swing.JLabel();
        insertar_nueva_contraseña = new javax.swing.JTextField();
        linea_nContraseña = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setVisible(true);
        setIconImage(imagenTaskBar.getImage());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        fondo.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        boton.setBackground(new java.awt.Color(255, 255, 255));
        boton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                botonMouseClicked(evt);
            }
        });

        label_boton.setBackground(new java.awt.Color(255, 255, 255));
        label_boton.setFont(new java.awt.Font("MathJax_Math", 2, 13)); // NOI18N
        label_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_boton.setText("Cambiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(boton);
        boton.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        label_nContraseña.setFont(new java.awt.Font("MathJax_Math", 2, 13)); // NOI18N
        label_nContraseña.setText("Nueva contraseña");

        insertar_nueva_contraseña.setFont(new java.awt.Font("MathJax_Math", 2, 13)); // NOI18N
        insertar_nueva_contraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        linea_nContraseña.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label_nContraseña))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(linea_nContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(insertar_nueva_contraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                                .addContainerGap(151, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label_nContraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertar_nueva_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linea_nContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 170, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void fondoMousePressed(MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
    private void fondoMouseDragged(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }
    private void botonMouseClicked(java.awt.event.MouseEvent evt) {
        //aquí tendría que ir un método para ver si este campo está con una contraseña

        dispose();
    }





}