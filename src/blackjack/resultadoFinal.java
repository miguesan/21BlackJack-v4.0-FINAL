
package blackjack;

import jugador.blackjack.parametrojug;
import cpu.blackjack.parametrocpu;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class resultadoFinal {
    
    PrintWriter añade;
    FileWriter fich;
    
    
    public void resultado(parametrojug jug, parametrocpu cru, String nomFich){
       
        System.out.println();
        System.out.println("El crupier tiene un total de -> " + cru.getDealerTotal()); //Muestra las cartas del crupier desde la clase cpuJuega
        System.out.println("Tu tienes un total de -> " + jug.getPlayerTotal()); //Muestra las cartas del crupier desde la clase jujadorJuega
        System.out.println();

        if (cru.getDealerTotal() > jug.getPlayerTotal()){ //compara las "cartas" obtenidas entre el Jugador y el Crupier y muestra el resultado (crupuer gana)
            System.out.println("¡El crupier gana! :( ");
        } 
        if (cru.getDealerTotal() == jug.getPlayerTotal()){ //compara las "cartas" obtenidas entre el Jugador y el Crupier y muestra el resultado (empate)
            System.out.println("Oh... nadie gana, quedasteis empatados o.O ");
        }
        if (cru.getDealerTotal() < jug.getPlayerTotal()){ //compara las "cartas" obtenidas entre el Jugador y el Crupier y muestra el resultado (Jugador gana)
            System.out.println("¡¡¡¡Tú ganas!!!! :D ");
        }
    }
        public void archivo(parametrojug jug, parametrocpu cru, String nomFich){    
            try{
                añade=new PrintWriter(new FileWriter(nomFich,true));
                añade.println(cru);
                añade.println(jug);
            }catch(IOException ex){
                System.out.println("Error"+ex.getMessage());
            }
            finally{
                añade.close();
            }
    
        }
    }
    

