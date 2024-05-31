
package View.Juegos;

public class View_Black_Bacarat extends javax.swing.JFrame {

    public View_Black_Bacarat() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        mano_jugador = new javax.swing.JPanel();
        cartaJ_1 = new javax.swing.JLabel();
        cartaJ_3 = new javax.swing.JLabel();
        cartaJ_2 = new javax.swing.JLabel();
        mano_IA = new javax.swing.JPanel();
        cartaC_3 = new javax.swing.JLabel();
        cartaC_1 = new javax.swing.JLabel();
        cartaC_2 = new javax.swing.JLabel();
        boton_carta = new javax.swing.JPanel();
        label_pedir = new javax.swing.JLabel();
        boton_rendirse = new javax.swing.JPanel();
        label_retirarse = new javax.swing.JLabel();
        valor_manoJ = new javax.swing.JLabel();
        valor_manoC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        cartaJ_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartaJ_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartaJ_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mano_jugadorLayout = new javax.swing.GroupLayout(mano_jugador);
        mano_jugador.setLayout(mano_jugadorLayout);
        mano_jugadorLayout.setHorizontalGroup(
                mano_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mano_jugadorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cartaJ_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(cartaJ_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cartaJ_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
        );
        mano_jugadorLayout.setVerticalGroup(
                mano_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mano_jugadorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mano_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cartaJ_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cartaJ_1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(cartaJ_2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addContainerGap())
        );

        cartaC_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartaC_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartaC_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mano_IALayout = new javax.swing.GroupLayout(mano_IA);
        mano_IA.setLayout(mano_IALayout);
        mano_IALayout.setHorizontalGroup(
                mano_IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mano_IALayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cartaC_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(cartaC_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(mano_IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mano_IALayout.createSequentialGroup()
                                        .addContainerGap(136, Short.MAX_VALUE)
                                        .addComponent(cartaC_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134)))
        );
        mano_IALayout.setVerticalGroup(
                mano_IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mano_IALayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mano_IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cartaC_3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(cartaC_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(mano_IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mano_IALayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(cartaC_2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        boton_carta.setBackground(new java.awt.Color(102, 204, 255));
        boton_carta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_pedir.setFont(new java.awt.Font("MathJax_Math", 0, 13)); // NOI18N
        label_pedir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_pedir.setText("Pedir carta");
        label_pedir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout boton_cartaLayout = new javax.swing.GroupLayout(boton_carta);
        boton_carta.setLayout(boton_cartaLayout);
        boton_cartaLayout.setHorizontalGroup(
                boton_cartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(boton_cartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_pedir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        boton_cartaLayout.setVerticalGroup(
                boton_cartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(boton_cartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_pedir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        boton_rendirse.setBackground(new java.awt.Color(102, 204, 255));
        boton_rendirse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_retirarse.setFont(new java.awt.Font("MathJax_Math", 0, 13)); // NOI18N
        label_retirarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_retirarse.setText("Retirarse");
        label_retirarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout boton_rendirseLayout = new javax.swing.GroupLayout(boton_rendirse);
        boton_rendirse.setLayout(boton_rendirseLayout);
        boton_rendirseLayout.setHorizontalGroup(
                boton_rendirseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(boton_rendirseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_retirarse, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        boton_rendirseLayout.setVerticalGroup(
                boton_rendirseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(boton_rendirseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_retirarse, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        valor_manoJ.setText("Valor manoJ");

        valor_manoC.setText("Valor manoC");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(mano_IA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addComponent(boton_carta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(mano_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(boton_rendirse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(valor_manoC)
                                        .addComponent(valor_manoJ))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addComponent(mano_IA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valor_manoC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(valor_manoJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mano_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boton_rendirse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_carta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 615, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 460, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JPanel boton_carta;
    private javax.swing.JPanel boton_rendirse;
    private javax.swing.JLabel cartaC_1;
    private javax.swing.JLabel cartaC_2;
    private javax.swing.JLabel cartaC_3;
    private javax.swing.JLabel cartaJ_1;
    private javax.swing.JLabel cartaJ_2;
    private javax.swing.JLabel cartaJ_3;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel label_pedir;
    private javax.swing.JLabel label_retirarse;
    private javax.swing.JPanel mano_IA;
    private javax.swing.JPanel mano_jugador;
    private javax.swing.JLabel valor_manoC;
    private javax.swing.JLabel valor_manoJ;
    // End of variables declaration
}
