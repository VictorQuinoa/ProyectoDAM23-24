package View.Juegos;


import View.Menu_principal;

import javax.swing.*;

public class View_Rule extends javax.swing.JFrame {
    private javax.swing.JLabel aviso_inserciones;
    private String colores[] = {"negro", "rojo", "verde"};
    private javax.swing.JLabel boton_salir;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imagen_de_rule;
    private javax.swing.JTextField insercion_numero;
    private javax.swing.JLabel labelApostar;
    private javax.swing.JPanel label_boton_parar;
    private javax.swing.JSeparator linea_insercion;
    private javax.swing.JLabel numero_rule;

    public View_Rule() {
        initComponents();
    }

    private void initComponents() {

        fondo = new javax.swing.JPanel();
        boton_salir = new javax.swing.JLabel();
        imagen_de_rule = new javax.swing.JLabel();
        numero_rule = new javax.swing.JLabel();
        aviso_inserciones = new javax.swing.JLabel();
        insercion_numero = new javax.swing.JTextField();
        linea_insercion = new javax.swing.JSeparator();
        label_boton_parar = new javax.swing.JPanel();
        labelApostar = new javax.swing.JLabel();

        ImageIcon imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));
        setIconImage(imagenTaskBar.getImage());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        boton_salir.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/cerrar_sesion.png")));
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
        });

        imagen_de_rule.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        numero_rule.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        numero_rule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_rule.setText("0");
        numero_rule.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        aviso_inserciones.setFont(new java.awt.Font("Rockwell Nova", 0, 12)); // NOI18N
        aviso_inserciones.setText("Escoja un número del 0 al 36");

        insercion_numero.setBorder(null);
        insercion_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insercion_numeroActionPerformed(evt);
            }
        });

        linea_insercion.setForeground(new java.awt.Color(0, 0, 0));

        label_boton_parar.setBackground(new java.awt.Color(204, 255, 204));
        label_boton_parar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelApostar.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        labelApostar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApostar.setText("Apostar");
        labelApostar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_apostarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout label_boton_pararLayout = new javax.swing.GroupLayout(label_boton_parar);
        label_boton_parar.setLayout(label_boton_pararLayout);
        label_boton_pararLayout.setHorizontalGroup(
                label_boton_pararLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelApostar, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        label_boton_pararLayout.setVerticalGroup(
                label_boton_pararLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelApostar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(196, 196, 196)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(label_boton_parar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(imagen_de_rule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(aviso_inserciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(insercion_numero)
                                                        .addComponent(linea_insercion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(217, 217, 217)
                                                .addComponent(numero_rule, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imagen_de_rule, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addComponent(aviso_inserciones)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(insercion_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(linea_insercion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero_rule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(label_boton_parar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
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
        Thread thread = new Thread(() -> {
            int i = 0;
            int j = 0;
            String[] colores = {"Rojo", "Negro", "Verde"};
            while (true) {
                if (j == 18) {
                    imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/" + colores[2] + ".png")));
                    j = 0; // la pone a 0 para que vuelva a empezar el ciclo
                } else {
                    imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/" + colores[i] + ".png")));
                    i = (i + 1) % 2; // permite alternar entre rojo y negro
                    j++;
                }
                try {
                    Thread.sleep(100); // Pausa por 0,2 segundo
                } catch (InterruptedException e) {
                    break; // Salir del bucle si el hilo es interrumpido
                }
            }
        });
        thread.start();

        pack();
    }

    private void insercion_numeroActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void label_apostarMouseClicked(java.awt.event.MouseEvent evt) {
        int nApostado = Integer.valueOf(insercion_numero.getText());

    }

    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        new Menu_principal();
    }



}
