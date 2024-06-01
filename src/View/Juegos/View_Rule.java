package View.Juegos;


import Model.Juegos.Ruleta;
import Model.Musica.MusicaFondo;
import View.Menu_principal;
import View.Resultado_Juegos.ConThreads.Derrota;
import View.Resultado_Juegos.ConThreads.Victoria;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class View_Rule extends javax.swing.JFrame {

    //los atributos estáticos son necesarios para poder implementar un método que está más adelante
    MusicaFondo mf = new MusicaFondo();
    private static Thread thread;
    private static volatile boolean detenerHilo = false;
    private javax.swing.JComboBox<String> apuestas_por_color;
    private javax.swing.JLabel aviso_inserciones;
    private javax.swing.JLabel aviso_inserciones1;
    private javax.swing.JLabel boton_numero;
    private javax.swing.JLabel boton_salir;
    private javax.swing.JPanel fondo;
    private static javax.swing.JLabel imagen_de_rule;
    private javax.swing.JTextField insercion_numero;
    private javax.swing.JLabel label_boton_color;
    private javax.swing.JPanel label_boton_numero;
    private javax.swing.JPanel label_boton_parar_color;
    private javax.swing.JSeparator linea_insercion;
    private static javax.swing.JLabel numero_rule;

    public View_Rule() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        boton_salir = new javax.swing.JLabel();
        imagen_de_rule = new javax.swing.JLabel();
        numero_rule = new javax.swing.JLabel();
        aviso_inserciones = new javax.swing.JLabel();
        insercion_numero = new javax.swing.JTextField();
        linea_insercion = new javax.swing.JSeparator();
        label_boton_numero = new javax.swing.JPanel();
        boton_numero = new javax.swing.JLabel();
        apuestas_por_color = new javax.swing.JComboBox<>();
        aviso_inserciones1 = new javax.swing.JLabel();
        label_boton_parar_color = new javax.swing.JPanel();
        label_boton_color = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ImageIcon imagenTaskBar = new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Menus_Iconos/Icono.jpg"));
        setIconImage(imagenTaskBar.getImage());

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        boton_salir.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Botones_menu_principal/cerrar_sesion.png")));
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
        });

        imagen_de_rule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_rule.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        numero_rule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_rule.setText("0");
        numero_rule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        aviso_inserciones.setFont(new java.awt.Font("Rockwell Nova", 0, 12)); // NOI18N
        aviso_inserciones.setText("Escoja un número del 0 al 36");

        insercion_numero.setBorder(null);


        linea_insercion.setForeground(new java.awt.Color(0, 0, 0));

        label_boton_numero.setBackground(new java.awt.Color(204, 255, 204));
        label_boton_numero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        boton_numero.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        boton_numero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_numero.setText("Apostar por número");
        boton_numero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_numeroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout label_boton_numeroLayout = new javax.swing.GroupLayout(label_boton_numero);
        label_boton_numero.setLayout(label_boton_numeroLayout);
        label_boton_numeroLayout.setHorizontalGroup(
                label_boton_numeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boton_numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        label_boton_numeroLayout.setVerticalGroup(
                label_boton_numeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boton_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        apuestas_por_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verde", "Rojo", "Negro"}));


        aviso_inserciones1.setFont(new java.awt.Font("Rockwell Nova", 0, 12)); // NOI18N
        aviso_inserciones1.setText("Escoja un color");

        label_boton_parar_color.setBackground(new java.awt.Color(204, 255, 204));
        label_boton_parar_color.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_boton_color.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        label_boton_color.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_boton_color.setText("Apostar por color");
        label_boton_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_boton_colorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout label_boton_parar_colorLayout = new javax.swing.GroupLayout(label_boton_parar_color);
        label_boton_parar_color.setLayout(label_boton_parar_colorLayout);
        label_boton_parar_colorLayout.setHorizontalGroup(
                label_boton_parar_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_boton_color, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        label_boton_parar_colorLayout.setVerticalGroup(
                label_boton_parar_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_boton_color, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label_boton_parar_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(label_boton_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(apuestas_por_color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(aviso_inserciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addComponent(imagen_de_rule, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(aviso_inserciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(insercion_numero)
                                                        .addComponent(linea_insercion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(219, 219, 219)
                                                .addComponent(numero_rule, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
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
                                                .addComponent(linea_insercion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addComponent(aviso_inserciones1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(apuestas_por_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero_rule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_boton_parar_color, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_boton_numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
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
    // hilo que hace que se mueva el número y la imagen
         thread = new Thread(() -> {
            int i = 0;
            int j = 0;
            String[] colores = {"Rojo", "Negro", "Verde"};
            while (!detenerHilo) {
                if (j == 18) {
                    imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/" + colores[2] + ".png")));
                    numero_rule.setText("0"); // Verde corresponde a 0
                    j = 0; // la pone a 0 para que vuelva a empezar el ciclo
                } else {
                    imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/" + colores[i] + ".png")));
                    if (i == 0) { // Rojo
                        int numeroImpar = generarNumeroImpar();
                        numero_rule.setText(String.valueOf(numeroImpar));
                    } else { // Negro
                        int numeroPar = generarNumeroPar();
                        numero_rule.setText(String.valueOf(numeroPar));
                    }
                    i = (i + 1) % 2; // permite alternar entre rojo y negro
                    j++;
                }
                try {
                    Thread.sleep(100); // pausa de 100 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        pack();
    }

    private void label_boton_colorMouseClicked(MouseEvent evt) {
        //la bandera que hace que el hilo se detenga
        detenerHilo = true;
        try{
            //método para parar el cíclo del hilo
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Ruleta rule = new Ruleta();
        rule.girarRuleta();
        //obtenemos el String del ComboBox
        String apuestaColor = String.valueOf(apuestas_por_color.getSelectedItem());
        //ponemos el número aleatorio en la pantalla
        numero_rule.setText(String.valueOf(rule.getNumero()));
        //condiciones para poner una imagen u otra
        if(rule.getNumero() == 0)
            imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/verde.png")));
        else if(rule.getNumero() % 2 == 0)
            imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/negro.png")));
        else
            imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/rojo.png")));
        //condición que mira si el color es igual o no
        if(rule.getColor().equals(apuestaColor))
            new Victoria();
        else
            new Derrota();
    }

    private void boton_numeroMouseClicked(java.awt.event.MouseEvent evt) {
        try{
            //Si el número es inválido lo elimina
            if(insercion_numero.getText().isEmpty() || Integer.valueOf(insercion_numero.getText()) < 0 || Integer.valueOf(insercion_numero.getText()) > 36 ){
                insercion_numero.setText("");
                return;
            }
            //excepción que salta si pones letras en vez de enteros
        }catch (NumberFormatException e){
            new mal_puesto_ruleta();
            return;
        }
        //la bandera que hace que el hilo se detenga
        detenerHilo = true;
        //nos aseguramos que el hilo se detiene
        try{
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //nuevo objeto para poder empezar el juego
        Ruleta rule = new Ruleta();
        int numeroDeApuesta = Integer.valueOf(insercion_numero.getText());
        insercion_numero.setText("");
        rule.girarRuleta();

        //ponemos el nº en el label para que el usuario lo pueda ver
        numero_rule.setText(String.valueOf(rule.getNumero()));
        //condiciones que sirven para poner el cuadrado correspondiente
        if(rule.getNumero() == 0)
            imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/verde.png")));
        else if(rule.getNumero() % 2 == 0)
            imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/negro.png")));
        else
            imagen_de_rule.setIcon(new ImageIcon(getClass().getResource("/Decorativos/Imagenes/Ruleta/rojo.png")));

        //condición final que compara si ganas o pierdes y determina que ventana se tiene que abrir
        if(rule.getNumero() == numeroDeApuesta){
            new Victoria();
        }else{
            new Derrota();
        }
    }

    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {
        mf.musicaDeFondo(0);
        dispose();
        new Menu_principal();
    }

    //método para poner un número impar insignificante en el label de debajo de las imágenes para simular que se mueve
    private static int generarNumeroImpar() {
        int numero;
        do {
            numero = (int) (Math.random() * 37); // genera un número del 0 al 36
        } while (numero == 0 || numero % 2 == 0); // repite si es 0 o par
        return numero;
    }

    //método para poner un número par insignificante en el label de debajo de las imágenes para simular que se mueve
    private static int generarNumeroPar() {
        int numero;
        do {
            numero = (int) (Math.random() * 37); // genera un número del 0 al 36
        } while (numero == 0 || numero % 2 != 0); // repite si es 0 o impar
        return numero;
    }
    // Método para reiniciar (y pararlo cuando la ventana está abierta) el hilo
    public static void reiniciarHilo() {
        detenerHilo = true; // Detener el hilo actual

        // Esperar a que el hilo actual termine
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //inicia un nuevo hilo
        thread = new Thread(() -> {
            int i = 0;
            int j = 0;
            String[] colores = {"Rojo", "Negro", "Verde"};
            while (!detenerHilo) {
                if (j == 18) {
                    imagen_de_rule.setIcon(new ImageIcon(View_Rule.class.getResource("/Decorativos/Imagenes/Ruleta/" + colores[2] + ".png")));
                    numero_rule.setText("0"); // Verde corresponde a 0
                    j = 0; // la pone a 0 para que vuelva a empezar el ciclo
                } else {
                    imagen_de_rule.setIcon(new ImageIcon(View_Rule.class.getResource("/Decorativos/Imagenes/Ruleta/" + colores[i] + ".png")));
                    if (i == 0) { // Rojo
                        int numeroImpar = generarNumeroImpar();
                        numero_rule.setText(String.valueOf(numeroImpar));
                    } else { // Negro
                        int numeroPar = generarNumeroPar();
                        numero_rule.setText(String.valueOf(numeroPar));
                    }
                    i = (i + 1) % 2; // permite alternar entre rojo y negro
                    j++;
                }
                try {
                    Thread.sleep(100); // pausa de 100 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        detenerHilo = false;
        thread.start();
}
}
