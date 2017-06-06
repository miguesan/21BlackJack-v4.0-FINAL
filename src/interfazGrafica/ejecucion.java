
package interfazGrafica;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

import libreria.milibreria;

/**
 *
 * @author Pedro y Miguel (Con colaboracion de Alejandro, Mario y Omar)
 */
public class ejecucion extends javax.swing.JFrame {

        StringBuilder sb = new StringBuilder();
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();
        int cc = rnd.nextInt(new milibreria().getNewCard().length-1); 
        milibreria carta = new milibreria();
        interfaz interf = new interfaz();

        
         File fich;
        PrintWriter f=null;
         String nomeFich;
        

    public ejecucion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("¡Comienza el Juego!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoImp = new javax.swing.JTextArea();
        pedirCarta = new javax.swing.JButton();
        pasarTurno = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        volverJugar = new javax.swing.JButton();
        meRindo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 0, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("¡Comienza el Juego!");

        textoImp.setColumns(20);
        textoImp.setRows(25);
        jScrollPane1.setViewportView(textoImp);

        pedirCarta.setText("Carta");
        pedirCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedirCartaMouseClicked(evt);
            }
        });

        pasarTurno.setText("Pasar");
        pasarTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasarTurnoMouseClicked(evt);
            }
        });

        pregunta.setText("¿Que quieres hacer?");

        volverJugar.setText("Volver a Jugar");
        volverJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverJugarMouseClicked(evt);
            }
        });

        meRindo.setText("Me Rindo");
        meRindo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meRindoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pedirCarta)
                                    .addComponent(pasarTurno))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pregunta)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(volverJugar)
                                    .addComponent(meRindo))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pedirCarta)
                        .addGap(18, 18, 18)
                        .addComponent(pasarTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverJugar)
                        .addGap(18, 18, 18)
                        .addComponent(meRindo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverJugarMouseClicked
        interfaz interf = new interfaz();
        interf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverJugarMouseClicked

    private void meRindoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meRindoMouseClicked
       
        this.setVisible(false);
        JOptionPane.showMessageDialog(null,"Menudo Gallina");
        System.exit(0);
    }//GEN-LAST:event_meRindoMouseClicked

    private void pedirCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedirCartaMouseClicked

                     sb.append("Cogiste un " + carta.getNewCard()[cc] + ".\n"); 
                   interf.setPlayerTotal(interf.getPlayerTotal() + carta.getNewCard()[cc]); 
                     sb.append("Tu suma total es de " + interf.getPlayerTotal()+ ".\n");
                    cc++;        
                    
                    if (interf.getPlayerTotal() > 21){
                        this.setVisible(false);
                         JOptionPane.showMessageDialog(null, "Tienes en total " +interf.getPlayerTotal()+"\nTe pasaste, tu pierdes :( ");
                         System.exit(0);
                    }
                    if (interf.getPlayerTotal() == 21){
                        this.setVisible(false);
                         JOptionPane.showMessageDialog(null, "Tienes en total " +interf.getPlayerTotal()+"\nTienes Blackjack, tu ganas :D");
                        System.exit(0);
                    }
                    System.out.println();
     
                
                    
        
              textoImp.append(sb.toString());  
    }//GEN-LAST:event_pedirCartaMouseClicked

    private void pasarTurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasarTurnoMouseClicked
        
        sb.append("COMIENZA EL JUEGO\n");
        sb.append("*** Juega la CPU ***\n");  
        
        for (int i = carta.getNewCard().length - 1; i > 0; i--){ 
        int index = rnd.nextInt(i + 1);
        int a = carta.getNewCard()[index];
        carta.getNewCard()[index] = carta.getNewCard()[i];
        carta.getNewCard()[i] = a;
    }
    
     sb.append("La CPU roba un " + carta.getNewCard()[2]+ ", lo muestra y mantiene \noculta la segunda carta.");
        interf.setCpuTotal(carta.getNewCard()[2] + carta.getNewCard()[3]); 
        textoImp.append(sb.toString()); 
        if (interf.getCpuTotal() > 21){
            this.setVisible(false);
             JOptionPane.showMessageDialog(null, "La CPU tiene en total de " +interf.getCpuTotal()+"\nLa cpu se pasa, tú ganas :D ");
            System.exit(0);
        }
        if (interf.getCpuTotal() == 21){
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "La cpu muestra su segunda carta, es un " + carta.getNewCard()[3] +"\n" +"La CPU tiene en total de " +interf.getCpuTotal()+"\n."+"\nLa cpu tiene BlackJack, perdiste :( ");
           JOptionPane.showMessageDialog(null,"¿Te vas a dejar ganar por una caja tonta? ");
           System.exit(0);
        }
            sb.append("\nSu total esta oculto");
            textoImp.append(sb.toString()); 
           if (interf.getCpuTotal() < 21){
               
               do{
             sb.append("La cpu pide carta "); 
             sb.append("La cpu roba un " + carta.getNewCard()[cc] + ".\n");
            cc++;
            interf.setCpuTotal(interf.getCpuTotal() + carta.getNewCard()[cc]);
            sb.append("Su suma total es de " + interf.getCpuTotal() +".\n");
            
           }while(interf.getCpuTotal() < 19);
               
             if(interf.getCpuTotal()>=interf.getPlayerTotal() && interf.getCpuTotal()<=20){
                 this.setVisible(false);
                 JOptionPane.showMessageDialog(null,"La cpu gana por superarte y no pasarse con un total de "+interf.getCpuTotal()+ ", CPU gana" );
             }
             if (interf.getCpuTotal()==21){
                 this.setVisible(false);
                JOptionPane.showMessageDialog(null, "La cpu tiene un total de "+interf.getCpuTotal()+  ", tiene BlackJack, CPU gana");
             }
             if (interf.getCpuTotal()>21){
                 this.setVisible(false);
                 JOptionPane.showMessageDialog(null,"La cpu se pasó, tiene "+interf.getCpuTotal()+ ", tú ganas" );
             }
             
         }
           if (interf.getPlayerTotal() == interf.getCpuTotal()){
               this.setVisible(false);
        JOptionPane.showMessageDialog(null,"La cpu tiene "+  interf.getCpuTotal()+ " y el jugador "+  interf.getPlayerTotal()+ " \n EMPATE" );
                
    } textoImp.append(sb.toString()); 
             System.exit(0);
    }//GEN-LAST:event_pasarTurnoMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejecucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton meRindo;
    private javax.swing.JButton pasarTurno;
    private javax.swing.JButton pedirCarta;
    private javax.swing.JLabel pregunta;
    public static javax.swing.JTextArea textoImp;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton volverJugar;
    // End of variables declaration//GEN-END:variables
}
