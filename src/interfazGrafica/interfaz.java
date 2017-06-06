
package interfazGrafica;


import java.util.Random;
import libreria.milibreria;
import social.twitter.twittear;
import static interfazGrafica.ejecucion.textoImp;

/**
 *
 * @author Pedro y Miguel (Con colaboracion de Alejandro, Mario y Omar)
 */

public class interfaz extends javax.swing.JFrame { 
    twittear twitt = new twittear();
    milibreria carta = new milibreria(); 
    StringBuilder sb = new StringBuilder();
    static int playerTotal;
    static int cpuTotal;
    

    public int getPlayerTotal() {
        return playerTotal;
    }

    public static void setPlayerTotal(int playerTotal) {
        interfaz.playerTotal = playerTotal;
    }

    public static int getCpuTotal() {
        return cpuTotal;
    }

    public static void setCpuTotal(int cpuTotal) {
        interfaz.cpuTotal = cpuTotal;
    }
    
    
    public interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("21 Black Jack");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aceptarReto = new javax.swing.JButton();
        noGracias = new javax.swing.JButton();
        botpartidas = new javax.swing.JButton();
        botinstruc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        aceptarReto.setText("Acepto el Reto");
        aceptarReto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarRetoActionPerformed(evt);
            }
        });

        noGracias.setText("Salir");
        noGracias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noGraciasActionPerformed(evt);
            }
        });

        botpartidas.setText("Partidas Jugadores");
        botpartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botpartidasMouseClicked(evt);
            }
        });

        botinstruc.setText("Instrucciones");
        botinstruc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botinstrucMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("CREADORES:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Miguel Sánchez");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Pedro José Argibay");

        jButton1.setText("Twittear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/ped90/Descargas/Telegram Desktop/21BJ/21BlackJackbas/twitter-128.png")); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/ped90/Descargas/Telegram Desktop/21BJ/21BlackJackbas/blackjack_logo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aceptarReto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(botpartidas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(botinstruc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(noGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarReto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botpartidas)
                    .addComponent(jButton1)
                    .addComponent(botinstruc)
                    .addComponent(noGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noGraciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noGraciasActionPerformed

        System.exit(0);
    }//GEN-LAST:event_noGraciasActionPerformed

    private void aceptarRetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarRetoActionPerformed
    ejecucion ejecu = new ejecucion();
    this.setVisible(false);
    ejecu.setVisible(true);milibreria carta = new milibreria();    
        Random rnd = new Random();
        for (int i = carta.getNewCard().length - 1; i > 0; i--){ 
        int index = rnd.nextInt(i + 1);
        int a = carta.getNewCard()[index];
        carta.getNewCard()[index] = carta.getNewCard()[i];
        carta.getNewCard()[i] = a;
    }
        sb.append("COMIENZA EL JUEGO\n");
        sb.append("*** Juega el Jugador ***\n");
        sb.append("Tienes un " + carta.getNewCard()[0] + " y un " + carta.getNewCard()[1] + ".\n");
        playerTotal = carta.getNewCard()[0] + carta.getNewCard()[1];
        sb.append("En total tus cartas suman " + playerTotal + ".\n"); 
        
    
            if (playerTotal == 21){
                sb.append("Blackjack, tu ganas :D ");
               System.exit(0);
        }
            if (playerTotal > 21){ 
                sb.append("Te pasaste, tu pierdes :( "); 
               System.exit(0); 
        }
            sb.append("Que quieres hacer \"carta\" o \"pasar\"? \n\n");
       
        textoImp.append(sb.toString());

    }//GEN-LAST:event_aceptarRetoActionPerformed

    private void botpartidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botpartidasMouseClicked

        bdatosjug base = new bdatosjug();
        this.setVisible(false);
        base.setVisible(true);
    }//GEN-LAST:event_botpartidasMouseClicked

    private void botinstrucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botinstrucMouseClicked
        instruciones instru = new instruciones();
        
        this.setVisible(false);
        instru.setVisible(true);
    }//GEN-LAST:event_botinstrucMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        twitt.publicarEstadoTwitter();
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }
    
    public static void main(){

    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton aceptarReto;
    private javax.swing.JButton botinstruc;
    private javax.swing.JButton botpartidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton noGracias;
    // End of variables declaration//GEN-END:variables
}
