public class EncapsulatedNFT {
    private double balance;
    private String owner;

    public EncapsulatedNFT(double _balance, String _owner){
        setOwner(_balance, _owner);
    }

    void setOwner(double _balance, String _owner){
        if(_balance > 1000 || _balance < 0)
            throw new IllegalArgumentException("The balance can not be less than 0 or greater than 1000");
        this.balance = _balance;
        this.owner = _owner;
    }

    public String toString(){
        return (owner + " balance : " + balance);
    }
}
