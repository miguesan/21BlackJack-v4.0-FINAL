
package jugador.blackjack;
import blackjack.resultadoFinal;
import cpu.blackjack.cpuJuega;
import cpu.blackjack.parametrocpu;
import cpu.blackjack.robarCpuplantar;
import java.util.Random;
import libreria.milibreria;


public class jugadorJuega{
      
     
    public void numCartasJug(){
    milibreria carta = new milibreria();    
    Random rnd = new Random();
    
    for (int i = carta.getNewCard().length - 1; i > 0; i--){ //acede al array y te añade carta
        int index = rnd.nextInt(i + 1);
        int a = carta.getNewCard()[index];
        carta.getNewCard()[index] = carta.getNewCard()[i];
        carta.getNewCard()[i] = a;
    }
    
    System.out.println("Tienes un " + carta.getNewCard()[0] + " y un " + carta.getNewCard()[1] + "."); //muestra las cartas que tiene el jugador
        int playerTotal = carta.getNewCard()[0] + carta.getNewCard()[1];
        System.out.println("En total tus cartas suman " + playerTotal + "."); //muestra la suma de las cartas que tiene jugador
        System.out.println();
    
            if (playerTotal == 21){ //compara el numero en la suma de cartas si es igual a 21
                System.out.println("Blackjack, tu ganas :D "); //Muestra que ganas
               System.exit(0);
        }
            if (playerTotal > 21){ //compara el numero en las suma de cartas si es mayor a 21
                System.out.println("Te pasaste, tu pierdes :( "); //Muestra que te pasaste de 21 y pierdes
               System.exit(0); 
        }               
            
            parametrojug pj = new parametrojug(playerTotal);
            robarJugplantar tu1 = new robarJugplantar();
            parametrocpu pcpu = new parametrocpu();
            cpuJuega cpu = new cpuJuega();
            robarCpuplantar cpu1 = new robarCpuplantar();
            tu1.cuestion(pj);
            cpu.cartasCrupier(pcpu);
            cpu1.cuestion(pcpu, "C:\\Users\\Putodruida\\Documents\\NetBeansProjects\\Programacion\\21BlackJack-master\\21BJ.txt");
        }
    }


