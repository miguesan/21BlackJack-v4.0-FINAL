/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.blackjack;

import interfazGrafica.bdatosJug;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class jugadoresConexion {
    
     
    parametrosjugs jug = new parametrosjugs ();
    ArrayList<parametrosjugs >lista = new ArrayList<>();

    private Connection conectar;
    ResultSet result;
    private final String ruta ="/home/ped90/Descargas/Telegram Desktop/bj/jugadoreslista.db";
    
    public void cargaArray(){
        
            lista.add(new parametrosjugs (
            Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ID:")),
            JOptionPane.showInputDialog("Inserta el Nombre"),
            JOptionPane.showInputDialog("Inserta el Apellido "),
            JOptionPane.showInputDialog("Inserta el DNI"),
            JOptionPane.showInputDialog("Inserta la Edad"),
            JOptionPane.showInputDialog("Inserta las Partidas Ganadas"),
            JOptionPane.showInputDialog("Inserta las Partidas Perdidas")));
            
    }
    
    public void driversBase(){
        
        try {
            Class.forName("org.sqlite.JDBC");
                    } catch (ClassNotFoundException ex) {
            System.out.println("DRIVERS NOT FOUND: "+ex.getMessage());
        }
        
    }
    
    public void conectarBase(){
        
        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:"+ruta);
            System.out.println("La conexión se ha realizado correctamente a la ruta:"+ruta);
        } catch (SQLException ex) {
            System.out.println("Error de conexión verifique si la ruta está indicada correctamente: "+ex.getMessage()+" a "+ruta);
        }
        
    }
    
    public void insertarJugadores(){
        
        try {
            PreparedStatement ps = conectar.prepareStatement("Insert into jugadores(ID, Nombre, Apellidos, DNI, Edad, Partidasg, Partidasp) values(?,?,?,?,?,?,?)");
            ps.setInt(1,lista.get(lista.size()-1).getId());
            ps.setString(2,lista.get(lista.size()-1).getNombre());
            ps.setString(3,lista.get(lista.size()-1).getApellidos());
            ps.setString(4,lista.get(lista.size()-1).getDni());
            ps.setString(5,lista.get(lista.size()-1).getEdad());
            ps.setString(6,lista.get(lista.size()-1).getPartidasg());
            ps.setString(7,lista.get(lista.size()-1).getPartidasp());
            ps.execute();
                System.out.println("Jugador añadido con éxito");
        } catch (SQLException ex) {
            System.out.println("Fallo del sistema al insertar :"+ex.getMessage());
        }
        
    }
    
    public void visualizarJugadores(){
        
        try {
            PreparedStatement ver = conectar.prepareStatement("Select * from Jugadores");
           result = ver.executeQuery();
           while(result.next()){
               System.out.println("ID "+":"+ result.getInt("ID"));
               System.out.println("Nombre  "+":"+ result.getString("Nombre"));
               System.out.println("Apellidos "+" :"+result.getString("Apellidos"));
               System.out.println("Dni"+" :"+result.getString("DNI"));
               System.out.println("Edad"+" :"+result.getInt("Edad"));
               System.out.println("Partidas ganadas"+" :"+result.getInt("Partidasg"));
               System.out.println("Partidas perdidas"+" :"+result.getInt("Partidasp"));
               System.out.println();
           }
        } catch (SQLException ex) {
            System.out.println("Error al leer  la Base de Datos: "+ex.getMessage());
        }
        
    }
    
    public void borrarJugador(){
        
        Integer id=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número del ID para borrar el jugador:")); 
        try{ 
            Statement st = conectar.createStatement(); 
            st.execute("delete from Jugadores where id="+id.toString()); 
            System.out.println("Fila borrada con éxito"); 
        }catch(SQLException ex){ 
            System.out.println("Error al borrar la fila, compruebe que ha introducido bien el DNI: "+ex.getMessage()); 
        }
        
    }
    
    public void actualizarGanadas(){ 
        Integer id=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ID para actualizar la ficha del jugador deseado:")); 
        Integer pg=Integer.parseInt(JOptionPane.showInputDialog("Actualize las partidas que ha ganado:")); 
       try{ 
            PreparedStatement actualiza = conectar.prepareStatement("update Jugadores set partidasg="+pg.toString()+" where id="+id.toString());
                actualiza.execute();
                System.out.println("Registro actualizado");    
        }catch(SQLException ex){ 
            System.out.println("Error al actualizar el registro, verifique que ha introducido bien los datos a actualizar: "+ex.getMessage());
        }
       
    }
    
    public void actualizarPerdidas(){ 
        Integer id=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ID para actualizar la ficha del jugador deseado:")); 
        Integer pg=Integer.parseInt(JOptionPane.showInputDialog("Actualize las partidas que ha perdido:")); 
       try{ 
            PreparedStatement actualiza = conectar.prepareStatement("update Jugadores set partidasp="+pg.toString()+" where id="+id.toString());
                actualiza.execute();
                System.out.println("Registro actualizado");                       
        }catch(SQLException ex){ 
            System.out.println("Error al actualizar el registro, verifique que ha introducido bien los datos a actualizar: "+ex.getMessage());
        }
       
    }
    
    public void actualizarJugador(){ 
        Integer id=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su ID de usuario para actualizar los campos:")); 
        String nom=JOptionPane.showInputDialog("Inserte el nombre a actualizar:"); 
        String ape=JOptionPane.showInputDialog("Inserte el apellido a actualizar:"); 
        String dni=JOptionPane.showInputDialog("Inserte el DNI a actualizar:"); 
        String eda=JOptionPane.showInputDialog("Inserte la edad a actualizar:"); 
       try{ 
            PreparedStatement actualiza = conectar.prepareStatement("update jugadores set nombre='"+nom+"',apellidos='"+ape+"',dni='"+dni+"',edad='"+eda+"'where id="+id.toString());
                actualiza.execute();
                System.out.println("Registro actualizado"); 
        }catch(SQLException ex){ 
            System.out.println("Error al actualizar el registro, verifique que ha introducido bien los datos a actualizar: "+ex.getMessage());
        }
       
    }
    
    public void formatearTabla(){
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null,"Esta seguro de que desea formatear la tabla?","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION){

        try {
        PreparedStatement borracom = conectar.prepareStatement("delete from jugadores");
        borracom.execute();
        System.out.println("Tabla formateada");

        } catch(SQLException ex){ 
            System.out.println("Error al formatear la tabla: "+ex.getMessage());
        }
        
       }else{
            System.out.println("Cancelado por el usuario");
        }
    }
    
    public void cerrarBase(){
        
        try {
                conectar.close();
                System.out.println("Seguridad: Base de datos cerrada con éxito.");
            } catch (SQLException ex) {
                Logger.getLogger(bdatosJug.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
}
