package View;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


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
        //el AbsoluteLayout te permite pegar los paneles entre sí, es decir, que no quede un hueco entre ambos
        Fondo.setLayout(new AbsoluteLayout());

        panel_foto.setPreferredSize(size_panel_foto);

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagen/maxresdefault.jpg")));
        foto.setAlignmentY(0.0F);
        foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);


        //GroupLayout lo utilizo para definir la disposición del panel
        GroupLayout panel_fotoLayout = new GroupLayout(panel_foto);
        //se utiliza para poder controlar mejor los componentes de dentro
        panel_foto.setLayout(panel_fotoLayout);
        //para definir como colocar horizontalmente los componentes
        panel_fotoLayout.setHorizontalGroup(
                //Alignment.LEADING especifica que los elementos se pongan de izquierda a derecha
                panel_fotoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)

                        .addGroup(panel_fotoLayout.createSequentialGroup()
                                //añade el elemento foto con el tamaño máximo de 734 y configurado para que se ponga en un tamaño determinado
                                .addComponent(foto, GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                                //Se utiliza para dejar un espacio en blanco si se pusieran más componentes
                                .addContainerGap())
        );
        //para definir como se colocan verticalmente los componentes
        panel_fotoLayout.setVerticalGroup(
                //Para alinear en paralelo al eje vertical
                panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        //Creación de un grupo de componentes
                        .addGroup(panel_fotoLayout.createSequentialGroup()
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                //Espacio entre componentes
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        //Añado el panel de la foto al fondo
        Fondo.add(panel_foto, new AbsoluteConstraints(0, 20, 740, 130));

        //Pongo este background para asegurar que se pone el fondo correctamente
        inicios_de_sesion.setBackground(new Color(255, 255, 255));

        //Modifico la fuente para una más elegante
        nombre.setFont(new Font("DejaVu Math TeX Gyre", 2, 18));
        //Para que se parezca a un placeholder de HTML
        nombre.setText("Nombre de usuario");

        contraseña.setFont(new Font("DejaVu Math TeX Gyre", 2, 18));
        //Para que se parezca a un placeholder de HTML
        contraseña.setText("Contraseña");

        insertar_contraseña.setFont(new Font("DejaVu Math TeX Gyre", 2, 18)); // NOI18N
        insertar_contraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        insertar_nombre.setFont(new Font("Cantarell Thin", 2, 13)); // NOI18N
        insertar_nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));

        //Un JSeparator para darle un toque bonito
        linea_nombre.setForeground(new Color(0, 0, 0));

        linea_contraseña.setForeground(new Color(0, 0, 0));

        //Hago otro GroupLayout para volver a organizar vertical y horizontalmente
        javax.swing.GroupLayout inicios_de_sesionLayout = new GroupLayout(inicios_de_sesion);
        inicios_de_sesion.setLayout(inicios_de_sesionLayout);
        inicios_de_sesionLayout.setHorizontalGroup(
                //El mismo alineamiento que en el panel de la foto
                inicios_de_sesionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(inicios_de_sesionLayout.createSequentialGroup()
                                //El Gap para separar entre sí todos los elementos
                                .addGap(15, 15, 15)
                                .addGroup(inicios_de_sesionLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        //añado los componentes
                                        .addComponent(linea_contraseña)
                                        .addComponent(nombre, GroupLayout.Alignment.LEADING)
                                        .addComponent(contraseña, GroupLayout.Alignment.LEADING)
                                        .addComponent(insertar_contraseña, GroupLayout.Alignment.LEADING)
                                        .addComponent(insertar_nombre, GroupLayout.Alignment.LEADING)
                                        .addComponent(linea_nombre, GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                //Un espacio adicional para separar del panel que voy a hacer debajo
                                .addContainerGap(430, Short.MAX_VALUE))
        );
        inicios_de_sesionLayout.setVerticalGroup(
                inicios_de_sesionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, inicios_de_sesionLayout.createSequentialGroup()
                                //Un espacio necesario para que se vea bien
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(nombre)
                                //El LayoutStyle lo utilizo para definir como se deben colocar los objetos entre sí. El RELATED se utiliza para añadir un pequeño espacio en blanco entre sí
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linea_nombre, GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(contraseña)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertar_contraseña, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linea_contraseña, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
        );

        Fondo.add(inicios_de_sesion, new AbsoluteConstraints(0, 220, 710, 160));

        //Para asegurarme de que tiene el background
        panel_botones.setBackground(new java.awt.Color(255, 255, 255));

        inicio_sesion.setFont(new Font("DejaVu Math TeX Gyre", 2, 12)); // NOI18N
        //Para poner el alineamiento horizontal en Center
        inicio_sesion.setHorizontalAlignment(SwingConstants.CENTER);
        //Para poner el texto de "Iniciar sesión"
        inicio_sesion.setText("Iniciar sesión");
        inicio_sesion.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 0), 1, true));
        inicio_sesion.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //Listener para añadir dealles
        inicio_sesion.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                inicio_sesionMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                inicio_sesionMouseExited(evt);
            }
        });
        //Otro grupo de Componentes para organizarlos de manera eficiente
        GroupLayout panel_boton_inicio_sesionLayout = new GroupLayout(panel_boton_inicio_sesion);
        panel_boton_inicio_sesion.setLayout(panel_boton_inicio_sesionLayout);
        panel_boton_inicio_sesionLayout.setHorizontalGroup(
                panel_boton_inicio_sesionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panel_boton_inicio_sesionLayout.createSequentialGroup()
                                .addComponent(inicio_sesion, GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_boton_inicio_sesionLayout.setVerticalGroup(
                panel_boton_inicio_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inicio_sesion, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_boton_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_boton_registrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_boton_registrarseMouseExited(evt);
            }
        });

        registrarse.setFont(new Font("DejaVu Math TeX Gyre", 2, 12)); // NOI18N
        registrarse.setHorizontalAlignment(SwingConstants.CENTER);
        registrarse.setText("Registrarse");
        registrarse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        registrarse.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registrarse.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout panel_boton_registrarseLayout = new GroupLayout(panel_boton_registrarse);
        panel_boton_registrarse.setLayout(panel_boton_registrarseLayout);
        panel_boton_registrarseLayout.setHorizontalGroup(
                panel_boton_registrarseLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(registrarse, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
        );
        panel_boton_registrarseLayout.setVerticalGroup(
                panel_boton_registrarseLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panel_boton_registrarseLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(registrarse, GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_olvido_contraseña.setBackground(new Color(255, 255, 255));
        //Listener del cursor. Pongo estos eventos para darle un toque más realista al texto al pasar el cursor
        panel_olvido_contraseña.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_olvido_contraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_olvido_contraseñaMouseExited(evt);
            }
        });

        olvido_contraseña.setFont(new Font("DejaVu Math TeX Gyre", 2, 8)); // NOI18N
        olvido_contraseña.setForeground(new Color(0, 204, 255));
        olvido_contraseña.setHorizontalAlignment(SwingConstants.CENTER);
        olvido_contraseña.setText("He olvidado mi contraseña");
        olvido_contraseña.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Organización horizontal del panel
        GroupLayout panel_olvido_contraseñaLayout = new GroupLayout(panel_olvido_contraseña);
        panel_olvido_contraseña.setLayout(panel_olvido_contraseñaLayout);
        panel_olvido_contraseñaLayout.setHorizontalGroup(
                panel_olvido_contraseñaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panel_olvido_contraseñaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(olvido_contraseña, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //Organización vertical del panel
        panel_olvido_contraseñaLayout.setVerticalGroup(
                panel_olvido_contraseñaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panel_olvido_contraseñaLayout.createSequentialGroup()
                                .addComponent(olvido_contraseña, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        //Más organización del panel
        GroupLayout panel_botonesLayout = new GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
                panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_botonesLayout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addGroup(panel_botonesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_botonesLayout.createSequentialGroup()
                                                .addComponent(panel_boton_inicio_sesion, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)
                                                .addComponent(panel_boton_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel_botonesLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(panel_olvido_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85)))
                                .addContainerGap(239, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
                panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_botonesLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panel_botonesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panel_boton_inicio_sesion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel_boton_registrarse, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(panel_olvido_contraseña, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        Fondo.add(panel_botones, new AbsoluteConstraints(0, 390, 740, 160));
    }
/*
Aquí están los Listener que se utilizar para detalles, entre otras cossas
 */
    private void inicio_sesionMouseEntered(java.awt.event.MouseEvent evt) {
        panel_boton_inicio_sesion.setBackground(new Color(164,164,164));
    }

    private void panel_boton_registrarseMouseEntered(MouseEvent evt) {
        panel_boton_registrarse.setBackground(new Color(164,164,164));
    }
    private void panel_olvido_contraseñaMouseEntered(MouseEvent evt) {
        olvido_contraseña.setForeground(new Color(54,255,237));
    }

    private void panel_olvido_contraseñaMouseExited(MouseEvent evt) {
        olvido_contraseña.setForeground(new Color(0,204,255));
    }
    private void inicio_sesionMouseExited(MouseEvent evt) {
        panel_boton_inicio_sesion.setBackground(new Color(242,242,242));
    }

    private void panel_boton_registrarseMouseExited(MouseEvent evt) {
        panel_boton_registrarse.setBackground(new Color(242,242,242));
    }

    }

