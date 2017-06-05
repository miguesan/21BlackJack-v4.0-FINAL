/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.blackjack;

import interfazGrafica.bdatosjug;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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

    static Connection conectar;
    static ResultSet result;
    static Statement sentencia;
    static ResultSetMetaData resultadometa;
    static String ruta ="/home/ped90/Descargas/Telegram Desktop/21BJ/jugadoreslista.db";
    
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
    
    public static void conectarBase(){
        
        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:"+ruta);
            JOptionPane.showMessageDialog(null,"La conexión se ha realizado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexión verifique si la ruta está indicada correctamente: "+ex.getMessage()+" a "+ruta);
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
                JOptionPane.showMessageDialog(null,"Jugador añadido con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Fallo del sistema al insertar :"+ex.getMessage());
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
            JOptionPane.showMessageDialog(null,"Fila borrada con éxito"); 
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null,"Error al borrar la fila, compruebe que ha introducido bien el DNI: "+ex.getMessage()); 
        }
        
    }
    
    public void actualizarGanadas(){ 
        Integer id=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ID para actualizar la ficha del jugador deseado:")); 
        Integer pg=Integer.parseInt(JOptionPane.showInputDialog("Actualize las partidas que ha ganado:")); 
       try{ 
            PreparedStatement actualiza = conectar.prepareStatement("update Jugadores set partidasg="+pg.toString()+" where id="+id.toString());
                actualiza.execute();
                JOptionPane.showMessageDialog(null,"Registro actualizado");    
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null,"Error al actualizar el registro, verifique que ha introducido bien los datos a actualizar: "+ex.getMessage());
        }
       
    }
    
    public void actualizarPerdidas(){ 
        Integer id=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ID para actualizar la ficha del jugador deseado:")); 
        Integer pg=Integer.parseInt(JOptionPane.showInputDialog("Actualize las partidas que ha perdido:")); 
       try{ 
            PreparedStatement actualiza = conectar.prepareStatement("update Jugadores set partidasp="+pg.toString()+" where id="+id.toString());
                actualiza.execute();
                JOptionPane.showMessageDialog(null,"Registro actualizado");                       
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null,"Error al actualizar el registro, verifique que ha introducido bien los datos a actualizar: "+ex.getMessage());
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
                JOptionPane.showMessageDialog(null,"Registro actualizado"); 
        }catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null,"Error al actualizar el registro, verifique que ha introducido bien los datos a actualizar: "+ex.getMessage());
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
        JOptionPane.showMessageDialog(null,"Tabla formateada");

        } catch(SQLException ex){ 
            JOptionPane.showMessageDialog(null,"Error al formatear la tabla: "+ex.getMessage());
        }
        
       }else{
            JOptionPane.showMessageDialog(null,"Cancelado por el usuario");
        }
    }
    
    public void cerrarBase(){
        
        try {
                conectar.close();
                JOptionPane.showMessageDialog(null,"Seguridad: Base de datos guardada y cerrada con éxito.");
            } catch (SQLException ex) {
                Logger.getLogger(bdatosjug.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
     public static ArrayList<Object[]> buscar_tabla(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        try {
            PreparedStatement ver = conectar.prepareStatement("Select * from Jugadores");
           result = ver.executeQuery();
            System.out.println("Correcto");
        } catch (SQLException ex) {
            System.out.println("Error al leer la base de datos"+ex.getMessage());
        }
        try {
            while(result.next()){
                Object[] filas = new Object[7];
                for(int i = 0;i<7;i++){
                    filas[i]= result.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (SQLException ex) {
            System.out.println("Fatal error"+ex.getMessage());
        }
        return datos;
    
    }
    
}
