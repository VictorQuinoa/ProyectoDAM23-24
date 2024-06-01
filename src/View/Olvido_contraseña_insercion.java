package View;

import BaseDeDatos.BDHandlerUsuario;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Olvido_contraseña_insercion extends javax.swing.JFrame {

    private int xMouse;
    protected static String passw;
    private int yMouse;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField insertar_dni;
    private javax.swing.JTextField insertar_nombre;
    private javax.swing.JPanel apoyo;
    private javax.swing.JLabel label_boton;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JSeparator linea_dni;
    private javax.swing.JSeparator linea_nombre;
    private ImageIcon imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));

    public Olvido_contraseña_insercion() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        label_dni = new javax.swing.JLabel();
        insertar_dni = new javax.swing.JTextField();
        linea_dni = new javax.swing.JSeparator();
        linea_nombre = new javax.swing.JSeparator();
        insertar_nombre = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        apoyo = new javax.swing.JPanel();
        label_boton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);
        setIconImage(imagenTaskBar.getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        label_dni.setFont(new java.awt.Font("MathJax_Fraktur", 2, 14));
        label_dni.setText("DNI de la cuenta olvidada");

        insertar_dni.setFont(new java.awt.Font("Arial", 2, 14));
        insertar_dni.setForeground(new java.awt.Color(194, 194, 194));

        insertar_dni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));


        linea_dni.setForeground(new java.awt.Color(0, 0, 0));

        linea_nombre.setForeground(new java.awt.Color(0, 0, 0));

        insertar_nombre.setFont(new java.awt.Font("Arial", 2, 14));
        insertar_nombre.setForeground(new java.awt.Color(194, 194, 194));

        insertar_nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));


        label_nombre.setFont(new java.awt.Font("MathJax_Fraktur", 2, 14)); // NOI18N
        label_nombre.setText("Nombre de la cuenta olvidada");

        apoyo.setBackground(new java.awt.Color(255, 255, 255));
        apoyo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_boton.setFont(new java.awt.Font("Arial", 0, 13));
        label_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_boton.setText("Buscar");
        label_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_botonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(apoyo);
        apoyo.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label_dni)
                                                        .addComponent(insertar_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(linea_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label_nombre)
                                                        .addComponent(insertar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(linea_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(apoyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(151, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(label_dni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertar_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linea_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linea_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(apoyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        pack();
    }


    private void label_botonMouseClicked(java.awt.event.MouseEvent evt) {
        //aquí tendría que ir un método para buscar el nombre y el dni y que abra una ventana u otra
        if(insertar_dni.getText().isEmpty() || insertar_nombre.getText().isEmpty()){
            insertar_dni.setText("");
            insertar_nombre.setText("");
            new mal_puesto();
        } else {
            BDHandlerUsuario bd = new BDHandlerUsuario();
            String dni = insertar_dni.getText();
            String nombre = insertar_nombre.getText();
            bd.forgotPassword(dni, nombre);
            if(bd.forgotPassword(dni, nombre) != null){
                passw = bd.forgotPassword(dni, nombre);
                new contraseña_mostrada();
                dispose();
            } else {
                new mal_puesto();
            }
        }


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
