package View;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Font;

public class Menu_principal extends JFrame {

    private JLabel boton_baccarat;
    private JLabel boton_blackjack;
    private JLabel boton_poker;
    private JLabel boton_ruleta;
    private JLabel boton_tragaperras;
    private JLabel cerrar_sesion_label;
    private JPanel fondo;
    private JLabel texto_user;

    public Menu_principal() {
        initComponents();
    }

    private void initComponents() {

        fondo = new JPanel();
        texto_user = new JLabel();
        boton_ruleta = new JLabel();
        boton_baccarat = new JLabel();
        boton_poker = new JLabel();
        boton_tragaperras = new JLabel();
        boton_blackjack = new JLabel();
        cerrar_sesion_label = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setVisible(true);
        setLocation(new java.awt.Point(600, 600));

        fondo.setBackground(new Color(204, 204, 204));

        texto_user.setText("Bienvenido ");
        texto_user.setFont(new Font("DejaVu Math TeX Gyre",2,18));


        boton_ruleta.setBackground(new java.awt.Color(255, 255, 255));
        boton_ruleta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_ruleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/ruletaButton.png")));
        boton_ruleta.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                boton_ruletaMouseClicked(evt);
            }
        });

        boton_baccarat.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/bacaButton.jpg")));
        boton_baccarat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_baccarat.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                boton_baccaratMouseClicked(evt);
            }
        });

        boton_poker.setBackground(new Color(255, 255, 255));
        boton_poker.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_poker.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/pokerButton.jpg")));
        boton_poker.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                boton_pokerMouseClicked(evt);
            }
        });

        boton_tragaperras.setBackground(new Color(255, 255, 255));
        boton_tragaperras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_tragaperras.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/tragaButton.jpg")));
        boton_tragaperras.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                boton_tragaperrasMouseClicked(evt);
            }
        });

        boton_blackjack.setBackground(new Color(255, 255, 255));
        boton_blackjack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton_blackjack.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/blackButton.png")));
        boton_blackjack.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                boton_blackjackMouseClicked(evt);
            }
        });

        cerrar_sesion_label.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/cerrar_sesion.png")));
        cerrar_sesion_label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cerrar_sesion_label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                cerrar_sesion_labelMousePressed(evt);
            }
        });

        GroupLayout fondoLayout = new GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(boton_baccarat, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(boton_blackjack, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(boton_poker, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(boton_ruleta, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(boton_tragaperras, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cerrar_sesion_label)
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(texto_user)
                                                .addContainerGap())
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(cerrar_sesion_label, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(texto_user)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                ))
                                .addGap(49, 49, 49)
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(boton_ruleta, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_baccarat, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_tragaperras, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_blackjack, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_poker, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void cerrar_sesion_labelMousePressed(MouseEvent evt) {
        System.exit(0);
    }

    private void boton_baccaratMouseClicked(MouseEvent evt) {

    }

    private void boton_blackjackMouseClicked(MouseEvent evt) {

    }

    private void boton_pokerMouseClicked(MouseEvent evt) {

    }

    private void boton_ruletaMouseClicked(MouseEvent evt) {

    }

    private void boton_tragaperrasMouseClicked(MouseEvent evt) {

    }


}

