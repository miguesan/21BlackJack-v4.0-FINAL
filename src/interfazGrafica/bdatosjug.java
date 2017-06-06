
package interfazGrafica;


import bases.blackjack.jugadoresConexion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro y Miguel (Con colaboracion de Alejandro, Mario y Omar)
 */
public class bdatosjug extends javax.swing.JFrame {
    
    jugadoresConexion obx = new jugadoresConexion();

    public bdatosjug() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Jugadores 21 BlackJack");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        conectar = new javax.swing.JButton();
        newjug = new javax.swing.JButton();
        visjug = new javax.swing.JButton();
        borrjug = new javax.swing.JButton();
        actjug = new javax.swing.JButton();
        formattabla = new javax.swing.JButton();
        guardarcerrar = new javax.swing.JButton();
        pargan = new javax.swing.JButton();
        parper = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabjugs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/ped90/Descargas/Telegram Desktop/21BJ/21BlackJackbas/2-card-21.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/ped90/Descargas/Telegram Desktop/21BJ/21BlackJackbas/Get ADABAS.png")); // NOI18N

        conectar.setText("Conectar");
        conectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conectarMouseClicked(evt);
            }
        });

        newjug.setText("Nuevo Jugador");
        newjug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newjugMouseClicked(evt);
            }
        });

        visjug.setText("Visualizar Jugadores");
        visjug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visjugMouseClicked(evt);
            }
        });

        borrjug.setText("Borrar Jugador");
        borrjug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrjugMouseClicked(evt);
            }
        });

        actjug.setText("Actualizar Jugador");
        actjug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actjugMouseClicked(evt);
            }
        });

        formattabla.setText("Formatear Tabla");
        formattabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formattablaMouseClicked(evt);
            }
        });

        guardarcerrar.setText("Guardar");
        guardarcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarcerrarMouseClicked(evt);
            }
        });

        pargan.setText("Actualizar Partidas Ganadas");
        pargan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parganMouseClicked(evt);
            }
        });

        parper.setText("Actualizar Partidas Perdidas");
        parper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parperMouseClicked(evt);
            }
        });

        menu.setText("Menú");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        tabjugs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "DNI", "Edad", "Ganadas", "Perdidas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabjugs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(newjug)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu)
                        .addGap(106, 106, 106)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visjug)
                        .addGap(76, 76, 76)
                        .addComponent(actjug)
                        .addGap(91, 91, 91)
                        .addComponent(borrjug))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pargan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parper)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formattabla, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardarcerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(conectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newjug)
                    .addComponent(visjug)
                    .addComponent(borrjug)
                    .addComponent(actjug)
                    .addComponent(formattabla))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarcerrar)
                    .addComponent(menu)
                    .addComponent(parper)
                    .addComponent(pargan))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectarMouseClicked
       
        obx.conectarBase();
                obx.driversBase();
    }//GEN-LAST:event_conectarMouseClicked

    private void newjugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newjugMouseClicked
        
        obx.cargaArray();
               obx.insertarJugadores();
    }//GEN-LAST:event_newjugMouseClicked

    private void visjugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visjugMouseClicked
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dni");
        modelo.addColumn("Edad");
        modelo.addColumn("Ganadas");
        modelo.addColumn("Perdidas");
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        datos=jugadoresConexion.buscar_tabla();
        for(int i =0;i<datos.size();i++){
            modelo.addRow(datos.get(i));
        }
            tabjugs.setModel(modelo);
    }//GEN-LAST:event_visjugMouseClicked

    private void borrjugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrjugMouseClicked
       
        obx.borrarJugador();
    }//GEN-LAST:event_borrjugMouseClicked

    private void actjugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actjugMouseClicked
        
        obx.actualizarJugador();
    }//GEN-LAST:event_actjugMouseClicked

    private void formattablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formattablaMouseClicked
      
        obx.formatearTabla();
    }//GEN-LAST:event_formattablaMouseClicked

    private void guardarcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarcerrarMouseClicked
        
        obx.cerrarBase();
    }//GEN-LAST:event_guardarcerrarMouseClicked

    private void parganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parganMouseClicked
        
        obx.actualizarGanadas();
    }//GEN-LAST:event_parganMouseClicked

    private void parperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parperMouseClicked
        
        obx.actualizarPerdidas();
    }//GEN-LAST:event_parperMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
       
        interfaz interf = new interfaz();
        this.setVisible(false);
        interf.setVisible(true);
    }//GEN-LAST:event_menuMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(bdatosjug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bdatosjug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bdatosjug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bdatosjug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bdatosjug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actjug;
    private javax.swing.JButton borrjug;
    private javax.swing.JButton conectar;
    private javax.swing.JButton formattabla;
    private javax.swing.JButton guardarcerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JButton newjug;
    private javax.swing.JButton pargan;
    private javax.swing.JButton parper;
    private javax.swing.JTable tabjugs;
    private javax.swing.JButton visjug;
    // End of variables declaration//GEN-END:variables
}
