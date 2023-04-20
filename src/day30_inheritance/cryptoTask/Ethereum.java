package day30_inheritance.cryptoTask;

public class Ethereum extends  CryptoToken{

    public Ethereum(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }

}