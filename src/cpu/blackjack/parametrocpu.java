
package cpu.blackjack;

public class parametrocpu {
    
    int dealerTotal;

    public parametrocpu(int dealerTotal) {
        this.dealerTotal = dealerTotal;
    }

    public parametrocpu() {
    }

    public int getDealerTotal() {
        return dealerTotal;
    }

    public void setDealerTotal(int dealerTotal) {
        this.dealerTotal = dealerTotal;
    }

    @Override
    public String toString() {
        return "parametros{" + "dealerTotal=" + dealerTotal + '}';
    }
    
    
    
}
