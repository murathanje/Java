public class StandartTicket extends Ticket{

    double price;

    public StandartTicket(int _seatNumber, int _number){
        super(_seatNumber, _number);
        price = 10;
    }

    @Override
    public void print() {
        System.out.println("SeatNumber: " + seatNumber + " Number " + number);
        
    }

    @Override
    public double computePrice() {
        return price;
    }
    
}
