
package social.twitter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Pedro y Miguel (Con colaboracion de Alejandro, Mario y Omar)
 */
public class twittear {
    private static Twitter twitter = TwitterFactory.getSingleton();

    
    public void publicarEstadoTwitter(){
        List<Status> statuses=null;
        try {
            Status status = twitter.updateStatus("Jugando al 21 BlackJack desde NetBeans, prúebalo "
                    + "Creado por: Pedro Argibay y Miguel Sánchez");
            System.out.println("Actualizó correctamente el estado a [" + status.getText() + "].");
        } catch (TwitterException ex) {
            Logger.getLogger(twittear.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
