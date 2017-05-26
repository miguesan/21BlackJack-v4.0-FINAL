/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.blackjack;

/**
 *
 * @author ped90
 */
public class parametrosjugs {
     String nombre, apellidos,dni,edad;
     String partidasg, partidasp;

    public parametrosjugs() {
    }

    public parametrosjugs(String nombre, String apellidos, String dni, String edad, String partidasg, String partidasp) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.partidasg = partidasg;
        this.partidasp = partidasp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPartidasg() {
        return partidasg;
    }

    public void setPartidasg(String partidasg) {
        this.partidasg = partidasg;
    }

    public String getPartidasp() {
        return partidasp;
    }

    public void setPartidasp(String partidasp) {
        this.partidasp = partidasp;
    }

    @Override
    public String toString() {
        return "parametrosjugs{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad + ", partidasg=" + partidasg + ", partidasp=" + partidasp + '}';
    }

   
    
}
