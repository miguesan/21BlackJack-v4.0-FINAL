
package jugador.blackjack;

import cpu.blackjack.parametrocpu;
import java.util.Random;
import java.util.Scanner;
import libreria.milibreria;

public class robarJugplantar extends jugadorJuega{
    
    Scanner keyboard = new Scanner(System.in);
    
    
    public void cuestion(parametrojug jug){
        Random rnd = new Random();
        int cc = rnd.nextInt(new milibreria().getNewCard().length-1); 
        
        milibreria carta = new milibreria();
        
        
        System.out.print("Que quieres hacer \"carta\" o \"pasar\"? "); //pregunta si quieres robar carta o pasar
        String robarPlantar = keyboard.next(); //introduces tu decision por teclado
        System.out.println();
    
        if (robarPlantar.equalsIgnoreCase("carta")){ //si pides carte
            
            while (jug.getPlayerTotal() < 21 && robarPlantar.equalsIgnoreCase("carta")){ 
                if (robarPlantar.equalsIgnoreCase("carta")){ //robas carta
                    System.out.println("Cogiste un " + carta.getNewCard()[cc] + "."); //muestra que cogiste
                    jug.setPlayerTotal(jug.getPlayerTotal() + carta.getNewCard()[cc]); //suma lo que tenias antes con la nueva 
                    System.out.println("Tu suma total es de " + jug.getPlayerTotal() + "."); //muestra la suma
                    System.out.println();
                    cc++;        
                    
                    if (jug.getPlayerTotal() > 21){ //compara si la nueva suma es mayor a 21
                        System.out.println("Te pasaste, tu pierdes :( "); // muestra que te pasaste y perdiste
                        System.exit(0);
                    }
                    if (jug.getPlayerTotal() == 21){ //compara si la nueva suma es igual a 21
                        System.out.println("Tienes Blackjack, tu ganas :D"); //muestra que tienes BlacJack y ganaste
                        System.exit(0);
                    }
                    System.out.print("Que quieres hacer \"carta\" o \"pasar\"? "); //pregunta si quieres robar carta o pasar
                    robarPlantar = keyboard.next(); //introduces tu decision por teclado
                    System.out.println();
                    
                }
            }        
        }
    }
}
