public abstract class Ticket {
    public int number;
    int seatNumber;

    public Ticket(int _seatNumber, int _number){
        number = _number;
        seatNumber = _seatNumber;
    }


    public abstract void print();

    public abstract double computePrice();
}
