package View;

import java.awt.Color;
import javax.swing.*;

import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;
import java.awt.Font;

import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class InsertarDatos {
    int xMouse;
    int yMouse;
    private JFrame base_de_ventana;
    private JPanel barra_titulo;
    private JPanel boton_cerrar;
    private JPanel boton_registro;
    private JLabel info_datos;
    private JTextField insertar_DNI;
    private JTextField insertar_apellido1;
    private JTextField insertar_apellido2;
    private JPasswordField insertar_contraseña;
    private JTextField insertar_nombre;
    private JTextField insertar_nombre_usuario;
    private JLabel label_DNI;
    private JLabel label_apellido1;
    private JLabel label_apellido2;
    private JLabel label_cerrar;
    private JLabel label_contraseña;
    private JLabel label_foto;
    private JLabel label_nombre;
    private JLabel label_nombre_usuario;
    private JLabel label_registro;
    private JSeparator linea_DNI;
    private JSeparator linea_apellido1;
    private JSeparator linea_apellido2;
    private JSeparator linea_contraseña;
    private JSeparator linea_nombre;
    private JSeparator linea_nombre_usuario;
    private JPanel panel_del_registro;
    private JPanel panel_foto;
    private ImageIcon imagenTaskBar;
    private JPanel panel_insertar_datos;

    public InsertarDatos() {
        initComponents();
    }


    private void initComponents() {

        base_de_ventana = new JFrame();
        imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Icono.jpg"));
        panel_del_registro = new JPanel();
        barra_titulo = new JPanel();
        boton_cerrar = new JPanel();
        label_cerrar = new JLabel();
        boton_registro = new JPanel();
        label_registro = new JLabel();
        panel_foto = new JPanel();
        label_foto = new JLabel();
        panel_insertar_datos = new JPanel();
        linea_nombre = new JSeparator();
        label_contraseña = new JLabel();
        label_DNI = new JLabel();
        insertar_apellido2 = new JTextField();
        linea_contraseña = new JSeparator();
        info_datos = new JLabel();
        insertar_nombre_usuario = new JTextField();
        label_nombre_usuario = new JLabel();
        linea_apellido2 = new JSeparator();
        linea_apellido1 = new JSeparator();
        label_apellido1 = new JLabel();
        insertar_DNI = new JTextField();
        label_nombre = new JLabel();
        insertar_nombre = new JTextField();
        linea_DNI = new JSeparator();
        linea_nombre_usuario = new JSeparator();
        insertar_contraseña = new JPasswordField();
        label_apellido2 = new JLabel();
        insertar_apellido1 = new JTextField();

        base_de_ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        base_de_ventana.setUndecorated(true);
        base_de_ventana.setResizable(false);
        base_de_ventana.setIconImage(imagenTaskBar.getImage());
        base_de_ventana.setSize(new java.awt.Dimension(400, 400));
        base_de_ventana.setVisible(true);

        panel_del_registro.setBackground(new Color(255, 255, 255));
        panel_del_registro.setLayout(new AbsoluteLayout());

        barra_titulo.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                barra_tituloMouseDragged(evt);
            }
        });
        barra_titulo.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                barra_tituloMousePressed(evt);
            }
        });

        boton_cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        boton_cerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_cerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_cerrarMousePressed(evt);
            }
        });

        label_cerrar.setHorizontalAlignment(SwingConstants.CENTER);
        label_cerrar.setText("X");

        GroupLayout boton_cerrarLayout = new GroupLayout(boton_cerrar);
        boton_cerrar.setLayout(boton_cerrarLayout);
        boton_cerrarLayout.setHorizontalGroup(
                boton_cerrarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(boton_cerrarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(label_cerrar, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );
        boton_cerrarLayout.setVerticalGroup(
                boton_cerrarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(boton_cerrarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(label_cerrar, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
        );

        GroupLayout barra_tituloLayout = new GroupLayout(barra_titulo);
        barra_titulo.setLayout(barra_tituloLayout);
        barra_tituloLayout.setHorizontalGroup(
                barra_tituloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(barra_tituloLayout.createSequentialGroup()
                                .addComponent(boton_cerrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 370, Short.MAX_VALUE))
        );
        barra_tituloLayout.setVerticalGroup(
                barra_tituloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(boton_cerrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_del_registro.add(barra_titulo, new AbsoluteConstraints(0, 0, 400, 20));

        boton_registro.setBackground(new Color(255, 255, 255));
        boton_registro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, Color.black, null, null));
        boton_registro.setCursor(new Cursor(Cursor.HAND_CURSOR));

        label_registro.setHorizontalAlignment(SwingConstants.CENTER);
        label_registro.setText("Registrarme");

        GroupLayout boton_registroLayout = new GroupLayout(boton_registro);
        boton_registro.setLayout(boton_registroLayout);
        boton_registroLayout.setHorizontalGroup(
                boton_registroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, boton_registroLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_registro, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        boton_registroLayout.setVerticalGroup(
                boton_registroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, boton_registroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label_registro, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        );

        panel_del_registro.add(boton_registro, new AbsoluteConstraints(140, 450, -1, 50));

        panel_foto.setToolTipText("");

        label_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Decorativos/Imagenes/appreciated!.jpg")));
        label_foto.setLabelFor(panel_foto);


        GroupLayout panel_fotoLayout = new GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
                panel_fotoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(label_foto, GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
                panel_fotoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panel_fotoLayout.createSequentialGroup()
                                .addComponent(label_foto, GroupLayout.PREFERRED_SIZE, 105, Short.MAX_VALUE)
                                .addContainerGap())
        );

        panel_del_registro.add(panel_foto, new AbsoluteConstraints(0, 21, 400, 100));

        panel_insertar_datos.setBackground(new Color(255, 255, 255));

        linea_nombre.setForeground(new Color(51, 51, 51));

        label_contraseña.setFont(new Font("MathJax_SansSerif", 0, 12));
        label_contraseña.setText("Contrasenha");

        label_DNI.setFont(new Font("MathJax_SansSerif", 0, 12));
        label_DNI.setText("DNI ");

        insertar_apellido2.setFont(new Font("MathJax_SansSerif", 0, 12));
        insertar_apellido2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        linea_contraseña.setForeground(new Color(51, 51, 51));

        info_datos.setFont(new Font("MathJax_SansSerif", 0, 10));
        info_datos.setText("Todos los campos son obligatorios a la hora de registrarse");

        insertar_nombre_usuario.setFont(new Font("MathJax_SansSerif", 0, 12));
        insertar_nombre_usuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));


        label_nombre_usuario.setFont(new Font("MathJax_SansSerif", 0, 12));
        label_nombre_usuario.setText("Nombre de usuario ");

        linea_apellido2.setForeground(new Color(51, 51, 51));

        linea_apellido1.setForeground(new Color(51, 51, 51));

        label_apellido1.setFont(new Font("MathJax_SansSerif", 0, 12));
        label_apellido1.setText("Apellido 1 ");

        insertar_DNI.setFont(new Font("MathJax_SansSerif", 0, 12));
        insertar_DNI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        label_nombre.setFont(new Font("MathJax_SansSerif", 0, 12));
        label_nombre.setText("Nombre ");

        insertar_nombre.setFont(new Font("MathJax_SansSerif", 0, 12));
        insertar_nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        linea_DNI.setForeground(new Color(51, 51, 51));

        linea_nombre_usuario.setForeground(new Color(51, 51, 51));

        insertar_contraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        label_apellido2.setFont(new Font("MathJax_SansSerif", 0, 12));
        label_apellido2.setText("Apellido 2 ");

        insertar_apellido1.setFont(new Font("MathJax_SansSerif", 0, 12));
        insertar_apellido1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        GroupLayout panel_insertar_datosLayout = new GroupLayout(panel_insertar_datos);
        panel_insertar_datos.setLayout(panel_insertar_datosLayout);
        panel_insertar_datosLayout.setHorizontalGroup(
                panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                .addComponent(label_DNI)
                                                .addGap(86, 86, 86)
                                                .addComponent(label_nombre_usuario)
                                                .addGap(24, 24, 24)
                                                .addComponent(label_contraseña))
                                        .addComponent(info_datos)
                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(insertar_DNI, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                        .addComponent(linea_DNI))
                                                .addGap(30, 30, 30)
                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(linea_nombre_usuario)
                                                        .addComponent(insertar_nombre_usuario, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                                .addGap(40, 40, 40)
                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(linea_contraseña)
                                                        .addComponent(insertar_contraseña, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                                                .addComponent(label_nombre)
                                                                                .addGap(57, 57, 57))
                                                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                                                .addComponent(insertar_nombre)
                                                                                .addGap(20, 20, 20)))
                                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                                                .addComponent(label_apellido1)
                                                                                .addGap(58, 58, 58))
                                                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(insertar_apellido1)
                                                                                .addGap(26, 26, 26))))
                                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                                .addComponent(linea_nombre, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(linea_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)))
                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label_apellido2)
                                                        .addComponent(insertar_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(linea_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 20, Short.MAX_VALUE)))
                                .addContainerGap(84, Short.MAX_VALUE))
        );
        panel_insertar_datosLayout.setVerticalGroup(
                panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panel_insertar_datosLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(label_nombre)
                                        .addComponent(label_apellido1)
                                        .addComponent(label_apellido2))
                                .addGap(8, 8, 8)
                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(insertar_nombre, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(insertar_apellido1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(insertar_apellido2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(linea_nombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(linea_apellido1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(linea_apellido2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(label_DNI)
                                        .addComponent(label_nombre_usuario)
                                        .addComponent(label_contraseña))
                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_insertar_datosLayout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(insertar_DNI, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(insertar_nombre_usuario, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel_insertar_datosLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(insertar_contraseña, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panel_insertar_datosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(linea_DNI, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(linea_nombre_usuario, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(linea_contraseña, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(info_datos)
                                .addContainerGap())
        );

        panel_del_registro.add(panel_insertar_datos, new AbsoluteConstraints(0, 120, 400, 300));

        GroupLayout layout = new GroupLayout(base_de_ventana.getContentPane());
        base_de_ventana.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel_del_registro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel_del_registro, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        base_de_ventana.pack();
    }

    private void barra_tituloMousePressed(MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    private void barra_tituloMouseDragged(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        base_de_ventana.setLocation(x-xMouse,y-yMouse);
    }

    private void boton_cerrarMouseEntered(MouseEvent evt) {
        boton_cerrar.setBackground(Color.red);
        label_cerrar.setForeground(Color.white);
    }

    private void boton_cerrarMouseExited(MouseEvent evt) {
        boton_cerrar.setBackground(Color.white);
        label_cerrar.setForeground(Color.black);
    }

    private void boton_cerrarMousePressed(MouseEvent evt) {
        base_de_ventana.dispose();
    }

}

