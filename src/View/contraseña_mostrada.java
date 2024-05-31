package View;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class contraseña_mostrada extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    private javax.swing.JLabel aviso;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel apoyo;
    private javax.swing.JLabel label_boton;

    public contraseña_mostrada() {
        initComponents();
    }


    private void initComponents() {
        ImageIcon imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));
        fondo = new javax.swing.JPanel();
        aviso = new javax.swing.JLabel();
        apoyo = new javax.swing.JPanel();
        label_boton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        aviso.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aviso.setText("Contraseña: " + Olvido_contraseña_insercion.passw);

        apoyo.setBackground(new java.awt.Color(255, 255, 255));
        apoyo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apoyo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_boton.setFont(new java.awt.Font("MathJax_Math", 0, 13)); // NOI18N
        label_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_boton.setText("OK");
        label_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_botonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(apoyo);
        apoyo.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                        .addContainerGap(200, Short.MAX_VALUE)
                                        .addComponent(apoyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(200, Short.MAX_VALUE)))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(aviso)
                                .addContainerGap(96, Short.MAX_VALUE))
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                        .addContainerGap(70, Short.MAX_VALUE)
                                        .addComponent(apoyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void label_botonMouseClicked(java.awt.event.MouseEvent evt) {
            dispose();
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


}
