/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import bases.blackjack.jugadoresConexion;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class bdatosJug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jugadoresConexion obx = new jugadoresConexion();
        
        int opcion;
        int opcion2;
         do{
         opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Conexión de la Base de Datos. \n2) Insertar Jugador nuevo. \n3) Visualizar Jugadores."
                                                                                                 + " \n4) Borrar Jugador.  \n5) Actualizar Jugador.  \n6) Actualizar Partidas. \n7) Formatear Partidas. \n8) Cerrar Base de datos. \n9) Iniciar el Juego. \n0) Salir del programa."));
         switch(opcion){
            case 1:
                obx.conectarBase();
                obx.driversBase();
                break;
            case 2:
               obx.cargaArray();
               obx.insertarJugadores();
                break;
            case 3:
                obx.visualizarJugadores();
                break;
            case 4:
                obx.borrarJugador();
                break;
            case 5:
                obx.actualizarJugador();
                break;
            case 6:
                do{
                    opcion2= Integer.parseInt(JOptionPane.showInputDialog("1)Actualizar Partidas ganadas. \n2)Actualizar Partidas perdidas. \n0)Atrás."));
                    switch(opcion2){
                        case 1:
                            obx.actualizarGanadas();
                            break;
                        case 2:
                            obx.actualizarPerdidas();
                            break;
                    }
                }while(opcion2!=0);  
                break;
            case 7:
                obx.formatearTabla();
                break;
            case 8:
                obx.cerrarBase();
                break;
            case 9:
                interfaz.main();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse para salir del programa");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
        }
    }while(opcion!=0);
    }
    
    
}
    

