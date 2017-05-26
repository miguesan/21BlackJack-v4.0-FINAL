
package cpu.blackjack;

import java.util.Random;
import libreria.milibreria;

public class cpuJuega{

    public void cartasCrupier(parametrocpu cpu){
        milibreria carta = new milibreria();
        Random rnd = new Random();
    
    for (int i = carta.getNewCard().length - 1; i > 0; i--){ //acede al array y te añade carta
        int index = rnd.nextInt(i + 1);
        int a = carta.getNewCard()[index];
        carta.getNewCard()[index] = carta.getNewCard()[i];
        carta.getNewCard()[i] = a;
    }
    
    System.out.println("El Crupier roba un " + carta.getNewCard()[2]+ " y lo muestra, y una carta oculta."); //muestra la carta que tiene el crupier y otra oculta
        int dealerTotal = carta.getNewCard()[2] + carta.getNewCard()[3]; //Suma de las cartas que tiene crupier
        if (dealerTotal > 21){     //compara el numero en la suma de cartas si es mayor a 21
            System.out.println();
            System.out.println("La cpu tiene en total de " + cpu.getDealerTotal() + "."); //muestra la suma de las cartas que tiene crupier
            System.out.println("La cpu se pasa, tú ganas :D "); //Muestra el mensaje de que crupier se pasa de 21 y tu ganas
            System.exit(0);
        }
        if (dealerTotal == 21){  //compara el numero en la suma de cartas si es igual a 21
            System.out.println();
            System.out.println("La cpu muestra su segunda carta, un " + carta.getNewCard()[3] + ".");  //Muestra la segunda carta obtenida por el crupier
            System.out.println("La cpu tiene en total de " + cpu.getDealerTotal() + "."); //Muestra el total de cartas del crupier
            System.out.println();
            System.out.println("La cpu tiene BlackJack, perdiste :( "); //Muestra que pierdes
            System.out.println("¿Te vas a dejar ganar por una caja tonta? ");
            System.exit(0);
        }
            System.out.println("Su total esta oculto");
            System.out.println();
    
    }
}

