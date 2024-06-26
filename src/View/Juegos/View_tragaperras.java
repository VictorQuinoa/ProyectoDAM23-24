package View.Juegos;

import Model.Juegos.TragaPerras;
import Model.Musica.MusicaFondo;
import View.Menu_principal;
import View.Resultado_Juegos.ConThreads.Ruleta.DerrotaRule;
import View.Resultado_Juegos.ConThreads.Ruleta.VictoriaRule;
import View.Resultado_Juegos.ConThreads.Tragaperras.DerrotaSlot;
import View.Resultado_Juegos.ConThreads.Tragaperras.VictoriaSlot;

import javax.swing.*;

public class View_tragaperras extends javax.swing.JFrame {

    MusicaFondo mf = new MusicaFondo();
    private javax.swing.JPanel boton_girar;
    private static volatile boolean pararGiro;
    private static Thread threadT;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel cerrar_juego;
    private static javax.swing.JLabel primer_hueco;
    private static javax.swing.JLabel segundo_hueco;
    private static javax.swing.JLabel tercer_hueco;
    private javax.swing.JLabel label_boton;
    private Boolean bool;

    public View_tragaperras() {
        initComponents();
    }
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        cerrar_juego = new javax.swing.JLabel();
        primer_hueco = new javax.swing.JLabel();
        segundo_hueco = new javax.swing.JLabel();
        tercer_hueco = new javax.swing.JLabel();
        boton_girar = new javax.swing.JPanel();
        label_boton = new javax.swing.JLabel();

        ImageIcon imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));
        setIconImage(imagenTaskBar.getImage());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(new java.awt.Point(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 380));


        fondo.setBackground(new java.awt.Color(255, 255, 255));

        cerrar_juego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/cerrar_sesion.png"))); // NOI18N
        cerrar_juego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_Boton_cerrarMouseClicked(evt);
            }
        });

        boton_girar.setBackground(new java.awt.Color(153, 255, 153));
        boton_girar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_boton.setFont(new java.awt.Font("MathJax_Math", 0, 13)); // NOI18N
        label_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_boton.setText("Parar");
        label_boton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_boton_pararMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boton_girarLayout = new javax.swing.GroupLayout(boton_girar);
        boton_girar.setLayout(boton_girarLayout);
        boton_girarLayout.setHorizontalGroup(
                boton_girarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(boton_girarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        boton_girarLayout.setVerticalGroup(
                boton_girarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(boton_girarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(cerrar_juego, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addContainerGap(57, Short.MAX_VALUE)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boton_girar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addComponent(tercer_hueco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(primer_hueco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addComponent(segundo_hueco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cerrar_juego, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(primer_hueco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(segundo_hueco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tercer_hueco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(boton_girar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
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
                        .addGap(0, 319, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        //este do-while se usa para ir poniendo imagenes mientras no le des al boton

        // Inicializa el hilo
         threadT = new Thread(() -> {
            int i = 1;
            while (!pararGiro) {
                if (i == 6)
                    i = 1;
                primer_hueco.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + i + ".png")));
                segundo_hueco.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + (i + 1) + ".png")));
                tercer_hueco.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + (i + 2) + ".png")));
                i++;
                try {
                    Thread.sleep(50); // Pausa por medio segundo
                } catch (InterruptedException e) {
                    break; // Salir del bucle si el hilo es interrumpido
                }
            }
        });
        threadT.start(); // Inicia el hilo

        pack();
    }

    private void label_Boton_cerrarMouseClicked(java.awt.event.MouseEvent evt) {
        mf.musicaDeFondo(0);
        threadT.interrupt(); // Interrumpe el hilo cuando se cierra el juego
        dispose();
        new Menu_principal();
    }

    private void label_boton_pararMouseClicked(java.awt.event.MouseEvent evt) {
        pararGiro = true;
        try{
            threadT.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TragaPerras tp = new TragaPerras();
        String[] resultado = tp.girar();
        primer_hueco.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + getImageIndex(resultado[0]) + ".png")));
        segundo_hueco.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + getImageIndex(resultado[1]) + ".png")));
        tercer_hueco.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + getImageIndex(resultado[2]) + ".png")));

        if(tp.verificarResultado(resultado))
            new VictoriaSlot();
        else
            new DerrotaSlot();
    }

    // Método para reiniciar (y pararlo cuando la ventana está abierta) el hilo
    public static void reiniciarHilo() {
        pararGiro = true; // Detener el hilo actual

        // Esperar a que el hilo actual termine
        try {
            threadT.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //inicia un nuevo hilo
        threadT = new Thread(() -> {
                int i = 1;
                while (!pararGiro) {
                    if (i == 6)
                        i = 1;
                    primer_hueco.setIcon(new ImageIcon(View_tragaperras.class.getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + i + ".png")));
                    segundo_hueco.setIcon(new ImageIcon(View_tragaperras.class.getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + (i + 1) + ".png")));
                    tercer_hueco.setIcon(new ImageIcon(View_tragaperras.class.getResource("/Decorativos/Imagenes/Tragaperras/Tragaperras" + (i + 2) + ".png")));
                    i++;
                try {
                    Thread.sleep(100); // pausa de 100 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        pararGiro = false;
        threadT.start();
    }

    private int getImageIndex(String simbolo) {
        switch (simbolo) {
            case "Cereza":
                return 7;
            case "Campana":
                return 1;
            case "Limón":
                return 4;
            case "Siete":
                return 5;
            case "Pica":
                return 6;
            case "Diamante":
                return 8;
            case "Moai":
                return 2;
            case "Uva":
                return 3;
            default:
                return Integer.parseInt(null);
        }
    }
}



