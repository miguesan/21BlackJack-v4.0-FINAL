
package jugador.blackjack;

public class parametrojug {
    
    int playerTotal;

    public parametrojug() {
    }

    public parametrojug(int playerTotal) {
        this.playerTotal = playerTotal;
    }

    public int getPlayerTotal() {
        return playerTotal;
    }

    public void setPlayerTotal(int playerTotal) {
        this.playerTotal = playerTotal;
    }

    @Override
    public String toString() {
        return "parametros{" + "playerTotal=" + playerTotal + '}';
    }
    
    
    
}
