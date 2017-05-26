
package cpu.blackjack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import libreria.milibreria;


public class robarCpuplantar{
    
    Scanner keyboard = new Scanner(System.in); 
    File fich;
    PrintWriter f=null;
    
    
    public void cuestion(parametrocpu cpu, String nomeFich){
        milibreria carta = new milibreria();
        Random rnd = new Random();
        int cc = rnd.nextInt(new milibreria().getNewCard().length-1); 
 
        System.out.println("Turno de la cpu "); //mensaje del turno de cpu
        System.out.println("La cpu roba una carta " + carta.getNewCard()[3] + "."); //mensaje de robo de carta del cpu

         
        while (cpu.getDealerTotal() < 21){ //Si la cpu tiene en su suma menos de 16 pide carta
            System.out.println();
            System.out.println("La cpu pide carta "); //mensaje de que roba carta
            System.out.println("La cpu roba un " + carta.getNewCard()[cc] + "."); //mensaje de la carta que roba la CPU
            cc++;
            cpu.setDealerTotal(cpu.getDealerTotal() + carta.getNewCard()[cc]);
            System.out.println();
            System.out.println("Su suma total es de " + cpu.getDealerTotal() +"."); //mensaje de que muestra la suma de carats de CPU
            
            if (cpu.getDealerTotal() > 21){ //Compara si la suma de CPU es mayor a 21
                System.out.println();
                System.out.println("La cpu se pasó, tú ganas"); // cpu se pasa y muestra que ganas
                try{
                    fich=new File(nomeFich);
                    f=new PrintWriter(fich);
                        f.println("La CPU perdió");
                }
                catch(FileNotFoundException ex){
                    System.out.println("Error Not Found 404"+ex.getMessage());
                }
                finally{
                    f.close();
                    System.exit(0);
                }
                System.exit(0);
            }
        }
    }
}
