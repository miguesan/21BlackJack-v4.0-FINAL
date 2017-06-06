
package bases.blackjack;

/**
 *
 * @author Pedro y Miguel (Con colaboracion de Alejandro, Mario y Omar)
 */
public class parametrosjugs {
     String nombre, apellidos,dni,edad;
     String partidasg, partidasp;
     int id;

    public parametrosjugs() {
    }
    
    public parametrosjugs(int id, String nombre, String apellidos, String dni, String edad, String partidasg, String partidasp) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.partidasg = partidasg;
        this.partidasp = partidasp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
