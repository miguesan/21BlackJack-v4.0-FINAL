
package interfazGrafica;

public class instruciones extends javax.swing.JFrame {

    /**
 *
 * @author Pedro y Miguel (Con colaboracion de Alejandro, Mario y Omar)
 */
    public instruciones() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Intrucciones 21 Black Jack");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("LEER ATENTAMENTE:\n\nEste juego consiste en mediante las cartas que te\ndamos tienes que sumar 21 en total, claramente no en la primera\nmano tendrás 21 (puede ser posible, eso es tener suerte).Una vez\nque te demos las 2 primeras cartas verás el resultado reflejado en la\nconsolapodrás cojer carta para seguir sumando y obtener 21 o si ves\nque tienes buena mano plantarte y ver si tu oponente se planta\no se rinde. \n\nRecuerda no puedes pasarte de 21 si no pierdes la partida ni tampoco\nquedar por debajo de tu oponente intenta siempre llegar a 21 o lo más\naproximado que puedas. Sé más listo que tu oponente.\n\nBASE DE DATOS:\n\nCon la base de datos los jugadores podrán saber cuantas partidas han \nperdido y por supuesto ganado. Tambén puedes ver si tus compañeros \nhan progresado en el juego.\nPara poder usar esta base de datos tienes que pulsar primero el botón de Conectar \nasí podrás usar la base de datos.\n\nTWITTER:\n\nPuedes twittearen tu cuenta un estado predeterminado para que tus amigos\nvean que estás jugando a este juegazo y darles envidia. \nPara poder conectarte solo necesitas introducir las token de tu cuenta en el archivo\nque se encuentra en el directorio del proyecto. \nPara ello visita la página web:\n\nhttps://dev.twitter.com/\n\nCreas una app nueva y buscas el apartado de tokens, apareceran 3, las copias y las pegas \nen el archivo twitter4j.properties que tienes en la carpeta del proyecto. ");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Menú");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/ped90/Descargas/Telegram Desktop/21BJ/21BlackJackbas/blackjack-solo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        interfaz interf = new interfaz();
        this.setVisible(false);
        interf.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(instruciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instruciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instruciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instruciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instruciones().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
