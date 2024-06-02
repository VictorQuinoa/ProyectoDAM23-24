package View.Registros;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registro_incorrecto extends JFrame {
    private JLabel aviso;
    private JPanel boton;
    private JLabel label_boton;

    public Registro_incorrecto() {
        initComponents();
    }


    private void initComponents() {

        aviso = new JLabel();
        boton = new JPanel();
        label_boton = new JLabel();

        ImageIcon imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));
        setIconImage(imagenTaskBar.getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setVisible(true);

        aviso.setFont(new Font("MathJax_Math", 0, 12));
        aviso.setText("Registro incorrecto. Intentelo de nuevo");

        boton.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));

        label_boton.setFont(new Font("MathJax_Math", 0, 13));
        label_boton.setHorizontalAlignment(SwingConstants.CENTER);
        label_boton.setText("OK");
        label_boton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                label_botonMouseClicked(evt);
            }
        });
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
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(aviso))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(boton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(aviso)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(boton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );

        pack();
    }

    private void label_botonMouseClicked(MouseEvent evt) {
        dispose();
    }

}
