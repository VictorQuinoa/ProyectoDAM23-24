package View.Juegos;

import Model.JuegoDeCartas.Baraja;
import Model.JuegoDeCartas.Cartas;
import Model.Juegos.Bacarat;
import Model.Musica.MusicaFondo;
import View.Menu_principal;

import javax.swing.*;

public class View_Bacarat extends javax.swing.JFrame {

    MusicaFondo mf = new MusicaFondo();
    private javax.swing.JPanel Boton_pedir;
    private javax.swing.JLabel aviso_mano_C;
    private javax.swing.JLabel aviso_mano_J;
    private javax.swing.JPanel boton_retirarse;
    private javax.swing.JLabel boton_salir;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel label_pedir;
    private static boolean primeraVez;
    private javax.swing.JLabel label_retirarse;
    private javax.swing.JLabel manoC_1;
    private javax.swing.JLabel manoC_2;
    private javax.swing.JLabel manoC_3;
    private javax.swing.JLabel manoJ_1;
    private javax.swing.JLabel manoJ_2;
    private javax.swing.JLabel manoJ_3;
    private javax.swing.JPanel mano_crupier;
    private javax.swing.JPanel mano_jugador;
    private javax.swing.JLabel valor_mano_crupier;
    private javax.swing.JLabel valor_mano_jugador;

    private void cargarImagenesReverso() {
        manoC_1.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Cartas/Reverso.png")));
        manoC_2.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Cartas/Reverso.png")));
        manoC_3.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Cartas/Reverso.png")));
        manoJ_1.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Cartas/Reverso.png")));
        manoJ_2.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Cartas/Reverso.png")));
        manoJ_3.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Cartas/Reverso.png")));
    }

    public View_Bacarat() {
        initComponents();
        cargarImagenesReverso();
    }


    private void initComponents() {

        fondo = new javax.swing.JPanel();
        mano_crupier = new javax.swing.JPanel();
        manoC_3 = new javax.swing.JLabel();
        manoC_1 = new javax.swing.JLabel();
        manoC_2 = new javax.swing.JLabel();
        mano_jugador = new javax.swing.JPanel();
        manoJ_3 = new javax.swing.JLabel();
        manoJ_1 = new javax.swing.JLabel();
        manoJ_2 = new javax.swing.JLabel();
        aviso_mano_J = new javax.swing.JLabel();
        aviso_mano_C = new javax.swing.JLabel();
        boton_retirarse = new javax.swing.JPanel();
        label_retirarse = new javax.swing.JLabel();
        Boton_pedir = new javax.swing.JPanel();
        label_pedir = new javax.swing.JLabel();
        valor_mano_jugador = new javax.swing.JLabel();
        valor_mano_crupier = new javax.swing.JLabel();
        boton_salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



        fondo.setBackground(new java.awt.Color(255, 255, 255));

        mano_crupier.setBackground(new java.awt.Color(170, 255, 166));

        javax.swing.GroupLayout mano_crupierLayout = new javax.swing.GroupLayout(mano_crupier);
        mano_crupier.setLayout(mano_crupierLayout);
        mano_crupierLayout.setHorizontalGroup(
                mano_crupierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mano_crupierLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(manoC_1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(manoC_2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(manoC_3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mano_crupierLayout.setVerticalGroup(
                mano_crupierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mano_crupierLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mano_crupierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(manoC_3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(manoC_1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(manoC_2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addContainerGap())
        );

        mano_jugador.setBackground(new java.awt.Color(170, 255, 166));

        javax.swing.GroupLayout mano_jugadorLayout = new javax.swing.GroupLayout(mano_jugador);
        mano_jugador.setLayout(mano_jugadorLayout);
        mano_jugadorLayout.setHorizontalGroup(
                mano_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mano_jugadorLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(manoJ_1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(manoJ_2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(manoJ_3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        mano_jugadorLayout.setVerticalGroup(
                mano_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mano_jugadorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mano_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(manoJ_3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(manoJ_1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(manoJ_2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addContainerGap())
        );

        aviso_mano_J.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        aviso_mano_J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aviso_mano_J.setText("mano Jugador");

        aviso_mano_C.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        aviso_mano_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aviso_mano_C.setText("mano Crupier");

        boton_retirarse.setBackground(new java.awt.Color(153, 255, 255));

        label_retirarse.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        label_retirarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_retirarse.setText("Retirarse");
        label_retirarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label_retirarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_retirarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boton_retirarseLayout = new javax.swing.GroupLayout(boton_retirarse);
        boton_retirarse.setLayout(boton_retirarseLayout);
        boton_retirarseLayout.setHorizontalGroup(
                boton_retirarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_retirarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        boton_retirarseLayout.setVerticalGroup(
                boton_retirarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_retirarse, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Boton_pedir.setBackground(new java.awt.Color(153, 255, 255));

        label_pedir.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        label_pedir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_pedir.setText("Pedir carta");
        label_pedir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label_pedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_pedirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Boton_pedirLayout = new javax.swing.GroupLayout(Boton_pedir);
        Boton_pedir.setLayout(Boton_pedirLayout);
        Boton_pedirLayout.setHorizontalGroup(
                Boton_pedirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_pedir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        Boton_pedirLayout.setVerticalGroup(
                Boton_pedirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_pedir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        valor_mano_jugador.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        valor_mano_jugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor_mano_jugador.setText("ValorJ");

        valor_mano_crupier.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        valor_mano_crupier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor_mano_crupier.setText("ValorC");

        boton_salir.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/cerrar_sesion.png")));
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Boton_pedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(aviso_mano_C)
                                                        .addComponent(aviso_mano_J)))
                                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(mano_crupier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mano_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                .addComponent(boton_retirarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(valor_mano_jugador)
                                                        .addComponent(valor_mano_crupier))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(mano_crupier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(valor_mano_crupier))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aviso_mano_C)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(aviso_mano_J)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addComponent(valor_mano_jugador)
                                                .addGap(68, 68, 68)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(boton_retirarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Boton_pedir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())
                                        .addComponent(mano_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void label_pedirMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void label_retirarseMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {
        mf.musicaDeFondo(0);
        dispose();
        new Menu_principal();
    }
}
